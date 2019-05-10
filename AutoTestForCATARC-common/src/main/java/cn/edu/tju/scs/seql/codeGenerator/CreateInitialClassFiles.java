package cn.edu.tju.scs.seql.codeGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CreateInitialClassFiles {

    private GetModuleInheritance moduleInheritance;;
    private ReadTestCasesFromXML readTestCase;
    private List<TestCasePojo> testCaseList;
    private boolean coverFiles = false; // 生成文件时是否覆盖文件
    private String projectName;

    public CreateInitialClassFiles(String projectName) {
        super();
        this.projectName = projectName;
        moduleInheritance = new GetModuleInheritance();
        readTestCase = new ReadTestCasesFromXML(projectName + "_Test_Cases.xml");
        testCaseList = readTestCase.getTestCaseList();
    }

    /**
     * 为该项目创建文件
     */
    public void createFiles() {
        String basePath = System.getProperty("user.dir");
        String basePackagePath = basePath + "/src/test/java/cn/edu/tju/scs/seql/" + projectName;
        String packageName = "cn.edu.tju.scs.seql." + projectName;// auto_ELV";
        File f = new File(basePackagePath);
        f.mkdirs();
        for (TestCasePojo testCase : testCaseList) {
            ModulePojo module = moduleInheritance.findModule(testCase.getModule());
            String fullPath = "/" + getLegalModuleName(module.getModuleName());
            String tmpPackageName = "." + getLegalModuleName(module.getModuleName());
            while (module.getParentModule() != null) {
                module = module.getParentModule();
                fullPath = "/" + getLegalModuleName(module.getModuleName()) + fullPath;
                tmpPackageName = "." + getLegalModuleName(module.getModuleName()) + tmpPackageName;
                File tmpf = new File(basePackagePath + fullPath);
                if(module.getParentModule() == null)
                    tmpf.mkdirs();
            }
            testCase.setFullPath(basePackagePath + fullPath);
            testCase.setPackageName(packageName + tmpPackageName);
            createPackageElementEnumFile(testCase);
            createTestCase(testCase);
        }
        createTestNgXMLFile(projectName);
        String str;
    }

    public String getLegalModuleName(String originalModuleName){
        return originalModuleName.replace("(#", "_").replace(")", "")
                .replaceAll("\\.", "_")
                .replaceAll("-", "_")
                .replaceAll("、", "_");
    }

    /**
     * 切分csv文件，防止数据中包含逗号的情况
     * @param str
     * @return
     */
    private String[] splitCsv(String str){
        List<String> list = new ArrayList<String>();
        String[] s = str.split(",");
        String temp = "";
        for(int i = 0;i < s.length;i++){
            if(temp == ""){
                temp = s[i];
                if(!temp.startsWith("\"")){
                    list.add(temp);
                    temp = "";
                }
            }else if(temp.startsWith("\"") && !temp.endsWith("\"")){
                temp += ","+s[i];
                if(temp.startsWith("\"") && temp.endsWith("\"")){
                    list.add(temp);
                    temp = "";
                }
            }
        }
        String[] result = new String[list.size()];
        for(int i = 0;i < list.size();i++){
            result[i] = list.get(i).replaceAll("\"", "");
        }
        return result;
    }

    private int createPackageElementEnumFile(TestCasePojo testCase) {
        String testCaseName = testCase.getTestCaseClassName();
        String fullPath = testCase.getFullPath();
        String packageName = testCase.getPackageName();
        String[] strs = packageName.split("\\.");
        String packageLastName = strs[strs.length - 1];
//		System.out.println(testCaseName);
        File f = new File(fullPath + "/ElementEnum_" + packageLastName + ".java");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
//			if (!coverFiles)
//				return 1;
        }

        String template = TemplateManager
                .getTemplateString(System.getProperty("user.dir") + "/templates/ElementEnumTemplate.txt");
        template = template.replaceAll("\\$\\{packageName\\}", packageName);
        template = template.replaceAll("\\$\\{className\\}", "ElementEnum_" + packageLastName);

        StringBuffer enumList = new StringBuffer();
        File inputElementsFile = new File(testCase.getFullPath() + "/Elements_" + packageLastName + ".csv");

        if (inputElementsFile.exists()) {
            Scanner cin = null;
            try {
                FileInputStream inputStream = new FileInputStream(inputElementsFile);
                cin = new Scanner(inputStream, "GBK");//"UTF-8");
                cin.nextLine();
                while (cin.hasNext()) {
                    String str = cin.nextLine();
//					System.out.println(str);
                    String[] split = splitCsv(str);
                    if (split.length == 3) {
                        enumList.append(",\n\t" + split[0] + "(ByEnum." + split[1] + ",\"" + split[2] + "\")");
                    }
                }
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }finally {
                if(cin != null)cin.close();
            }
        }else{
            try {
                inputElementsFile.createNewFile();
                FileOutputStream csvOutput = new FileOutputStream(inputElementsFile);
                csvOutput.write("测试元素名,搜索方式(ById/ByLinkText/ByPartialLinkText/ByName/ByTagName/ByXPath/ByClassName/ByCssSelector),页面元素名\n".getBytes("GBK"));
                csvOutput.write("一级目录名称,ById,menu7_a\n".getBytes("GBK"));
                csvOutput.write("二级目录名称,ByCssSelector,#m7_1 > a\n".getBytes("GBK"));
                csvOutput.write("leftFrame,ByName,leftFrame\n".getBytes("GBK"));
                csvOutput.write("rightFrame,ByName,FrameRight\n".getBytes("GBK"));
                csvOutput.flush();
                csvOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        template = template.replaceAll("\\$\\{enumList\\}", enumList.toString());

        String str = "";
        FileInputStream input = null;

        try {
            input = new FileInputStream(f);
            Scanner scanner = new Scanner(input);

            while (scanner.hasNextLine()){
                str = str + scanner.nextLine() + "\n";
            }

        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if (str.equals(template)){
            return 0;
        }



        try {
            FileOutputStream output = new FileOutputStream(f);
            output.write(template.getBytes("UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    private void createTestNgXMLFile(String projectName) {
        File f = new File(System.getProperty("user.dir") + "/" + projectName + "_testng.xml");
        String template = TemplateManager
                .getTemplateString(System.getProperty("user.dir") + "/templates/TestngTemplate.txt");

        StringBuffer buffer = new StringBuffer();
//		for (TestCasePojo testCase : testCaseList) {
//			buffer.append(
//					"<class name=\"" + testCase.getPackageName() + "." + testCase.getTestCaseClassName() + "\"/>\n");
//		}
        Map<String, List<TestCasePojo>> testMap = new HashMap<>();
        for(TestCasePojo testCase: testCaseList){
            String key = testCase.getModule();
            if(!testMap.containsKey(key)){
                List<TestCasePojo> list = new ArrayList<>();
                testMap.put(key, list);
            }
            testMap.get(key).add(testCase);
        }
        for(String key : testMap.keySet()){
            List<TestCasePojo> list = testMap.get(key);
            buffer.append("<test verbose=\"0\" name=\""+list.get(0).getModule()+"\">\n");
            buffer.append("<classes>\n");
            for(TestCasePojo testCase: list){
                buffer.append(
                        "<class name=\"" + testCase.getPackageName() + "." + testCase.getTestCaseClassName() + "\"/>\n");
            }
            buffer.append("</classes>\n");
            buffer.append("</test>\n");
        }

        template = template.replaceAll("\\$\\{classList\\}", "");
        template = template.replaceAll("\\$\\{testList\\}", buffer.toString());



        try {
            FileOutputStream output = new FileOutputStream(f);
            output.write(template.getBytes("UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 根据测试用例名字，类文件所在路径，所属包名生成对应的测试类文件
     *
     * @return
     */
    public int createTestCase(TestCasePojo testCase) {
        String testCaseName = testCase.getTestCaseClassName();
        String fullPath = testCase.getFullPath();
        String packageName = testCase.getPackageName();
//		System.out.println(testCaseName);
        File f = new File(fullPath + "/" + testCaseName + ".java");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            if (!coverFiles)
                return 1;
        }
        String template = TemplateManager
                .getTemplateString(System.getProperty("user.dir") + "/templates/TestCaseTemplate.txt");
        template = template.replaceAll("\\$\\{packageName\\}", packageName);
        template = template.replaceAll("\\$\\{className\\}", testCaseName);
        template = template.replaceAll("\\$\\{classDescription\\}", testCase.getDescriptionForClass());
        template = template.replaceAll("\\$\\{descriptionStr\\}", testCase.getDescriptionStr());
        String[] strs = packageName.split("\\.");
        String packageLastName = strs[strs.length - 1];
        template = template.replaceAll("\\$\\{ElementEnumClass\\}", "ElementEnum_" + packageLastName);


        try {
            FileOutputStream output = new FileOutputStream(f);
            output.write(template.getBytes("UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        CreateInitialClassFiles main = new CreateInitialClassFiles("auto_LIMS");
        main.createFiles();
    }

}
