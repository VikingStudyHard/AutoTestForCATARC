package cn.edu.tju.scs.seql.codeGenerator;

import java.util.List;

public class TestCasePojo {

    private String id;     //用例编号
    private String product;     //所属产品
    private String module;     //所属模块
    private String story;     //相关需求
    private String title;     //用例标题
    private String precondition;     //前置条件
    private String stepDesc;     //步骤
    private String stepExpect;     //预期
    private String keywords;     //关键词
    private String pri;     //优先级
    private String type;     //用例类型
    private String stage;     //适用阶段
    private String status;     //用例状态
    private String lastRunResult;     //结果
    private String openedBy;     //由谁创建
    private String openedDate;     //创建日期
    private String lastEditedBy;     //最后修改者
    private String lastEditedDate;     //修改日期
    private String version;     //用例版本
    private String linkCase;     //相关用例
    private String testCaseClassName; // 可用作类名的字符串
    private String packageName; // 所属的包名
    private String fullPath;   // 类文件存放目录的绝对路径

    public TestCasePojo(List<String> args){
        super();
        this.id = args.get(0);
        this.product = args.get(1);
        this.module = args.get(2);
        this.story = args.get(3);
        this.title = args.get(4);
        this.precondition = args.get(5);
        this.stepDesc = args.get(6);
        this.stepExpect = args.get(7);
        this.keywords = args.get(8);
        this.pri = args.get(9);
        this.type = args.get(10);
        this.stage = args.get(11);
        this.status = args.get(12);
        this.lastRunResult = args.get(13);
        this.openedBy = args.get(14);
        this.openedDate = args.get(15);
        this.lastEditedBy = args.get(16);
        this.lastEditedDate = args.get(17);
        this.version = args.get(18);
        this.linkCase = args.get(19);
        generateClassName();
    }


    /**
     * 根据title自动生成可以用作类名的字符串
     */
    private void generateClassName(){
        this.testCaseClassName = this.title;
        String tmp = "[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？-]";
        testCaseClassName = testCaseClassName.trim();
        testCaseClassName = testCaseClassName.replaceAll(tmp, "_");
        testCaseClassName = testCaseClassName.replaceAll(" ", "_");
        testCaseClassName += "_"+this.id;
    }

    /**
     * 获取该测试用例对应生成类的注释说明
     */
    public String getDescriptionForClass(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("/**\n");
        String prefix = " * ";
        String suffix = "\n";
        buffer.append(prefix + "测试用例id: " + id +suffix);
        buffer.append(prefix + "所属产品: " + product +suffix);
        buffer.append(prefix + "所属模块: " + module +suffix);
        buffer.append(prefix + "用例名称: " + title +suffix);
        buffer.append(prefix + "前置条件: " + precondition.replaceAll("\n", "\n *         ") +suffix);
        String[] steps = stepDesc.split("<br />");
        String[] expects = stepExpect.split("<br />");
        if(steps.length != expects.length){
            System.out.println("测试步骤与测试预期不对应");
            System.exit(0);
        }
        for(int i = 0;i < steps.length;i++){
            buffer.append(prefix + "测试步骤->"+ steps[i].replaceAll("\\n", " ") + suffix);
            buffer.append(prefix + "测试预期->" + expects[i].replaceAll("\\n", " ") + suffix);
        }

        buffer.append(" * \n");
        buffer.append(" */\n");

        return buffer.toString();
    }

    /**
     * 获取该测试用例getDescription函数中的字符传
     */
    public String getDescriptionStr(){
        StringBuffer buffer = new StringBuffer();
        String prefix = "\t\t\t\t+\" ";
        String suffix = "\\\\n\"\n";
        buffer.append("\"测试用例id: " + id +suffix);
        buffer.append(prefix + "所属产品: " + product +suffix);
        buffer.append(prefix + "所属模块: " + module +suffix);
        buffer.append(prefix + "用例名称: " + title +suffix);
        buffer.append(prefix + "前置条件: " + precondition.replaceAll("\\n", " ").replaceAll("\"", "“") +suffix);
        String[] steps = stepDesc.split("<br />");
        String[] expects = stepExpect.split("<br />");
        if(steps.length != expects.length){
            System.out.println("测试步骤与测试预期不对应");
            System.exit(0);
        }
        for(int i = 0;i < steps.length;i++){
            buffer.append(prefix + "测试步骤->"+ steps[i].replaceAll("\\n", " ").replaceAll("\"", "“") + suffix);
            buffer.append(prefix + "测试预期->" + expects[i].replaceAll("\\n", " ").replaceAll("\"", "“") + suffix);
        }
        return buffer.toString();
    }

    public TestCasePojo(String id, String product, String module, String story, String title, String precondition,
                        String stepDesc, String stepExpect, String keywords, String pri, String type, String stage, String status,
                        String lastRunResult, String openedBy, String openedDate, String lastEditedBy, String lastEditedDate,
                        String version, String linkCase) {
        super();
        this.id = id;
        this.product = product;
        this.module = module;
        this.story = story;
        this.title = title;
        this.precondition = precondition;
        this.stepDesc = stepDesc;
        this.stepExpect = stepExpect;
        this.keywords = keywords;
        this.pri = pri;
        this.type = type;
        this.stage = stage;
        this.status = status;
        this.lastRunResult = lastRunResult;
        this.openedBy = openedBy;
        this.openedDate = openedDate;
        this.lastEditedBy = lastEditedBy;
        this.lastEditedDate = lastEditedDate;
        this.version = version;
        this.linkCase = linkCase;
    }
    public TestCasePojo() {
        super();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public String getModule() {
        return module;
    }
    public void setModule(String module) {
        this.module = module;
    }
    public String getStory() {
        return story;
    }
    public void setStory(String story) {
        this.story = story;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPrecondition() {
        return precondition;
    }
    public void setPrecondition(String precondition) {
        this.precondition = precondition;
    }
    public String getStepDesc() {
        return stepDesc;
    }
    public void setStepDesc(String stepDesc) {
        this.stepDesc = stepDesc;
    }
    public String getStepExpect() {
        return stepExpect;
    }
    public void setStepExpect(String stepExpect) {
        this.stepExpect = stepExpect;
    }
    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    public String getPri() {
        return pri;
    }
    public void setPri(String pri) {
        this.pri = pri;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getStage() {
        return stage;
    }
    public void setStage(String stage) {
        this.stage = stage;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getLastRunResult() {
        return lastRunResult;
    }
    public void setLastRunResult(String lastRunResult) {
        this.lastRunResult = lastRunResult;
    }
    public String getOpenedBy() {
        return openedBy;
    }
    public void setOpenedBy(String openedBy) {
        this.openedBy = openedBy;
    }
    public String getOpenedDate() {
        return openedDate;
    }
    public void setOpenedDate(String openedDate) {
        this.openedDate = openedDate;
    }
    public String getLastEditedBy() {
        return lastEditedBy;
    }
    public void setLastEditedBy(String lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
    }
    public String getLastEditedDate() {
        return lastEditedDate;
    }
    public void setLastEditedDate(String lastEditedDate) {
        this.lastEditedDate = lastEditedDate;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getLinkCase() {
        return linkCase;
    }
    public void setLinkCase(String linkCase) {
        this.linkCase = linkCase;
    }

    public String getTestCaseClassName() {
        return testCaseClassName;
    }

    public void setTestCaseClassName(String testCaseClassName) {
        this.testCaseClassName = testCaseClassName;
    }


    public String getPackageName() {
        return packageName;
    }


    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }


    public String getFullPath() {
        return fullPath;
    }


    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

}
