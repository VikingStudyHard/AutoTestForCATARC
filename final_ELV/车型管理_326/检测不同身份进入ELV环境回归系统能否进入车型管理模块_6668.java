package cn.edu.tju.scs.seql.final_ELV.车型管理_326;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 6668
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型管理(#326)
 * 用例名称: 检测不同身份进入ELV环境回归系统能否进入车型管理模块
 * 前置条件: 能正常登陆ELV环境合归系统
 * 测试步骤->1. 在登录界面，用户名输入yangjie，密码输入000000，点击登录
 * 测试预期->1. 成功登录至ELV环境合规系统，左侧导航栏没有车型管理模块
 * 测试步骤->2. 在登录界面，用户名输入sunjianliang，密码输入000000，点击登录
 * 测试预期->2. 成功登录至ELV环境合规系统，左侧导航栏有车型管理模块
 * 
 */

public class 检测不同身份进入ELV环境回归系统能否进入车型管理模块_6668 extends Selenium_Test_Base {
	
	public 检测不同身份进入ELV环境回归系统能否进入车型管理模块_6668(){
		super();
	}
	
	public 检测不同身份进入ELV环境回归系统能否进入车型管理模块_6668(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型管理_326.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型管理_326.rightFrame);
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
		// 经测试，不同角色登录看到的菜单目录不同，但是由于目前角色管理混乱，无法使用自动化测试
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
	
	}

	
	public String getDescription(){
		return "测试用例id: 6668\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型管理(#326)\n"
				+" 用例名称: 检测不同身份进入ELV环境回归系统能否进入车型管理模块\n"
				+" 前置条件: 能正常登陆ELV环境合归系统\n"
				+" 测试步骤->1. 在登录界面，用户名输入yangjie，密码输入000000，点击登录\n"
				+" 测试预期->1. 成功登录至ELV环境合规系统，左侧导航栏没有车型管理模块\n"
				+" 测试步骤->2. 在登录界面，用户名输入sunjianliang，密码输入000000，点击登录\n"
				+" 测试预期->2. 成功登录至ELV环境合规系统，左侧导航栏有车型管理模块\n"
;
	}

}
