package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

import java.util.Vector;

/**
 * 测试用例id: 3351
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: MDS数据同步(#332)
 * 用例名称: 验证MDS数据下载按钮是否可以实现
 * 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。
 * 2.能够正确进入MDS数据同步界面
 * 测试步骤->1. 点击下载按钮
 * 测试预期->1. 出现提示信息：请选择至少一个MDS！
 * 测试步骤->2. 选择一条MDS信息，点击下载按钮
 * 测试预期->2. 出现提示信息：下载成功
 * 测试步骤->3. 选择多条MDS信息，点击下载按钮
 * 测试预期->3. 出现提示信息：下载成功
 */

public class 验证MDS数据下载按钮是否可以实现_3351 extends Selenium_Test_Base {

    public 验证MDS数据下载按钮是否可以实现_3351() {
        super();
    }

    public 验证MDS数据下载按钮是否可以实现_3351(WebDriver driver) {
        super(driver);
    }

    @Test
    public void testNg() throws Exception {
        LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_MDS数据同步_332.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_MDS数据同步_332.rightFrame);
	    driver.switchTo().frame(leftFrame);
	    operationInLeftFrame();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	    detailedOperation();
    }

    /**
     * LeftFrame中的操作，主要是选择不同的功能
     */
    public void operationInLeftFrame() {
        // 数据管理不需要选一级目录
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_MDS数据同步_332.一级目录名称).click();
        WebDriverConfiguration.operationInterval();
        getElement(ElementEnum_MDS数据同步_332.二级目录名称).click();
        WebDriverConfiguration.operationInterval();
    }

    /**
     * 具体的测试操作，在右边的mianFrame中进行
     */
    public void detailedOperation() {
		Vector<String> steps = Han.getSteps(getDescription());
		for(int i=0;i<steps.size();i++){
			String operation = Han.getOperation(steps.get(i));
			Vector<String> segment = Han.getSegment(operation);
			for(int j=0;j<segment.size();j++){
				Vector<String> tokens = Han.tokens(segment.get(j));
				String target = tokens.get(1);
				Vector<ElementEnum_MDS数据同步_332> matchs = getMatchs(target);
				for (int k=0;k<matchs.size();k++){
                    getElement(matchs.get(k)).click();
                    WebDriverConfiguration.operationInterval();
                }

			}
		}
		/*CommonOperations_MDS数据同步_332 a = new CommonOperations_MDS数据同步_332(driver);
		getElement(ElementEnum_MDS数据同步_332.查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.waitLoading();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("成功获取");
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_MDS数据同步_332.下载按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请至少选择一个MDS");
		
		getElement(ElementEnum_MDS数据同步_332.MDS信息表格第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.下载按钮).click();
		WebDriverConfiguration.operationInterval();
		a.waitLoading();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("下载成功");*/

    }

    public Vector<ElementEnum_MDS数据同步_332> getMatchs(String target){
        ElementEnum_MDS数据同步_332 elements[] = ElementEnum_MDS数据同步_332.values();
        Vector<ElementEnum_MDS数据同步_332> matchs = new Vector<>();
        for (int i = 0; i < elements.length; i++){
            if(elements[i].name().indexOf(target)>=0)
                matchs.add(elements[i]);
        }
        return matchs;
    }

    public String getDescription() {
        return "测试用例id: 3351\n"
                + " 所属产品: ELV环境合规系统（标准版）(#17)\n"
                + " 所属模块: MDS数据同步(#332)\n"
                + " 用例名称: 验证MDS数据下载按钮是否可以实现\n"
                + " 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。 2.能够正确进入MDS数据同步界面\n"
                + " 测试步骤->1. 点击下载按钮\n"
                + " 测试预期->1. 出现提示信息：请选择至少一个MDS！\n"
                + " 测试步骤->2. 选择一条MDS信息，点击下载按钮\n"
                + " 测试预期->2. 出现提示信息：下载成功\n"
                + " 测试步骤->3. 选择多条MDS信息，点击下载按钮\n"
                + " 测试预期->3. 出现提示信息：下载成功\n"
                ;
    }

}
