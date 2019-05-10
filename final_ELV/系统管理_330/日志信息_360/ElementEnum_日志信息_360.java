package cn.edu.tju.scs.seql.final_ELV.系统管理_330.日志信息_360;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_日志信息_360  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ByXPath,".//*[@id='treepanel-1030_header_hd-textEl']/font"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1033']/table/tbody/tr[5]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	开始时间按钮(ByEnum.ByXPath,".//*[@id='logStartDate-inputCell']/following::td[1]/div"),
	开始时间今天(ByEnum.ByXPath,".//*[@id='button-1045-btnEl']"),
	结束时间按钮(ByEnum.ByXPath,".//*[@id='logEndDate-inputCell']/following::td[1]/div"),
	结束时间今天(ByEnum.ByXPath,".//*[@id='button-1048-btnEl']"),
	用户姓名输入框(ByEnum.ByXPath,".//*[@id='logUsername-inputEl']"),
	检索按钮(ByEnum.ByXPath,".//*[@id='logUsername']/../../td[4]/div/em/button"),
	按照检索条件删除(ByEnum.ByXPath,".//div[starts-with(@id,'toolbar')]/div/div/div[2]/em/button"),
	删除按钮(ByEnum.ByXPath,".//div[starts-with(@id,'toolbar')]/div/div/div[1]/em/button"),
	删除否按钮(ByEnum.ByXPath,".//*[@id='button-1007-btnEl']"),
	删除是按钮(ByEnum.ByXPath,".//*[@id='button-1006-btnEl']"),
	开始时间输入框(ByEnum.ByXPath,".//*[@id='logStartDate-inputEl']"),
	检索结果第一行勾选框(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[1]/div/div"),
	下一页按钮(ByEnum.ByXPath,".//*[@id='button-1028-btnEl']"),
	最后页按钮(ByEnum.ByXPath,".//*[@id='button-1029-btnEl']"),
	页码显示及输入框(ByEnum.ByXPath,".//*[@id='numberfield-1025-inputEl']");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_日志信息_360(ByEnum by, String name){
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
