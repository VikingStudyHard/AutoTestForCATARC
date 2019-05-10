package cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_行业动态_355  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1039-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1029']/table/tbody/tr[5]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	标题输入框(ByEnum.ByXPath,".//*[@id='articleTitleTextField-inputEl']"),
	开始时间输入框(ByEnum.ByXPath,".//*[@id='articleStartTimeTextField-inputEl']"),
	结束时间输入框(ByEnum.ByXPath,".//*[@id='articleEndTimeTextField-inputEl']"),
	检索按钮(ByEnum.ByXPath,".//*[@id='articleEndTimeTextField']/../following::td[1]/div"),
	查看按钮(ByEnum.ByXPath,".//*[@id='viewbutton']"),
	新增按钮(ByEnum.ByXPath,".//*[@id='addbutton']"),
	编辑按钮(ByEnum.ByXPath,".//*[@id='editbutton']"),
	删除按钮(ByEnum.ByXPath,".//*[@id='delbutton']"),
	发布按钮(ByEnum.ByXPath,".//*[@id='publishbutton']"),
	检索结果表格(ByEnum.ByXPath,".//div[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody"),
	检索结果所有行(ByEnum.ByXPath,".//div[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr"),
	检索结果第一行勾选框(ByEnum.ByXPath,".//div[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[1]"),
	检索结果第一行标题(ByEnum.ByXPath,".//div[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[3]"),
	检索结果第一行类别(ByEnum.ByXPath,".//div[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[4]"),
	检索结果第一行内容(ByEnum.ByXPath,".//div[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[5]"),
	检索结果第一行时间(ByEnum.ByXPath,".//div[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[6]"),
	检索结果第一行状态(ByEnum.ByXPath,".//div[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[7]"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框是按钮(ByEnum.ById,"button-1006-btnEl"),
	第一页提示框否按钮(ByEnum.ById,"button-1007-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ByXPath,".//*[@id='messagebox-1001_header_hd']/following::div[1]"),
	换页载入界面(ByEnum.ByXPath,".//*[starts-with(@id,'loadmask-')][last()]/div[starts-with(@id,'loadmask-')]/..");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_行业动态_355(ByEnum by, String name){
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
