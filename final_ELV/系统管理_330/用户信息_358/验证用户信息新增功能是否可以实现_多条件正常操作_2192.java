package cn.edu.tju.scs.seql.final_ELV.系统管理_330.用户信息_358;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2192
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 用户信息(#358)
 * 用例名称: 验证用户信息新增功能是否可以实现-多条件正常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面
 * 测试步骤->1. 点击新增按钮
 * 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。
 * 测试步骤->2. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击部门信息中的新增按钮添加相应的部门信息，勾选角色信息，点击新增车型信息。
 * 测试预期->2. 跳出新页面显示所有车型的信息内容。
 * 测试步骤->3. 在检索条件中的品牌中文名称填写车型1，点击检索按钮。
 * 测试预期->3. 页面出现中文名称中包含车型1字段的所有车型，页面其余各项正常显示。
 * 测试步骤->4. 在检索条件中的车型英文名称填写test，点击检索按钮。
 * 测试预期->4. 出现提示信息：您查找的数据不存在！
 * 测试步骤->5. 在检索条件中的车型英文名称修改为brand，点击检索按钮。
 * 测试预期->5. 页面出现中文名称中包含车型1字段，车型英文名中包含brand的所有车型，页面其余各项正常显示。
 * 测试步骤->6. 删除所填写的检索条件中的内容，在检索条件中的车型中文名称填写tset，点击检索按钮。
 * 测试预期->6. 页面出现车型中文名称中包含tset字段的所有车型，页面其余各项正常显示。
 * 测试步骤->7. 删除所填写的检索条件中的内容，在检索条件中的车辆型号填写sfs，点击检索按钮。
 * 测试预期->7. 页面出现车辆型号中包含sfs字段的所有车型，页面其余各项正常显示。
 * 测试步骤->8. 删除所填写的检索条件中的内容，在检索条件中的整车质量查询范围填写最小0最大0，点击检索按钮。
 * 测试预期->8. 页面出现整车质量为0的所有车型，页面其余各项正常显示。
 * 测试步骤->9. 删除所填写的检索条件中的内容，在检索条件中的整车质量查询范围填写最小0最大10，点击检索按钮。
 * 测试预期->9. 页面出现整车质量为0~10的所有车型，页面其余各项正常显示。
 * 测试步骤->10. 删除所填写的检索条件中的内容，在检索条件中的整车质量查询范围填写最小10最大0，点击检索按钮。
 * 测试预期->10. 出现提示信息：您查找的数据不存在！
 * 测试步骤->11. 删除所填写的检索条件中的内容，在检索条件中的生产年份查询范围填写起始时间本月初结束时间本月初，点击检索按钮。
 * 测试预期->11. 页面出现生产年份为本月初的所有车型，页面其余各项正常显示。
 * 测试步骤->12. 删除所填写的检索条件中的内容，在检索条件中的生产年份查询范围填写起始时间本月初结束时间今日，点击检索按钮。
 * 测试预期->12. 页面出现生产年份查询范围为本月初到今日的所有车型，页面其余各项正常显示。
 * 测试步骤->13. 删除所填写的检索条件中的内容，在检索条件中的生产年份查询范围填写起始时间今日结束时间本月初，点击检索按钮。
 * 测试预期->13. 出现提示信息：您查找的数据不存在！
 * 
 */

public class 验证用户信息新增功能是否可以实现_多条件正常操作_2192 extends Selenium_Test_Base {
	
	public 验证用户信息新增功能是否可以实现_多条件正常操作_2192(){
		super();
	}
	
	public 验证用户信息新增功能是否可以实现_多条件正常操作_2192(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_用户信息_358.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_用户信息_358.rightFrame);
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

	
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_用户信息_358.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_用户信息_358.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO 弹窗无法测试
	
	}

	
	public String getDescription(){
		return "测试用例id: 2192\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 用户信息(#358)\n"
				+" 用例名称: 验证用户信息新增功能是否可以实现-多条件正常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面\n"
				+" 测试步骤->1. 点击新增按钮\n"
				+" 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。\n"
				+" 测试步骤->2. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击部门信息中的新增按钮添加相应的部门信息，勾选角色信息，点击新增车型信息。\n"
				+" 测试预期->2. 跳出新页面显示所有车型的信息内容。\n"
				+" 测试步骤->3. 在检索条件中的品牌中文名称填写车型1，点击检索按钮。\n"
				+" 测试预期->3. 页面出现中文名称中包含车型1字段的所有车型，页面其余各项正常显示。\n"
				+" 测试步骤->4. 在检索条件中的车型英文名称填写test，点击检索按钮。\n"
				+" 测试预期->4. 出现提示信息：您查找的数据不存在！\n"
				+" 测试步骤->5. 在检索条件中的车型英文名称修改为brand，点击检索按钮。\n"
				+" 测试预期->5. 页面出现中文名称中包含车型1字段，车型英文名中包含brand的所有车型，页面其余各项正常显示。\n"
				+" 测试步骤->6. 删除所填写的检索条件中的内容，在检索条件中的车型中文名称填写tset，点击检索按钮。\n"
				+" 测试预期->6. 页面出现车型中文名称中包含tset字段的所有车型，页面其余各项正常显示。\n"
				+" 测试步骤->7. 删除所填写的检索条件中的内容，在检索条件中的车辆型号填写sfs，点击检索按钮。\n"
				+" 测试预期->7. 页面出现车辆型号中包含sfs字段的所有车型，页面其余各项正常显示。\n"
				+" 测试步骤->8. 删除所填写的检索条件中的内容，在检索条件中的整车质量查询范围填写最小0最大0，点击检索按钮。\n"
				+" 测试预期->8. 页面出现整车质量为0的所有车型，页面其余各项正常显示。\n"
				+" 测试步骤->9. 删除所填写的检索条件中的内容，在检索条件中的整车质量查询范围填写最小0最大10，点击检索按钮。\n"
				+" 测试预期->9. 页面出现整车质量为0~10的所有车型，页面其余各项正常显示。\n"
				+" 测试步骤->10. 删除所填写的检索条件中的内容，在检索条件中的整车质量查询范围填写最小10最大0，点击检索按钮。\n"
				+" 测试预期->10. 出现提示信息：您查找的数据不存在！\n"
				+" 测试步骤->11. 删除所填写的检索条件中的内容，在检索条件中的生产年份查询范围填写起始时间本月初结束时间本月初，点击检索按钮。\n"
				+" 测试预期->11. 页面出现生产年份为本月初的所有车型，页面其余各项正常显示。\n"
				+" 测试步骤->12. 删除所填写的检索条件中的内容，在检索条件中的生产年份查询范围填写起始时间本月初结束时间今日，点击检索按钮。\n"
				+" 测试预期->12. 页面出现生产年份查询范围为本月初到今日的所有车型，页面其余各项正常显示。\n"
				+" 测试步骤->13. 删除所填写的检索条件中的内容，在检索条件中的生产年份查询范围填写起始时间今日结束时间本月初，点击检索按钮。\n"
				+" 测试预期->13. 出现提示信息：您查找的数据不存在！\n"
;
	}

}
