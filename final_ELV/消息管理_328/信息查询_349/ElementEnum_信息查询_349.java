package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_信息查询_349  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1038-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1025']/table/tbody/tr[3]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	开始时间输入框(ByEnum.ById,"newsStartTimeTextField-inputEl"),
	结束时间输入框(ByEnum.ById,"newsEndTimeTextField-inputEl"),
	消息类型输入框(ByEnum.ById,"queryType-inputEl"),
	消息类型选项_接收方(ByEnum.ByXPath,".//*[starts-with(@id,'boundlist')]/*[starts-with(@id,'boundlist')]/ul/li[1]"),
	消息类型选项_发送方(ByEnum.ByXPath,".//*[starts-with(@id,'boundlist')]/*[starts-with(@id,'boundlist')]/ul/li[2]"),
	查询按钮(ByEnum.ByXPath,".//table[@id='queryType']/../following::td[1]/div"),
	查看按钮(ByEnum.ByXPath,".//*[@id='viewButton']"),
	编辑按钮(ByEnum.ByXPath,".//*[@id='editButton']"),
	删除按钮(ByEnum.ByXPath,".//*[@id='deleteButton']"),
	发送按钮(ByEnum.ByXPath,".//*[@id='sendButton']"),
	检索结果表格(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody"),
	检索结果所有行(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr"),
	检索结果第一行前方勾选框(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[1]/div"),
	检索结果第一行消息标题(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[3]/div"),
	检索结果第一行BOM节点版本号(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[4]/div"),
	检索结果第一行创建时间(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行更新时间(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[6]/div"),
	检索结果第一行状态(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[7]/div"),
	检索结果第一行创建人(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[8]/div"),
	检索结果第一行接收人(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[9]/div"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框是按钮(ByEnum.ById,"button-1006-btnEl"),
	第一页提示框否按钮(ByEnum.ById,"button-1007-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ByXPath,".//*[@id='messagebox-1001_header_hd']/following::div[1]"),
	换页载入界面(ByEnum.ByXPath,".//*[starts-with(@id,'loadmask-')][last()]/div[starts-with(@id,'loadmask-')]/.."),
	查看窗口消息标题(ByEnum.ByXPath,".//*[@id='displayfield-1010-inputEl']"),
	查看窗口供货编号(ByEnum.ByXPath,".//*[@id='displayfield-1011-inputEl']"),
	查看窗口创建人(ByEnum.ByXPath,".//*[@id='displayfield-1012-inputEl']"),
	查看窗口接收人(ByEnum.ByXPath,".//*[@id='displayfield-1013-inputEl']"),
	查看窗口内容frame(ByEnum.ByXPath,".//*[@id='htmleditor-1014-iframeEl']");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_信息查询_349(ByEnum by, String name){
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
