package cn.edu.tju.scs.seql.final_ELV.消息管理_328.查询请求_351;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_查询请求_351  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1038-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1025']/table/tbody/tr[5]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	CAMDS账户输入框(ByEnum.ById,"camdsAccount1-inputEl"),
	CAMDS账户输入框下拉按钮(ByEnum.ByXPath,".//*[@id='camdsAccount1-inputCell']/following::td[1]"),
	添加CAMDS账号按钮(ByEnum.ByXPath,".//*[@id='camdsAccount1']/following::div[1]"),
	请求类型自己的(ByEnum.ByXPath,".//*[@id='requestType-innerCt']/tbody/tr/td[1]/table/tbody/tr/td[2]/input"),
	请求类型已接收(ByEnum.ByXPath,".//*[@id='requestType-innerCt']/tbody/tr/td[2]/table/tbody/tr/td[2]/input"),
	项目名称输入框(ByEnum.ById,"projectName1-inputEl"),
	材料数据表类型输入框(ByEnum.ById,"matTypeCombo-inputEl"),
	材料数据表类型下拉框(ByEnum.ByXPath,".//*[@id='matTypeCombo-inputCell']/following::td[1]"),
	材料数据表类型_全部(ByEnum.ByXPath,".//li[text()='全部']"),
	材料数据表类型_零部件(ByEnum.ByXPath,".//li[text()='零部件']"),
	材料数据表类型_半成品(ByEnum.ByXPath,".//li[text()='半成品']"),
	材料数据表类型_材料(ByEnum.ByXPath,".//li[text()='材料']"),
	部门输入框(ByEnum.ById,"recDeptName-inputEl"),
	部门查找按钮(ByEnum.ByXPath,".//*[@id='recDeptName']/following::div[1]"),
	截止日期起始输入框(ByEnum.ById,"fromTime-inputEl"),
	截止日期终止输入框(ByEnum.ById,"toTime-inputEl"),
	供货编号输入框(ByEnum.ById,"symbol1-inputEl"),
	供货名称输入框(ByEnum.ById,"supplyName1-inputEl"),
	已指派的材料数据表ID(ByEnum.ById,"mdsid-inputEl"),
	请求状态(ByEnum.ById,"reqCombo-inputEl"),
	请求状态下拉按钮(ByEnum.ByXPath,".//*[@id='reqCombo-inputCell']/following::td[1]"),
	请求状态_已接收(ByEnum.ByXPath,".//li[text()='已接收']"),
	请求状态_工作中(ByEnum.ByXPath,".//li[text()='工作中']"),
	请求状态_等待批准(ByEnum.ByXPath,".//li[text()='等待批准']"),
	请求状态_已批准(ByEnum.ByXPath,".//li[text()='已批准']"),
	请求状态_已拒绝(ByEnum.ByXPath,".//li[text()='已拒绝']"),
	请求状态_已删除(ByEnum.ByXPath,".//li[text()='已删除']"),
	最后的查找按钮(ByEnum.ByXPath,".//*[@id='reqCombo']/following::div[1]");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_查询请求_351(ByEnum by, String name){
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
