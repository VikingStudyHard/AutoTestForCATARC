package cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_角色信息_362  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ByXPath,".//*[@id='treepanel-1030_header_hd-textEl']/font"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1033']/table/tbody/tr[7]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	查看按钮(ByEnum.ById,"viewbutton"),
	检索结果第一行勾选框(ByEnum.ByXPath,".//*[@id='gridview-1016']/table/tbody/tr[2]/td[1]/div/div"),
	检索结果第二行勾选框(ByEnum.ByXPath,".//*[@id='gridview-1016']/table/tbody/tr[3]/td[1]/div/div"),
	查看页面权限中文名称输入框(ByEnum.ByXPath,".//*[@id='roleName-inputEl']"),
	查看页面权限英文名称输入框(ByEnum.ByXPath,".//*[@id='roleENametext-inputEl']"),
	查看页面关闭按钮(ByEnum.ByXPath,".//*[@id='saverole']/following::div[1]/em/button"),
	删除按钮(ByEnum.ByXPath,".//*[@id='viewbutton-btnEl']/../../following::div[3]"),
	删除提示信息确定按钮(ByEnum.ByXPath,".//*[@id='button-1005-btnEl']"),
	用户信息(ByEnum.ByXPath,".//*[@id='treeview-1033']/table/tbody/tr[3]/td/div/a"),
	用户信息第一行勾选框(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[1]/div/div"),
	用户界面删除按钮(ByEnum.ByXPath,".//*[@id='editbutton-btnEl']/../../following::div[1]/em/button"),
	用户界面删除界面是按钮(ByEnum.ByXPath,".//*[@id='button-1006-btnEl']"),
	确定按钮(ByEnum.ByXPath,".//*[@id='button-1005-btnEl']"),
	删除确定按钮(ByEnum.ByXPath,".//*[@id='button-1005']"),
	删除是按钮(ByEnum.ByXPath,".//*[@id='button-1006-btnEl']"),
	下一页按钮(ByEnum.ByXPath,".//*[@id='button-1024-btnEl']"),
	最后页按钮(ByEnum.ByXPath,".//*[@id='button-1025-btnEl']"),
	页码显示及输入框(ByEnum.ByXPath,".//*[@id='numberfield-1021-inputEl']"),
	新增按钮(ByEnum.ByXPath,".//*[@id='viewbutton-btnEl']/../../following::div[1]/em/button"),
	新增页面权限中文名称输入框(ByEnum.ByXPath,".//*[@id='roleName-inputEl']"),
	新增页面权限英文名称输入框(ByEnum.ByXPath,".//*[@id='roleENametext-inputEl']"),
	数据管理第一项(ByEnum.ByXPath,".//*[@id='roleName-inputEl']/../../../../../div[1]/div[2]/div/table/tbody/tr[3]/td/table/tbody/tr[2]/td[1]/div/div"),
	新增页面关闭按钮(ByEnum.ByXPath,".//*[@id='saverole-btnEl']/../../following::div[1]/em/button"),
	新增页面右上角关闭(ByEnum.ByXPath,".//*[@id='tool-1072-toolEl']"),
	新增页面保存按钮(ByEnum.ById,"saverole-btnEl"),
	新增错误提示确定按钮(ByEnum.ByXPath,".//*[@id='button-1005-btnEl']"),
	新增页面角色类型选择按钮(ByEnum.ByXPath,".//table[@id='roletypes-triggerWrap']/tbody/tr/td[2]/div"),
	新增页面角色类型选择按钮审核员(ByEnum.ByXPath,".//ul/li[text()='审核员']"),
	新增页面角色类型选择按钮其他(ByEnum.ByXPath,".//ul/li[text()='其他']"),
	修改按钮(ByEnum.ById,"editbutton"),
	修改页面权限中文名称(ByEnum.ByXPath,".//*[@id='roleName-inputEl']"),
	修改页面保存按钮(ByEnum.ByXPath,".//*[@id='saverole-btnEl']"),
	修改页面权限英文名称(ByEnum.ByXPath,".//*[@id='roleENametext-inputEl']"),
	修改页面角色选择按钮(ByEnum.ByXPath,".//*[@id='roletypes-triggerWrap']/tbody/tr/td[2]/div"),
	修改页面全选按钮(ByEnum.ByXPath,".//table[@id='roletypes']/following::div[2]/div[1]/div[1]/div/div[1]/div[1]/span"),
	修改页面数据管理第一项(ByEnum.ByXPath,".//table[@id='roletypes']/following::div[2]/div[2]/div/table/tbody/tr[3]/td/table/tbody/tr[2]/td[1]/div/div"),
	修改页面打开数据管理(ByEnum.ByXPath,".//table[@id='roletypes']/following::div[2]/div[2]/div/table/tbody/tr[2]/td/div/div"),
	修改页面关闭按钮(ByEnum.ByXPath,".//*[@id='saverole-btnEl']/following::div[1]/em/button"),
	检索结果第一行中文(ByEnum.ByXPath,"html/body/div[1]/div[4]/div/table/tbody/tr[2]/td[3]/div"),
	检索结果所有行(ByEnum.ByXPath,"html/body/div[1]/div[4]/div/table/tbody/tr");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_角色信息_362(ByEnum by, String name){
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
