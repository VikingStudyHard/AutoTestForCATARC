package cn.edu.tju.scs.seql.final_ELV.数据管理_325.基础数据同步_331;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_基础数据同步_331  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1035-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1013']/table/tbody/tr[2]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	开始时间输入框(ByEnum.ById,"dateFrom-inputEl"),
	结束时间输入框(ByEnum.ById,"dateTo-inputEl"),
	CAMDS企业按钮(ByEnum.ByXPath,".//*[@id='toolbar-1009-targetEl']/div[1]"),
	基本物质按钮(ByEnum.ByXPath,".//*[@id='toolbar-1009-targetEl']/div[2]"),
	材料分类按钮(ByEnum.ByXPath,".//*[@id='toolbar-1009-targetEl']/div[3]"),
	聚合物材料标识按钮(ByEnum.ByXPath,".//*[@id='toolbar-1009-targetEl']/div[4]"),
	材料引用标准按钮(ByEnum.ByXPath,".//*[@id='toolbar-1009-targetEl']/div[5]"),
	标准材料按钮(ByEnum.ByXPath,".//*[@id='toolbar-1009-targetEl']/div[6]"),
	应用选项明细按钮(ByEnum.ByXPath,".//*[@id='toolbar-1009-targetEl']/div[7]"),
	禁用物质应用选项及代码按钮(ByEnum.ByXPath,".//*[@id='toolbar-1009-targetEl']/div[8]"),
	结果表格(ByEnum.ByXPath,".//*[@id='gridview-1026']/table/tbody"),
	结果表格所有行(ByEnum.ByXPath,".//*[@id='gridview-1026']/table/tbody/tr"),
	结果表格第一行操作员(ByEnum.ByXPath,".//*[@id='gridview-1026']/table/tbody/tr[2]/td[2]/div"),
	结果表格第一行同步时间(ByEnum.ByXPath,".//*[@id='gridview-1026']/table/tbody/tr[2]/td[3]/div"),
	结果表格第一行同步类型(ByEnum.ByXPath,".//*[@id='gridview-1026']/table/tbody/tr[2]/td[4]/div"),
	结果表格第一行参数(ByEnum.ByXPath,".//*[@id='gridview-1026']/table/tbody/tr[2]/td[5]/div"),
	结果表格第一行执行结果(ByEnum.ByXPath,".//*[@id='gridview-1026']/table/tbody/tr[2]/td[6]/div"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框是按钮(ByEnum.ById,"button-1006-btnEl"),
	第一页提示框否按钮(ByEnum.ById,"button-1007-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ByXPath,".//*[@id='messagebox-1001_header_hd']/following::div[1]"),
	换页载入界面(ByEnum.ByXPath,".//*[starts-with(@id,'loadmask-')][last()]/div[starts-with(@id,'loadmask-')]/..");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_基础数据同步_331(ByEnum by, String name){
		this.byWhat = by;
		this.name = name;
	}

	public ByEnum getByWhat() {
		return byWhat;
	}

	public String getName() {
		return name;
	}

}
