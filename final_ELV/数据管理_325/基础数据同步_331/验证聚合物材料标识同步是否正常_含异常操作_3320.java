package cn.edu.tju.scs.seql.final_ELV.数据管理_325.基础数据同步_331;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3320
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 基础数据同步(#331)
 * 用例名称: 验证聚合物材料标识同步是否正常-含异常操作
 * 前置条件: 1.有正确的KEY值
 *         2.系统部署时的CAMDS账户应能够正常登录CAMDS系统
 *         3.能够正确进入基础数据同步界面
 * 测试步骤->1. 不选择开始和结束时间，点击聚合物材料标识。
 * 测试预期->1. 页面出现提示：请输入开始时间！
 * 测试步骤->2. 选择开始时间16年03月29日 13:12:35大于结束时间16年03月22日 13:12:35，点击聚合物材料标识。
 * 测试预期->2. 页面出现提示：开始时间早于结束时间！
 * 测试步骤->3. 选择开始时间16年03月29日 13:12:35等于结束时间16年03月29日 13:12:35，点击聚合物材料标识。
 * 测试预期->3. 页面出现提示：同步成功。同步记录新增一条信息，正确记录刚刚同步的操作员，时间，类型等内容。
 * 测试步骤->4. 选择开始时间16年03月29日 13:12:35小于结束时间16年04月05日 13:12:35，点击聚合物材料标识。
 * 测试预期->4. 页面出现提示：同步成功。同步记录新增一条信息，正确记录刚刚同步的操作员，时间，类型等内容。
 * 测试步骤->5. 选择开始时间16年03月29日 13:12:35，结束时间在未来16年08月30日 13:12:35，点击聚合物材料标识。
 * 测试预期->5. 页面出现提示：同步成功。同步记录新增一条信息，正确记录刚刚同步的操作员，时间，类型等内容。
 * 测试步骤->6. 选择开始时间13年10月06日 13:12:35，结束时间在未来16年08月30日 13:12:35，点击聚合物材料标识。
 * 测试预期->6. 持续显示进度条，文字信息为：正在处理，请稍等...
 * 
 */

public class 验证聚合物材料标识同步是否正常_含异常操作_3320 extends Selenium_Test_Base {
	
	public 验证聚合物材料标识同步是否正常_含异常操作_3320(){
		super();
	}
	
	public 验证聚合物材料标识同步是否正常_含异常操作_3320(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_基础数据同步_331.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_基础数据同步_331.rightFrame);
	    driver.switchTo().frame(leftFrame);
	    operationInLeftFrame();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	    detailedOperation();
	}
	
	/**
	 * LeftFrame中的操作，主要是选择不同的功能
	 */
	public void operationInLeftFrame(){
		// 数据管理不需要选一级目录
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_基础数据同步_331.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_基础数据同步_331.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_基础数据同步_331 a = new CommonOperations_基础数据同步_331(driver);
		a.verifyNormal(getElement(ElementEnum_基础数据同步_331.开始时间输入框).getAttribute("value"),
				getElement(ElementEnum_基础数据同步_331.结束时间输入框).getAttribute("value"),
				ElementEnum_基础数据同步_331.聚合物材料标识按钮);
		a.verifyNormal("16年03月29日 13:12:35","16年03月29日 13:12:35", ElementEnum_基础数据同步_331.聚合物材料标识按钮);
		a.verifyNormal("16年03月29日 13:12:35", "17年08月30日 13:12:35", ElementEnum_基础数据同步_331.聚合物材料标识按钮);
		a.verifyNormal("13年10月06日 13:12:35", "17年08月30日 13:12:35", ElementEnum_基础数据同步_331.聚合物材料标识按钮);
		
		a.verifyException(ElementEnum_基础数据同步_331.聚合物材料标识按钮);
	}

	
	public String getDescription(){
		return "测试用例id: 3320\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 基础数据同步(#331)\n"
				+" 用例名称: 验证聚合物材料标识同步是否正常-含异常操作\n"
				+" 前置条件: 1.有正确的KEY值 2.系统部署时的CAMDS账户应能够正常登录CAMDS系统 3.能够正确进入基础数据同步界面\n"
				+" 测试步骤->1. 不选择开始和结束时间，点击聚合物材料标识。\n"
				+" 测试预期->1. 页面出现提示：请输入开始时间！\n"
				+" 测试步骤->2. 选择开始时间16年03月29日 13:12:35大于结束时间16年03月22日 13:12:35，点击聚合物材料标识。\n"
				+" 测试预期->2. 页面出现提示：开始时间早于结束时间！\n"
				+" 测试步骤->3. 选择开始时间16年03月29日 13:12:35等于结束时间16年03月29日 13:12:35，点击聚合物材料标识。\n"
				+" 测试预期->3. 页面出现提示：同步成功。同步记录新增一条信息，正确记录刚刚同步的操作员，时间，类型等内容。\n"
				+" 测试步骤->4. 选择开始时间16年03月29日 13:12:35小于结束时间16年04月05日 13:12:35，点击聚合物材料标识。\n"
				+" 测试预期->4. 页面出现提示：同步成功。同步记录新增一条信息，正确记录刚刚同步的操作员，时间，类型等内容。\n"
				+" 测试步骤->5. 选择开始时间16年03月29日 13:12:35，结束时间在未来16年08月30日 13:12:35，点击聚合物材料标识。\n"
				+" 测试预期->5. 页面出现提示：同步成功。同步记录新增一条信息，正确记录刚刚同步的操作员，时间，类型等内容。\n"
				+" 测试步骤->6. 选择开始时间13年10月06日 13:12:35，结束时间在未来16年08月30日 13:12:35，点击聚合物材料标识。\n"
				+" 测试预期->6. 持续显示进度条，文字信息为：正在处理，请稍等...\n"
;
	}

}
