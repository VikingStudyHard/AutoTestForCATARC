package cn.edu.tju.scs.seql.final_ELV.车型管理_326.变更零部件_340;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_变更零部件_340  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"treepanel-1014_header_hd"),
	二级目录名称(ByEnum.ByXPath,".//a[@target = 'mainFrame'][text()='变更零部件']"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	右下角数量提示(ByEnum.ById,"tbtext-1036"),
	Loading框(ByEnum.ById,"loadmask-1041"),
	表格第一行序号(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[1]/div"),
	表格所有项(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr"),
	总页数(ByEnum.ById,"tbtext-1029"),
	页码输入框(ByEnum.ById,"numberfield-1028-inputEl"),
	上一页(ByEnum.ById,"button-1025-btnEl"),
	下一页(ByEnum.ById,"button-1031-btnEl"),
	第一页(ByEnum.ById,"button-1024-btnEl"),
	最后一页(ByEnum.ById,"button-1032-btnEl"),
	品牌名称查询(ByEnum.ById,"bname-inputEl"),
	车型名称查询(ByEnum.ById,"mname-inputEl"),
	创建时间开始(ByEnum.ById,"fromTime-inputEl"),
	创建时间截止(ByEnum.ById,"toTime-inputEl"),
	检索按钮(ByEnum.ById,"button-1011-btnEl"),
	表格第一行车型中文名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[4]/div"),
	表格第一行车型英文名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[5]/div"),
	时间错误提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	时间错误提示确定键(ByEnum.ById,"button-1005-btnEl"),
	表格第一行时间(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[7]/div"),
	表格第一行品牌中文名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[2]/div"),
	表格第一行品牌英文名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[3]/div"),
	表格第一行(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]"),
	确定按钮(ByEnum.ById,"gotoBomPage-btnEl"),
	导出按钮(ByEnum.ById,"exportButton-btnEl"),
	刷新按钮(ByEnum.ById,"button-1038-btnEl"),
	未选中记录错误提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	错误提示确定键(ByEnum.ById,"button-1005-btnEl"),
	变更前MDS名称输入框(ByEnum.ById,"cnameBefore-inputEl"),
	变更后MDS名称输入框(ByEnum.ById,"cnameAfter-inputEl"),
	变更前供货编号输入框(ByEnum.ById,"symbolBefore-inputEl"),
	变更后供货编号输入框(ByEnum.ById,"symbolAfter-inputEl"),
	检索结果所有行(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr"),
	检索结果第一行变更前MDS名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[4]/div"),
	检索结果第一行变更前供货编号(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行变更后MDS名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[9]/div"),
	检索结果第一行变更后供货编号(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[10]/div"),
	检索结果第一行时间(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[14]/div"),
	子页面创建时间起始(ByEnum.ById,"fromTime-inputEl"),
	子页面创建时间截止(ByEnum.ById,"toTime-inputEl"),
	子页面检索按钮(ByEnum.ById,"button-1011-btnEl"),
	子页面Loading框(ByEnum.ById,"loadmask-1045"),
	子页面时间错误提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	子页面时间错误提示确定键(ByEnum.ById,"button-1005-btnEl"),
	删除按钮(ByEnum.ById,"deleteButton-btnEl"),
	子页面未选择信息错误提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	子页面未选择信息错误提示确定键(ByEnum.ById,"button-1005-btnEl"),
	检索结果第一行(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]"),
	删除确定键(ByEnum.ById,"button-1006-btnEl"),
	删除取消键(ByEnum.ById,"button-1007-btnEl");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_变更零部件_340(ByEnum by, String name){
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
