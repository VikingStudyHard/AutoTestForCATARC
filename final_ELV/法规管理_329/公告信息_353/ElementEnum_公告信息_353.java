package cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_公告信息_353  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"treepanel-1026_header_hd-textEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1029']/table/tbody/tr[3]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	编辑按钮(ByEnum.ById,"editbutton"),
	查看按钮(ByEnum.ById,"viewbutton"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ById,"tool-1039-toolEl"),
	检索结果表格(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody"),
	检索结果所有行(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr"),
	检索结果第一行勾选框(ByEnum.ByXPath,".//div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[1]/div/div"),
	检索结果第一行序号(ByEnum.ByXPath,".//div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[2]/div"),
	检索结果第一行标题(ByEnum.ByXPath,".//div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[3]/div"),
	检索结果第一行内容(ByEnum.ByXPath,".//div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[4]/div"),
	检索结果第一行时间(ByEnum.ByXPath,".//div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行状态(ByEnum.ByXPath,".//div[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[6]/div"),
	编辑窗口保存按钮(ByEnum.ByXPath,"html/body/table/tbody/tr/td/div/div[2]/div/div/div[1]/em/button"),
	编辑窗口关闭按钮(ByEnum.ById,"button-1042-btnEl"),
	标题输入框(ByEnum.ByXPath,"html/body/div[1]/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/input"),
	检索按钮(ByEnum.ByXPath,"html/body/div[1]/div[2]/table/tbody/tr/td[4]/div/em/button"),
	起始时间输入框(ByEnum.ById,"noticeStartTimeTextField-inputEl"),
	终止时间输入框(ByEnum.ById,"noticeEndTimeTextField-inputEl"),
	检索结果第一行创建时间(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[5]/div"),
	发布按钮(ByEnum.ById,"publishbutton"),
	loading(ByEnum.ById,"loadmask-1037-msgEl"),
	发布是按钮(ByEnum.ByXPath,"html/body/div[8]/div[3]/div/div/div[2]/em/button"),
	发布确定按钮(ByEnum.ByXPath,"html/body/div[8]/div[3]/div/div/div[1]/em/button"),
	已发布确定按钮(ByEnum.ByXPath,"html/body/div[8]/div[3]/div/div/div[1]/em/button"),
	退出(ByEnum.ByXPath,"html/body/div/div/table/tbody/tr/td/ul/li[4]/a"),
	删除按钮(ByEnum.ByXPath,".//*[@id='delbutton-btnEl']"),
	删除是按钮(ByEnum.ByXPath,".//*[@id='button-1006-btnEl']"),
	删除确定按钮(ByEnum.ByXPath,".//*[@id='button-1005-btnEl']"),
	下一页按钮(ByEnum.ByXPath,".//*[@id='button-1026-btnEl']"),
	最后页按钮(ByEnum.ByXPath,".//*[@id='button-1027-btnEl']"),
	页码显示及输入框(ByEnum.ByXPath,".//*[@id='pagingtool-innerCt']/div/table/tbody/tr/td[2]/table/tbody/tr/td/input"),
	页码总数显示(ByEnum.ByXPath,".//*[@id='tbtext-1024']"),
	换页载入界面(ByEnum.ById,"loadmask-1041"),
	快速提示信息(ByEnum.ById,"ext-quicktips-tip");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_公告信息_353(ByEnum by, String name){
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
