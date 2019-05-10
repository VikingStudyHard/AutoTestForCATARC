package cn.edu.tju.scs.seql.final_ELV.系统管理_330.用户信息_358;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_用户信息_358  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ByXPath,".//*[@id='treepanel-1030_header_hd-textEl']/font"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1033']/table/tbody/tr[3]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	查看按钮(ByEnum.ById,"viewbutton"),
	检索结果第一行勾选框(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[1]/div/div"),
	下一页按钮(ByEnum.ByXPath,".//*[@id='button-1027-btnEl']"),
	最后页按钮(ByEnum.ByXPath,".//*[@id='button-1028-btnEl']"),
	部门输入框(ByEnum.ByXPath,".//*[@id='deptIdTextField-inputEl']"),
	检索按钮(ByEnum.ByXPath,".//*[@id='button-1010-btnEl']"),
	姓名输入框(ByEnum.ByXPath,".//*[@id='userNameTextField-inputEl']"),
	登录名输入框(ByEnum.ByXPath,".//*[@id='loginNameTextField-inputEl']"),
	删除按钮(ByEnum.ByXPath,".//*[@id='editbutton']/following::div[1]/em/button"),
	删除是按钮(ByEnum.ByXPath,".//*[@id='button-1006-btnEl']"),
	页码显示及输入框(ByEnum.ByXPath,".//*[@id='numberfield-1024-inputEl']"),
	修改按钮(ByEnum.ById,"editbutton"),
	重置用户密码(ByEnum.ByXPath,".//*[@id='mimabutton-btnEl']"),
	紧固件科(ByEnum.ByXPath,".//ul/li[text()='紧固件科']"),
	部门按钮(ByEnum.ByXPath,".//*[@id='deptIdTextField-inputCell']/following::td[1]/div");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_用户信息_358(ByEnum by, String name){
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
