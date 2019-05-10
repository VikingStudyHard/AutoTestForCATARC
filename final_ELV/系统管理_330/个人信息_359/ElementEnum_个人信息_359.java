package cn.edu.tju.scs.seql.final_ELV.系统管理_330.个人信息_359;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_个人信息_359  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ByXPath,".//*[@id='treepanel-1030_header_hd-textEl']/font"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1033']/table/tbody/tr[4]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	修改个人密码(ByEnum.ByXPath,".//*[@id='button-1018-btnEl']"),
	修改个人信息(ByEnum.ByXPath,".//*[@id='button-1019-btnEl']"),
	修改页面关闭按钮(ByEnum.ByXPath,".//*[@id='personInfoWin_header_hd']/following::div[1]/img"),
	修改页面用户中文名称输入框(ByEnum.ByXPath,".//*[@id='userCnametext-inputEl']"),
	修改页面保存按钮(ByEnum.ById,"savebtn-btnEl"),
	修改页面电话输入框(ByEnum.ByXPath,".//*[@id='telephonetext-inputEl']"),
	修改页面手机输入框(ByEnum.ByXPath,".//*[@id='mobilphonetext-inputEl']"),
	修改页面传真输入框(ByEnum.ByXPath,".//*[@id='faxtext-inputEl']"),
	修改页面电子邮箱输入框(ByEnum.ByXPath,".//*[@id='emailtext-inputEl']"),
	修改页面用户登录名输入框(ByEnum.ByXPath,".//*[@id='loginnametext-inputEl']"),
	用户信息(ByEnum.ByXPath,".//*[@id='treeview-1033']/table/tbody/tr[3]/td/div/a"),
	姓名输入框(ByEnum.ByXPath,".//*[@id='userNameTextField-inputEl']"),
	检索按钮(ByEnum.ByXPath,".//*[@id='button-1010-btnEl']"),
	权限(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[7]/div"),
	一(ByEnum.ByXPath,".//*[@id='gridview-1034']/table/tbody/tr[2]/td[2]/div"),
	二(ByEnum.ByXPath,".//*[@id='gridview-1034']/table/tbody/tr[3]/td[2]/div"),
	三(ByEnum.ByXPath,".//*[@id='gridview-1034']/table/tbody/tr[4]/td[2]/div"),
	四(ByEnum.ByXPath,".//*[@id='gridview-1034']/table/tbody/tr[5]/td[2]/div"),
	五(ByEnum.ByXPath,".//*[@id='gridview-1034']/table/tbody/tr[6]/td[2]/div"),
	原始密码(ByEnum.ByXPath,".//*[@id='oldpassword-inputEl']");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_个人信息_359(ByEnum by, String name){
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
