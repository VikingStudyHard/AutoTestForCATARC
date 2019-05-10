package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_标准信息_352  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1039-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1029']/table/tbody/tr[2]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	法规名称输入框(ByEnum.ById,"lawName-inputEl"),
	法规类型输入框(ByEnum.ById,"lawType-inputEl"),
	法规类型下拉按钮(ByEnum.ById,"ext-gen1091"),
	法规类型下拉选项_国际标准(ByEnum.ByXPath,".//body/div[starts-with(@id,'boundlist-')][1]/div/ul/li[1]"),
	法规类型下拉选项_国家标准(ByEnum.ByXPath,".//body/div[starts-with(@id,'boundlist-')][1]/div/ul/li[2]"),
	法规类型下拉选项_行业标准(ByEnum.ByXPath,".//body/div[starts-with(@id,'boundlist-')][1]/div/ul/li[3]"),
	法规类型下拉选项_企业标准(ByEnum.ByXPath,".//body/div[starts-with(@id,'boundlist-')][1]/div/ul/li[4]"),
	创建人输入框(ByEnum.ById,"creator-inputEl"),
	起始时间输入框(ByEnum.ById,"fromTime-inputEl"),
	终止时间输入框(ByEnum.ById,"toTime-inputEl"),
	检索按钮(ByEnum.ById,"button-1011-btnEl"),
	查看按钮(ByEnum.ById,"viewbutton"),
	新增按钮(ByEnum.ById,"button-1034-btnEl"),
	修改按钮(ByEnum.ById,"editbutton"),
	删除按钮(ByEnum.ById,"button-1035-btnEl"),
	检索结果表格(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody"),
	检索结果所有行(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr"),
	检索结果第一行勾选框(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[1]/div/div"),
	检索结果第一行序号(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[3]/div"),
	检索结果第一行法规名称(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[4]/div"),
	检索结果第一行法规类型(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行创建人(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[6]/div"),
	检索结果第一行创建时间(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[7]/div"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框是按钮(ByEnum.ById,"button-1006-btnEl"),
	第一页提示框否按钮(ByEnum.ById,"button-1007-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ByXPath,".//*[@id='messagebox-1001_header_hd']/following::div[1]"),
	换页载入界面(ByEnum.ByXPath,".//*[starts-with(@id,'loadmask-')][last()]/div[starts-with(@id,'loadmask-')]/.."),
	查看窗口法规名称输入框(ByEnum.ById,"lawNameInLawWin-inputEl"),
	查看窗口法规类型输入框(ByEnum.ById,"lawTypeInLawWin-inputEl"),
	查看窗口法规类型下拉按钮(ByEnum.ByXPath,".//*[@id='lawTypeInLawWin-bodyEl']/table/tbody/tr/td[2]/div"),
	查看窗口法规类型下拉选项_国际标准(ByEnum.ByXPath,".//body/div[starts-with(@id,'boundlist-')][last()]/div/ul/li[1]"),
	查看窗口法规类型下拉选项_国家标准(ByEnum.ByXPath,".//body/div[starts-with(@id,'boundlist-')][last()]/div/ul/li[2]"),
	查看窗口法规类型下拉选项_行业标准(ByEnum.ByXPath,".//body/div[starts-with(@id,'boundlist-')][last()]/div/ul/li[3]"),
	查看窗口法规类型下拉选项_企业标准(ByEnum.ByXPath,".//body/div[starts-with(@id,'boundlist-')][last()]/div/ul/li[4]"),
	查看窗口基本物质信息列表(ByEnum.ByXPath,".//*[@id='subsGrid-body']/div/table/tbody"),
	查看窗口基本物质信息所有行(ByEnum.ByXPath,".//*[@id='subsGrid-body']/div/table/tbody/tr"),
	查看窗口基本物质信息第一行序号(ByEnum.ByXPath,".//*[@id='subsGrid-body']/div/table/tbody/tr[2]/td[1]/div"),
	查看窗口基本物质信息第一行中文名称(ByEnum.ByXPath,".//*[@id='subsGrid-body']/div/table/tbody/tr[2]/td[2]/div"),
	查看窗口基本物质信息第一行英文名称(ByEnum.ByXPath,".//*[@id='subsGrid-body']/div/table/tbody/tr[2]/td[3]/div"),
	查看窗口基本物质信息第一行别名1(ByEnum.ByXPath,".//*[@id='subsGrid-body']/div/table/tbody/tr[2]/td[4]/div"),
	查看窗口基本物质信息第一行别名2(ByEnum.ByXPath,".//*[@id='subsGrid-body']/div/table/tbody/tr[2]/td[5]/div"),
	查看窗口基本物质信息第一行别名3(ByEnum.ByXPath,".//*[@id='subsGrid-body']/div/table/tbody/tr[2]/td[6]/div"),
	查看窗口基本物质信息第一行比例(ByEnum.ByXPath,".//*[@id='subsGrid-body']/div/table/tbody/tr[2]/td[7]/div"),
	查看窗口保存按钮(ByEnum.ByXPath,".//*[@id='savebtn']"),
	查看窗口关闭按钮(ByEnum.ByXPath,".//*[@id='savebtn']/following::div[1]"),
	查看窗口添加物质按钮(ByEnum.ByXPath,".//*[@id='subgridtbar-innerCt']/div/div[2]"),
	查看窗口修改物质按钮(ByEnum.ByXPath,".//*[@id='subgridtbar-innerCt']/div/div[3]"),
	查看窗口删除物质按钮(ByEnum.ByXPath,".//*[@id='subgridtbar-innerCt']/div/div[4]"),
	添加物质窗口物质分类输入框(ByEnum.ByXPath,".//*[@id='substanceTypeCombo-inputEl']"),
	添加物质窗口物质分类下拉按钮(ByEnum.ByXPath,".//*[@id='substanceTypeCombo-inputEl']/../following::td[1]/div"),
	添加物质窗口物质分类下拉选项_全部(ByEnum.ByXPath,".//*[starts-with(@id,'boundlist-')][last()]/div[starts-with(@id,'boundlist-')]/ul/li[1]"),
	添加物质窗口物质分类下拉选项_铅及化合物(ByEnum.ByXPath,".//*[starts-with(@id,'boundlist-')][last()]/div[starts-with(@id,'boundlist-')]/ul/li[1]"),
	添加物质窗口中文名称输入框(ByEnum.ByXPath,".//*[@id='subcname-inputEl']"),
	添加物质窗口英文名称输入框(ByEnum.ByXPath,".//*[@id='subename-inputEl']"),
	添加物质窗口查询按钮(ByEnum.ByXPath,".//table[@id='subename']/following::div[1]"),
	添加物质窗口法规比例输入框(ByEnum.ByXPath,".//*[@id='lawRate-inputEl']"),
	添加物质窗口确定按钮(ByEnum.ByXPath,".//table[@id='lawRate']/following::div[1]"),
	添加物质窗口物质信息列表(ByEnum.ByXPath,".//*[@id='subsInfoGrid-body']/div/table/tbody"),
	添加物质窗口物质信息所有行(ByEnum.ByXPath,".//*[@id='subsInfoGrid-body']/div/table/tbody/tr"),
	添加物质窗口物质信息第一行中文名称(ByEnum.ByXPath,".//*[@id='subsInfoGrid-body']/div/table/tbody/tr[2]/td[4]/div"),
	添加物质窗口物质信息第一行英文名称(ByEnum.ByXPath,".//*[@id='subsInfoGrid-body']/div/table/tbody/tr[2]/td[5]/div"),
	添加物质窗口物质信息第一行别名1(ByEnum.ByXPath,".//*[@id='subsInfoGrid-body']/div/table/tbody/tr[2]/td[6]/div"),
	添加物质窗口物质信息第一行别名2(ByEnum.ByXPath,".//*[@id='subsInfoGrid-body']/div/table/tbody/tr[2]/td[7]/div"),
	添加物质窗口物质信息第一行别名3(ByEnum.ByXPath,".//*[@id='subsInfoGrid-body']/div/table/tbody/tr[2]/td[8]/div"),
	修改物质比例输入框(ByEnum.ByXPath,".//*[@id='substanceRate-inputEl']"),
	修改物质比例输入框保存按钮(ByEnum.ByXPath,".//*[@id='editSubstanceWin-body']/following::div[1]/div/div/div[1]"),
	修改物质比例输入框关闭按钮(ByEnum.ByXPath,".//*[@id='editSubstanceWin-body']/following::div[1]/div/div/div[2]");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_标准信息_352(ByEnum by, String name){
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
