package cn.edu.tju.scs.seql.final_ELV.车型管理_326.扩展零部件_341;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_扩展零部件_341  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"treepanel-1014_header_hd"),
	二级目录名称(ByEnum.ByXPath,".//a[@target = 'mainFrame'][text()='扩展零部件']"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	下一页(ByEnum.ById,"button-1031-btnEl"),
	上一页(ByEnum.ById,"button-1025-btnEl"),
	第一页(ByEnum.ById,"button-1024-btnEl"),
	最后一页(ByEnum.ById,"button-1032-btnEl"),
	总页数(ByEnum.ById,"tbtext-1029"),
	页码输入框(ByEnum.ById,"numberfield-1028-inputEl"),
	表格所有项(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr"),
	表格第一行序号(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[1]/div"),
	右下角数量提示(ByEnum.ById,"tbtext-1036"),
	Loading框(ByEnum.ById,"loadmask-1041"),
	车型名称查询(ByEnum.ById,"mname-inputEl"),
	品牌名称查询(ByEnum.ById,"bname-inputEl"),
	检索按钮(ByEnum.ById,"button-1011-btnEl"),
	创建时间开始(ByEnum.ById,"fromTime-inputEl"),
	创建时间截止(ByEnum.ById,"toTime-inputEl"),
	表格第一行品牌中文名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[2]/div"),
	表格第一行品牌英文名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[3]/div"),
	表格第一行车型中文名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[4]/div"),
	表格第一行车型英文名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[5]/div"),
	表格第一行时间(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[7]/div"),
	时间错误提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	时间错误提示确定键(ByEnum.ById,"button-1005-btnEl"),
	表格第一行(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]"),
	确定按钮(ByEnum.ById,"gotoBomPage-btnEl"),
	导出按钮(ByEnum.ById,"button-1039-btnEl"),
	未选择记录提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	未选择记录提示确定键(ByEnum.ById,"button-1005-btnEl"),
	右侧页面(ByEnum.ById,"ext-gen1018"),
	子页面Loading框(ByEnum.ById,"loadmask-1042"),
	零部件名称输入框(ByEnum.ById,"cname-inputEl"),
	供货编号输入框(ByEnum.ById,"ckid-inputEl"),
	备注输入框(ByEnum.ById,"remark-inputEl"),
	检索结果所有行(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr"),
	检索结果第一行零部件名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行供货编号(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[6]/div"),
	检索结果第一行备注(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[9]/div"),
	子页面检索按钮(ByEnum.ById,"button-1012-btnEl"),
	刷新按钮(ByEnum.ById,"button-1038-btnEl"),
	检索结果第一行(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]"),
	删除按钮(ByEnum.ById,"button-1038-btnEl"),
	子页面未选择信息错误提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	子页面未选择信息错误提示确定键(ByEnum.ById,"button-1005-btnEl"),
	删除取消键(ByEnum.ById,"button-1006-btnEl"),
	删除确定键(ByEnum.ById,"button-1007-btnEl");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_扩展零部件_341(ByEnum by, String name){
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
