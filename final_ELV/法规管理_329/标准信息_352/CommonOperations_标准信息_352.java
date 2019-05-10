package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_标准信息_352 extends CommonOperationsAll {
	
	public CommonOperations_标准信息_352(){
		super();
	}
	
	public CommonOperations_标准信息_352(WebDriver driver){
		super(driver);
	}
	
	/**
	 * 检测第一页载入界面是否完成
	 */
	public void judgeMaskLoadFirst(){
		judgeElementDisplayNone(ElementEnum_标准信息_352.换页载入界面);
	}
	
	/**
	 * 验证数据库中我的记录(testBy樊向宇)
	 */
	public void verifyOnlyNoMyRecord(){
		testQueryByGeneralName("testBy樊向宇", ElementEnum_标准信息_352.法规名称输入框, 
				ElementEnum_标准信息_352.检索按钮, 
				ElementEnum_标准信息_352.检索结果所有行, 
				ElementEnum_标准信息_352.检索结果第一行法规名称, 
				ElementEnum_标准信息_352.检索结果第一行法规名称);
		WebDriverConfiguration.operationInterval();
		judgeMaskLoadFirst();
		List<WebElement> eles = getElements(ElementEnum_标准信息_352.检索结果所有行);
		WebDriverConfiguration.operationInterval();
		if(eles.size() > 1){
			deleteFirstMatchRecord();
			verifyOnlyOneMyRecord();
		}
	}
	
	/**
	 * 验证数据库中只有一条想要搜索到的记录(testBy樊向宇)
	 */
	public void verifyOnlyOneMyRecord(){
		testQueryByGeneralName("testBy樊向宇", ElementEnum_标准信息_352.法规名称输入框, 
				ElementEnum_标准信息_352.检索按钮, 
				ElementEnum_标准信息_352.检索结果所有行, 
				ElementEnum_标准信息_352.检索结果第一行法规名称, 
				ElementEnum_标准信息_352.检索结果第一行法规名称);
		List<WebElement> eles = getElements(ElementEnum_标准信息_352.检索结果所有行);
		WebDriverConfiguration.operationInterval();
		if(eles.size() < 2){
			addOneMyRecord();
		}else if(eles.size() > 2){
			deleteFirstMatchRecord();
			verifyOnlyOneMyRecord();
		}
	}
	
	/**
	 * 把第一条记录删除
	 */
	public void deleteFirstMatchRecord(){
		getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		verifyTipsAndThenOperateButton("确实要删除这些记录吗", 
				ElementEnum_标准信息_352.第一页提示信息, 
				ElementEnum_标准信息_352.第一页提示框是按钮);
	}
	
	/**
	 * 添加一条我的记录
	 */
	public void addOneMyRecord(){
		getElement(ElementEnum_标准信息_352.新增按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).sendKeys("testBy樊向宇");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口法规类型下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口法规类型下拉选项_国家标准).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口添加物质按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoadFirst();

		getElement(ElementEnum_标准信息_352.添加物质窗口查询按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoadFirst();
		getElement(ElementEnum_标准信息_352.添加物质窗口确定按钮).click();
		verifyTips("请至少选择一种物质");
		
		getElement(ElementEnum_标准信息_352.添加物质窗口物质信息第一行中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.添加物质窗口确定按钮).click();
		WebDriverConfiguration.operationInterval();
		verifyTips("法规比例为大于0的数字");
		
		getElement(ElementEnum_标准信息_352.添加物质窗口法规比例输入框).clear();
		getElement(ElementEnum_标准信息_352.添加物质窗口法规比例输入框).sendKeys("10");
		getElement(ElementEnum_标准信息_352.添加物质窗口确定按钮).click();
		WebDriverConfiguration.operationInterval();
		verifyTips("下列物质成功添加到新增列表中");
		
		getElement(ElementEnum_标准信息_352.查看窗口保存按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoadFirst();
		verifyTips("新增标准信息成功");
	}
	
	public void verifyTips(String expectTips){
		CommonOperations_标准信息_352 a = new CommonOperations_标准信息_352(driver);
		a.verifyTipsAndThenOperateButton(expectTips, 
				ElementEnum_标准信息_352.第一页提示信息, 
				ElementEnum_标准信息_352.第一页提示框确认按钮);
	}
	
	/**
	 * 检索出测试时要操作的数据
	 */
	public void searchMyRecord(){
		testQueryByGeneralName("testBy樊向宇", ElementEnum_标准信息_352.法规名称输入框, 
				ElementEnum_标准信息_352.检索按钮, 
				ElementEnum_标准信息_352.检索结果所有行, 
				ElementEnum_标准信息_352.检索结果第一行法规名称, 
				ElementEnum_标准信息_352.检索结果第一行法规名称);
		judgeMaskLoadFirst();
	}
	

}
