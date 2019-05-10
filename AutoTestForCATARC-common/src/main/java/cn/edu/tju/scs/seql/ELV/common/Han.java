package cn.edu.tju.scs.seql.ELV.common;

import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLSentence;
import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLWord;
import com.hankcs.hanlp.dependency.CRFDependencyParser;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Han {
    public static HSSFWorkbook loadExl() {
        File fi = new File(System.getProperty("user.dir") + "\\segment.xls");
        POIFSFileSystem fs = null;
        try {
            fs = new POIFSFileSystem(new FileInputStream(fi));
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        //读取excel模板
        HSSFWorkbook wb = null;
        try {
            wb = new HSSFWorkbook(fs);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return wb;
    }

    /*public static void buildExcel(Vector<Vector<String>> tuples) {
        HSSFWorkbook wb = loadExl();
        HSSFSheet sheet = wb.getSheetAt(0);
        *//*Random random = new Random();*//*
        HSSFCell cell;
        for (int i = 0; i < tuples.size(); i++) {
            HSSFRow row = sheet.createRow(2 + i);
            cell = row.createCell(0);
            cell.setCellValue(tuples.get(i).get(0));
            cell = row.createCell(1);
            cell.setCellValue(tuples.get(i).get(1));
            cell = row.createCell(2);
            cell.setCellValue(tuples.get(i).get(2));
            cell = row.createCell(3);
            cell.setCellValue(tuples.get(i).get(3));
            cell = row.createCell(4);
            cell.setCellValue(tuples.get(i).get(4));
        }
        try {
            FileOutputStream out = new FileOutputStream("测试用例_" + getTime() + ".xls");
            wb.write(out);
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/
    public static void buildExcel(Vector<String> segments, String name){
        HSSFWorkbook wb = loadExl();
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFCell cell;
        for (int i = 0; i < segments.size(); i++) {
            HSSFRow row = sheet.createRow(i);
            cell = row.createCell(0);
            cell.setCellValue(segments.get(i));
        }
        try {
            FileOutputStream out = new FileOutputStream("segment_" + name + ".xls");
            wb.write(out);
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getTime() {
        Date nowTime = new Date();
        SimpleDateFormat time = new SimpleDateFormat("yyyyMMddHHmmss");
        return time.format(nowTime).toString();
    }

    public static String getTestCaseName(String str) {
        Scanner scanner = new Scanner(str);
        return scanner.nextLine().split(" ")[1];
    }

    public static Vector<String> getSteps(String str) {
        Vector<String> steps = new Vector<>();
        int i = 0;
        Scanner scanner = new Scanner(str);
        while (scanner.hasNext()) {
            i++;
            String line;
            line = scanner.nextLine();
            if (i > 5) {
                steps.add(line);
            }
        }
        return steps;
    }

    public static String getStepName(String str) {
        String stepName;
        stepName = str.split("\\.")[0];
        return stepName;
    }

    public static String getOperation(String str) {
        String opration, stepName;
        //stepName = getStepName(str);
        opration = str.replaceAll("。", "");
        opration = opration.replaceAll(" ", "");
        opration = opration.split("\\.")[1];
        return opration;
    }

    public static Vector<String> getSegment(String str) {
        Vector<String> segments = new Vector<>();
        String[] segmentsArray;
        segmentsArray = str.split("，");
        for (int i = 0; i < segmentsArray.length; i++) {
            segments.add(segmentsArray[i]);
        }
        return segments;
    }

    public static CoNLLWord getAction(CoNLLWord[] words) {
        CoNLLWord action = null;
        for (int i = 0; i < words.length; i++) {
            if (words[i].HEAD == CoNLLWord.ROOT&&"v".equals(words[i].POSTAG)) {
                return words[i];
            }
        }
        //compare head the most times appeared

        if (action == null) {
            List<Integer> headIdList = getHeadId(words);
            System.out.println(headIdList);
            for (Integer headId : headIdList) {
                if(headId==0)
                    continue;
                else if ("v".equals(words[headId-1].POSTAG))
                {
                    return words[headId-1];
                }
            }

        }
        return action;
    }
    public static List<Integer> getHeadId(CoNLLWord[] words) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < words.length; i++) {
            if (countMap.get(words[i].HEAD.ID) == null) {
                countMap.put(words[i].HEAD.ID, 1);
            } else {
                int countVal = countMap.get(words[i].HEAD.ID);
                countMap.put(words[i].HEAD.ID, ++countVal);
            }
        }

        List arrayList = new ArrayList(countMap.entrySet());
        Collections.sort(arrayList, new Comparator() {
            public int compare(Object o1, Object o2) {
                Map.Entry obj1 = (Map.Entry) o1;
                Map.Entry obj2 = (Map.Entry) o2;
                return ((Integer) obj2.getValue()).compareTo((Integer) obj1.getValue());
            }
        });
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i++) {
            Map.Entry e = (Map.Entry) arrayList.get(i);
            result.add((Integer) e.getKey());
        }
        return result;
    }
    public static String getData(CoNLLWord[] words) {
         /*CoNLLWord action = getAction(words);*/
        String data = "";

        for (int i = 0; i < words.length; i++) {

            //: data is the last of the :
            if ("：".equals(words[i].LEMMA) || "p".equals(words[i].POSTAG)) {
                for (int j = i + 1; j < words.length; j++) {
                    data += words[j].LEMMA;
                }
                break;
            }
            else if (words[i].POSTAG == "m") {
                data = words[i].LEMMA + words[i].HEAD.LEMMA;
            }
        }
        return data.replace("：", "");
    }
    public static String getTarget(CoNLLWord action, CoNLLWord[] words, String data, String str) {

        String target = str;
        int countActionChild=0;
        for (int i = 0; i <words.length ; i++) {
            if (words[i].HEAD.ID == action.ID) {
                countActionChild++;
            }
        }
        for (int i = 0; i < words.length; i++) {
            //找到核心词汇下面为V的分支
            if (words[i].HEAD.ID == action.ID && "v".equals(words[i].POSTAG)) {

                //if root has more than 1
                if(countActionChild!=1&&"v".equals(words[i].CPOSTAG)){
                    //删除V为首下支
                    for (int j = 0; j < words.length; j++) {
                        if (words[j].HEAD.ID == words[i].ID) {
                            target = target.replace(words[j].LEMMA, "");
                        }
                        target = target.replace(words[i].LEMMA, "");
                    }
                }
                else if (countActionChild==1&&"vn".equals(words[i].CPOSTAG)) {
                    if (!"v".equals(words[i].CPOSTAG)) {
                        target=target.replaceAll(words[i].LEMMA,"");
                    }

                }

            }
            target = target.replace(data, "").replace(action.LEMMA, "");
            if (target == null || "".equals(target)) {
                target = str.replace(data, "").replace(action.LEMMA, "");
            }
        }
        return target;


    }
    public static Vector<String> tokens(String str) {
        CoNLLSentence sentence = CRFDependencyParser.compute(str);
        CoNLLWord[] words = sentence.getWordArray();
        String action = "", target = "", data = "";
        int start = 0;
        CoNLLWord actionObject = getAction(words);
        action=actionObject.LEMMA;
        data=getData(words);
        target=getTarget(actionObject,words, data, str);
        Vector<String> tuples = new Vector<String>();
        tuples.add(action);
        tuples.add(target);
        tuples.add(data);
        return tuples;

    }

    public static Vector<String> stepDesToTokens(String stepDesc){
        String[] steps = stepDesc.split("\n");
        Vector<String> res = new Vector<>();
        for(int i=5;i<steps.length;i=i+2){
            res.add(getOperation(steps[i]));
        }
        return res;
    }

    /**
     * 获取测试预期
     * @param stepDesc
     * @return
     */
    public static Vector<String> getExpectSteps(String stepDesc){
        String[] steps = stepDesc.split("\n");
        Vector<String> res = new Vector<>();
        for(int i=6;i<steps.length;i+=2){
            res.add(steps[i]);
        }
        return res;
    }

    public static boolean checkTestCase(Vector<Vector<String>> stepAndExpect, Vector<String> noAutoID) {
        boolean flag = true;
        for (int i = 0; i < stepAndExpect.size(); i++) {
            for (int j = 0; j < noAutoID.size(); j++) {
                while (stepAndExpect.get(i).get(0).equals(noAutoID.get(j))) {
                    flag = false;
                }
            }

        }

        return flag;
    }

    public static Vector<Vector<String>> getTuplesArray(Vector<Vector<String>> stepAndExpect) {
        Vector<Vector<String>> tuplesArray = new Vector<Vector<String>>();
        Vector<String> segments = new Vector<>();
        Vector<String> tuples = new Vector<>();


        for (int k = 0; k < 2; k++) {
            Vector<String> steps = new Vector<String>();
            String stepArray[] = stepAndExpect.get(k).get(1).split("\n");
            for (int p = 0; p < stepArray.length; p++) {
                steps.add(stepArray[p]);
            }
            String stepName, opration;

            for (int i = 0; i < steps.size(); i++) {
                //stepName = steps.get(i);
                opration = getOperation(steps.get(i));
                segments = getSegment(opration);
                System.out.println(opration);
                for (int j = 0; j < segments.size(); j++) {
                    tuples = tokens(segments.get(j));
                    Vector<String> v = new Vector<>();
                    v.add(stepAndExpect.get(k).get(0));
                    v.add(segments.get(j));
                    v.add(tuples.get(0));
                    v.add(tuples.get(1));
                    v.add(tuples.get(2));
                    tuplesArray.add(v);
                }
            }
        }
        return tuplesArray;
    }


    public static void main(String[] arge) {
        /*Vector<Vector<String>> idAndStep, formateIdAndStep = new Vector<>();
        Vector<String> noAutoID = new Vector<>();
        noAutoID = ReadTxt.NoAutoID();
        idAndStep = ClassUtil.getStepDesc("E:\\project\\ELV_LIMS_Function_Test\\AutoTestForCATARC-ELV\\auto_ELV_Test_Cases.xml");
        System.out.println(idAndStep.size());
        for (int i = 0; i < idAndStep.size(); i++) {
            if (noAutoID.indexOf(idAndStep.get(i).get(0)) >= 0) {
                System.out.println("该用例" + idAndStep.get(i).get(0) + "因为ShowModalDialog无法继续测试");
                idAndStep.remove(i);
                i--;
            }
        }
        formateIdAndStep = ClassUtil.formatStep(idAndStep);*/
        //buildExcel(Han.getTuplesArray(formateIdAndStep));
    }
}

