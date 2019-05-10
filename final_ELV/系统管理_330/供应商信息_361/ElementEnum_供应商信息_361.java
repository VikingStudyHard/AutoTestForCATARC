package cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_供应商信息_361  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ByXPath,".//*[@id='treepanel-1030_header_hd-textEl']/font"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1033']/table/tbody/tr[6]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	检索结果第一行勾选框(ByEnum.ByXPath,".//*[@id='gridview-1019']/table/tbody/tr[2]/td[1]/div/div"),
	查看按钮(ByEnum.ById,"viewbutton"),
	查看界面关闭按钮(ByEnum.ByXPath,".//*[@id='button-1059-btnEl']"),
	修改按钮(ByEnum.ById,"updateSupplierButton"),
	检索按钮(ByEnum.ByXPath,".//*[@id='button-1010-btnEl']"),
	企业中午名称输入框(ByEnum.ByXPath,".//*[@id='supplierCnameTextField-inputEl']"),
	企业英文名称输入框(ByEnum.ByXPath,".//*[@id='supplierEnameTextField-inputEl']"),
	供应商联系人输入框(ByEnum.ByXPath,".//*[@id='contactManTextField-inputEl']"),
	检索提示窗口确认按钮(ByEnum.ByXPath,".//*[@id='button-1005-btnEl']"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ByXPath,".//*[@id='button-1005-btnEl']"),
	检索结果所有行(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr"),
	删除按钮(ByEnum.ById,"deleteSupplierButton-btnEl"),
	删除界面否按钮(ByEnum.ByXPath,".//*[@id='button-1007-btnEl']"),
	删除界面是按钮(ByEnum.ByXPath,".//*[@id='button-1006-btnEl']"),
	删除确定按钮(ByEnum.ByXPath,".//*[@id='button-1005-btnEl']"),
	下一页按钮(ByEnum.ByXPath,".//*[@id='button-1027-btnEl']"),
	最后页按钮(ByEnum.ByXPath,".//*[@id='button-1028-btnEl']"),
	页码显示及输入框(ByEnum.ByXPath,".//*[@id='numberfield-1024-inputEl']"),
	新增按钮(ByEnum.ById,"addSupplierButton"),
	新增界面右上角关闭按钮(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../../preceding::div[1]"),
	新增页面保存按钮(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.suppliserManagerEmail']/../../../../../following::div[1]/div/div/div[1][starts-with(@id,'button')]"),
	修改页面保存按钮(ByEnum.ByXPath,".//*[@id='supplierManagerInfoPanel.supplierManagerName-inputEl']/../../../../../../../../../following::div[1]/div/div/div[1]/em/button"),
	新增页面姓名输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerName-inputEl']"),
	新增页面传真号码输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierFax-inputEl']"),
	新增页面联系电话输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']"),
	新增页面电子邮箱输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.suppliserManagerEmail-inputEl']"),
	新增页面DUNS编码输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/input"),
	新增页面企业中文名称输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/input"),
	新增页面国家输入框(ByEnum.ByXPath,".//*[@id='comboBox-inputEl']"),
	新增页面国家选择按钮(ByEnum.ByXPath,".//table[starts-with(@id,'comboBox-triggerWrap')]/tbody/tr/td[2]/div"),
	新增页面国家选择中国按钮(ByEnum.ByXPath,".//div[starts-with(@id,'boundlist')]/div[starts-with(@id,'boundlist')]/ul/li[1]"),
	新增页面地址输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[5]/td[1]/table/tbody/tr/td[2]/input"),
	新增页面主营业务输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[6]/td[1]/table/tbody/tr/td[2]/input"),
	新增页面企业外文名称输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[3]/td[1]/table/tbody/tr/td[2]/input"),
	新增页面企业英文名称输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/input"),
	新增页面机构代码输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/input"),
	新增页面省市输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[4]/td[2]/table/tbody/tr/td[2]/input"),
	新增页面邮政编码输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[5]/td[2]/table/tbody/tr/td[2]/input"),
	新增页面企业身份输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoInsertPanel.supplierManagerTel-inputEl']/../../../../../../../../../../preceding::div[4]/table/tbody/tr[6]/td[2]/table/tbody/tr/td[2]/input"),
	系统消息确定按钮(ByEnum.ByXPath,".//*[@id='button-1005-btnEl']"),
	修改页面DUNS编码输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierDunsNum-inputEl']"),
	修改页面企业中文名称输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierCname-inputEl']"),
	修改页面国家输入框(ByEnum.ByXPath,".//*[@id='comboBox-inputEl']"),
	修改页面国家选择按钮(ByEnum.ByXPath,".//*[@id='comboBox-inputEl']/../following::td[1]/div"),
	修改页面国家选择中国按钮(ByEnum.ByXPath,".//div[starts-with(@id,'boundlist')]/div/ul/li[1]"),
	修改页面地址输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierAddress-inputEl']"),
	修改页面主营业务输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierCoreBusiness-inputEl']"),
	修改页面企业外文名称输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierFname-inputEl']"),
	修改页面企业英文名称输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierEname-inputEl']"),
	修改页面机构代码输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierCode-inputEl']"),
	修改页面省市输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierProvince-inputEl']"),
	修改页面邮政编码输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierPost-inputEl']"),
	修改页面企业身份输入框(ByEnum.ByXPath,".//*[@id='supplierInfo.supplierIdentity-inputEl']"),
	修改页面姓名输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoPanel.supplierManagerName-inputEl']"),
	修改页面联系电话输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoPanel.supplierManagerTel-inputEl']"),
	修改页面传真号码输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoPanel.supplierFax-inputEl']"),
	修改页面电子邮箱输入框(ByEnum.ByXPath,".//*[@id='supplierManagerInfoPanel.suppliserManagerEmail-inputEl']"),
	修改页面关闭按钮(ByEnum.ByXPath,".//*[@id='supplierManagerInfoPanel.supplierManagerName-inputEl']/../../../../../../../../../following::div[1]/div/div/div[2]/em/button");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_供应商信息_361(ByEnum by, String name){
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
