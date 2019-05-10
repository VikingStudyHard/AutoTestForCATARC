package cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_创建请求_350  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1038-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1025']/table/tbody/tr[4]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	CAMDS账户输入框(ByEnum.ById,"camdsAccount-inputEl"),
	CAMDS账户输入框下拉按钮(ByEnum.ByXPath,".//*[@id='camdsAccount-inputCell']/following::td[1]"),
	添加CAMDS账号按钮(ByEnum.ByXPath,".//*[@id='camdsAccount']/following::div[1]"),
	项目输入框(ByEnum.ById,"projectName-inputEl"),
	材料数据供应商输入框(ByEnum.ById,"recEntName-inputEl"),
	材料数据供应商查找按钮(ByEnum.ByXPath,".//*[@id='recEntName']/following::div[1]"),
	材料数据表类型_零部件(ByEnum.ByXPath,".//*[@id='matType-innerCt']/tbody/tr/td[1]/table/tbody/tr/td[2]/input"),
	材料数据表类型_半成品(ByEnum.ByXPath,".//*[@id='matType-innerCt']/tbody/tr/td[2]/table/tbody/tr/td[2]/input"),
	材料数据表类型_材料(ByEnum.ByXPath,".//*[@id='matType-innerCt']/tbody/tr/td[3]/table/tbody/tr/td[2]/input"),
	截止日期输入框(ByEnum.ById,"deadLine-inputEl"),
	供货编号输入框(ByEnum.ById,"symbol-inputEl"),
	报表编号输入框(ByEnum.ById,"creportCode-inputEl"),
	供货名称输入框(ByEnum.ById,"supplyName-inputEl"),
	报表日期输入框(ByEnum.ById,"creportDate-inputEl"),
	制图号输入框(ByEnum.ById,"cdrawingId-inputEl"),
	购货订单号输入框(ByEnum.ById,"cpurChaseOrderNo-inputEl"),
	制图日期输入框(ByEnum.ById,"cdrawingDate-inputEl"),
	提货单号输入框(ByEnum.ById,"cbillOfLading-inputEl"),
	制图修改号输入框(ByEnum.ById,"cdrawingModCode-inputEl"),
	供应商代码输入框(ByEnum.ById,"provider-inputEl"),
	备注输入框(ByEnum.ById,"remark-inputEl"),
	截止日期按钮(ByEnum.ByXPath,".//*[@id='deadLine-labelCell']/following::td[1]"),
	报表日期按钮(ByEnum.ByXPath,".//*[@id='creportDate-inputCell']/following::td[1]"),
	制图日期按钮(ByEnum.ByXPath,".//*[@id='cdrawingDate-inputCell']/following::td[1]"),
	日期选择框的第一个日期(ByEnum.ByXPath,".//*[starts-with(@id,'datepicker')][last()]/div[starts-with(@id,'datepicker')]/table/tbody/tr[1]/td[1]"),
	返回按钮(ByEnum.ByXPath,".//*[@id='sendRequest']/preceding::div[2]"),
	保存按钮(ByEnum.ByXPath,".//*[@id='sendRequest']/preceding::div[1]"),
	发送按钮(ByEnum.ByXPath,".//*[@id='sendRequest']"),
	添加CAMDS窗口用户名输入框(ByEnum.ById,"username-inputEl"),
	添加CAMDS窗口密码输入框(ByEnum.ById,"password-inputEl"),
	添加CAMDS窗口企业部门ID输入框(ByEnum.ById,"deptId-inputEl"),
	添加CAMDS窗口使用记录表格(ByEnum.ByXPath,".//*[starts-with(@id,'window')][last()]/*[starts-with(@id,'window')]/*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridview')]/table/tbody"),
	添加CAMDS窗口使用记录所有行(ByEnum.ByXPath,".//*[starts-with(@id,'window')][last()]/*[starts-with(@id,'window')]/*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridview')]/table/tbody/tr"),
	添加CAMDS窗口使用记录第一行用户名(ByEnum.ByXPath,".//*[starts-with(@id,'window')][last()]/*[starts-with(@id,'window')]/*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[1]/div"),
	添加CAMDS窗口使用记录第一行企业部门ID(ByEnum.ByXPath,".//*[starts-with(@id,'window')][last()]/*[starts-with(@id,'window')]/*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[2]/div"),
	添加CAMDS窗口删除按钮(ByEnum.ByXPath,".//*[starts-with(@id,'window')][last()]/*[starts-with(@id,'toolbar')]/div/div/div[1][starts-with(@id,'button')]"),
	添加CAMDS窗口添加按钮(ByEnum.ByXPath,".//*[starts-with(@id,'window')][last()]/*[starts-with(@id,'toolbar')]/div/div/div[2][starts-with(@id,'button')]"),
	CAMDS账户_ncfxy_camds选项(ByEnum.ByXPath,".//li[text()='ncfxy_camds']"),
	CAMDS账户_ncfxy_camds_tmp选项(ByEnum.ByXPath,".//li[text()='ncfxy_camds_tmp']"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框是按钮(ByEnum.ById,"button-1006-btnEl"),
	第一页提示框否按钮(ByEnum.ById,"button-1007-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ByXPath,".//*[@id='messagebox-1001_header_hd']/following::div[1]"),
	换页载入界面(ByEnum.ByXPath,".//*[starts-with(@id,'loadmask-')][last()]/div[starts-with(@id,'loadmask-')]/.."),
	搜索企业窗口企业名称输入框(ByEnum.ById,"entName-inputEl"),
	搜索企业窗口企业ID输入框(ByEnum.ById,"deptId-inputEl"),
	搜索企业窗口部门名称输入框(ByEnum.ById,"deptName-inputEl"),
	搜索企业窗口城市输入框(ByEnum.ById,"city-inputEl"),
	搜索企业窗口DUNS编码输入框(ByEnum.ById,"duns-inputEl"),
	搜索企业窗口邮政编码输入框(ByEnum.ById,"postCode-inputEl"),
	搜索企业窗口机构代码输入框(ByEnum.ById,"supplierCode-inputEl"),
	搜索企业窗口国家输入框(ByEnum.ById,"countryNames-inputCell"),
	搜索企业窗口国家下拉框(ByEnum.ByXPath,".//*[@id='countryNames-inputCell']/following::td[1]"),
	搜索企业窗口查找按钮(ByEnum.ByXPath,".//*[@id='countryNames']/following::div[1]"),
	搜索企业窗口确定按钮(ByEnum.ByXPath,".//*[@id='showpanel']/div[1]/div/div/div[2][starts-with(@id,'button')]"),
	搜索企业窗口取消按钮(ByEnum.ByXPath,".//*[@id='showpanel']/div[1]/div/div/div[3][starts-with(@id,'button')]"),
	搜索企业窗口检索结果表格(ByEnum.ByXPath,".//*[starts-with(@id,'gridview')]/table/tbody"),
	搜索企业窗口检索结果所有行(ByEnum.ByXPath,".//*[starts-with(@id,'gridview')]/table/tbody/tr"),
	搜索企业窗口检索结果第一行企业名称(ByEnum.ByXPath,".//*[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[3]/div"),
	搜索企业窗口检索结果第一行部门名称(ByEnum.ByXPath,".//*[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[4]/div"),
	搜索企业窗口检索结果第一行ID(ByEnum.ByXPath,".//*[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[5]/div"),
	搜索企业窗口检索结果第一行城市(ByEnum.ByXPath,".//*[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[6]/div"),
	搜索企业窗口检索结果第一行邮政编码(ByEnum.ByXPath,".//*[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[7]/div");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_创建请求_350(ByEnum by, String name){
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
