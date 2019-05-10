package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_车型信息_336  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1036-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1017']/table/tbody/tr[2]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	查看车型按钮(ByEnum.ById,"button-1037-btnEl"),
	新增车型按钮(ByEnum.ById,"button-1038-btnEl"),
	修改车型按钮(ByEnum.ById,"button-1039-btnEl"),
	删除车型按钮(ByEnum.ById,"button-1040-btnEl"),
	车型商标输入框(ByEnum.ById,"bname-inputEl"),
	通用名称输入框(ByEnum.ById,"mname-inputEl"),
	创建起始时间输入框(ByEnum.ById,"fromTime-inputEl"),
	创建终止时间输入框(ByEnum.ById,"toTime-inputEl"),
	检索按钮(ByEnum.ById,"button-1011-btnEl"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框是按钮(ByEnum.ById,"button-1006-btnEl"),
	第一页提示框否按钮(ByEnum.ById,"button-1007-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ByXPath,".//*[@id='messagebox-1001_header_hd']/following::div[1]"),
	换页载入界面(ByEnum.ById,"loadmask-1043"),
	检索结果所有行(ByEnum.ByXPath,".//*[@id='gridview-1022']/table/tbody/tr"),
	检索结果表格(ByEnum.ByXPath,".//*[@id='gridview-1022']/table/tbody"),
	检索结果第一行车型商标中文(ByEnum.ByXPath,".//*[@id='gridview-1022']/table/tbody/tr[2]/td[3]"),
	检索结果第一行车型商标英文(ByEnum.ByXPath,".//*[@id='gridview-1022']/table/tbody/tr[2]/td[4]"),
	检索结果第一行车型中文名称(ByEnum.ByXPath,".//*[@id='gridview-1022']/table/tbody/tr[2]/td[5]"),
	检索结果第一行车型英文名称(ByEnum.ByXPath,".//*[@id='gridview-1022']/table/tbody/tr[2]/td[6]"),
	检索结果第一行创建者(ByEnum.ByXPath,".//*[@id='gridview-1022']/table/tbody/tr[2]/td[7]"),
	检索结果第一行更新者(ByEnum.ByXPath,".//*[@id='gridview-1022']/table/tbody/tr[2]/td[8]"),
	检索结果第一行更新时间(ByEnum.ByXPath,".//*[@id='gridview-1022']/table/tbody/tr[2]/td[9]"),
	新增车型商标中文输入框(ByEnum.ById,"bcname-inputEl"),
	新增车型商标英文输入框(ByEnum.ById,"bename-inputEl"),
	新增车型中文名称输入框(ByEnum.ById,"mcname-inputEl"),
	新增车型英文名称输入框(ByEnum.ById,"mename-inputEl"),
	新增车型通用名称输入框(ByEnum.ById,"comname-inputEl"),
	新增车型型号款式输入框(ByEnum.ById,"modNo-inputEl"),
	新增车型种类输入框(ByEnum.ById,"modtype-inputEl"),
	新增整车质量输入框(ByEnum.ById,"wgt-inputEl"),
	新增生产企业输入框(ByEnum.ById,"modproducer-inputEl"),
	新增生产年份输入框(ByEnum.ById,"ptYear-inputEl"),
	新增长输入框(ByEnum.ById,"len-inputEl"),
	新增宽输入框(ByEnum.ById,"wdh-inputEl"),
	新增高输入框(ByEnum.ById,"hght-inputEl"),
	新增备注输入框(ByEnum.ById,"mk-inputEl"),
	弹出窗口保存按钮(ByEnum.ByXPath,".//*[@id='savebtn']"),
	弹出窗口关闭按钮(ByEnum.ByXPath,".//*[@id='savebtn']/following::div[1]"),
	弹出窗口右上角关闭按钮(ByEnum.ByXPath,".//*[@id='modelInfoWin_header_hd']/following::div[1]");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_车型信息_336(ByEnum by, String name){
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
