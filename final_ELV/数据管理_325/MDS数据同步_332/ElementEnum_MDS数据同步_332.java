package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_MDS数据同步_332  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1035-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1013']/table/tbody/tr[3]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	查询类型输入框(ByEnum.ById,"queryType-inputEl"),
	查询类型下拉按钮(ByEnum.ByXPath,".//*[@id='queryType-inputCell']/following::td[1]"),
	查询类型选项_全部(ByEnum.ByXPath,".//li[text()='零部件']/preceding::li[1]"),
	查询类型选项_零部件(ByEnum.ByXPath,".//li[text()='零部件']"),
	查询类型选项_半成品(ByEnum.ByXPath,".//li[text()='半成品']"),
	查询类型选项_材料(ByEnum.ByXPath,".//li[text()='材料']"),
	表单来源输入框(ByEnum.ById,"isMdsOwner-inputEl"),
	表单来源下拉按钮(ByEnum.ByXPath,".//*[@id='isMdsOwner-inputCell']/following::td[1]"),
	表单来源选项_供应商提供(ByEnum.ByXPath,".//li[text()='供应商提供']"),
	表单来源选项_本企业创建(ByEnum.ByXPath,".//li[text()='本企业创建']"),
	表单来源选项_全部(ByEnum.ByXPath,".//li[text()='本企业创建']/following::li[1]"),
	名称输入框(ByEnum.ById,"name-inputEl"),
	供货编号输入框(ByEnum.ById,"symbol-inputEl"),
	ID输入框(ByEnum.ById,"cid-inputEl"),
	查询时间输入框(ByEnum.ById,"dateType-inputEl"),
	查询时间下拉按钮(ByEnum.ByXPath,".//*[@id='dateType-inputCell']/following::td[1]"),
	查询时间选项_全部时间(ByEnum.ByXPath,".//li[text()='全部时间']"),
	查询时间选项_创建时间(ByEnum.ByXPath,".//li[text()='创建时间']"),
	查询时间选项_更新时间(ByEnum.ByXPath,".//li[text()='更新时间']"),
	查询时间选项_发布时间(ByEnum.ByXPath,".//li[text()='发布时间']"),
	查询时间选项_批准时间(ByEnum.ByXPath,".//li[text()='批准时间']"),
	查询时间选项_接收时间(ByEnum.ByXPath,".//li[text()='接收时间']"),
	开始时间输入框(ByEnum.ById,"dateFrom-inputEl"),
	结束时间输入框(ByEnum.ById,"dateTo-inputEl"),
	查询按钮(ByEnum.ByXPath,".//*[starts-with(@id,'findParams')]/*[starts-with(@id,'toolbar')]/div/div/div[1]"),
	切换用户查询按钮(ByEnum.ByXPath,".//*[starts-with(@id,'findParams')]/*[starts-with(@id,'toolbar')]/div/div/div[2]"),
	下载记录按钮(ByEnum.ByXPath,".//*[starts-with(@id,'findParams')]/*[starts-with(@id,'toolbar')]/div/div/div[3]"),
	重置按钮(ByEnum.ByXPath,".//*[starts-with(@id,'findParams')]/*[starts-with(@id,'toolbar')]/div/div/div[4]"),
	下载按钮(ByEnum.ByXPath,".//*[@id='mdsInfos']/*[starts-with(@id,'toolbar')]/*[starts-with(@id,'toolbar')]/*[starts-with(@id,'toolbar')]/div"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框是按钮(ByEnum.ById,"button-1006-btnEl"),
	第一页提示框否按钮(ByEnum.ById,"button-1007-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ByXPath,".//*[@id='messagebox-1001_header_hd']/following::div[1]"),
	换页载入界面(ByEnum.ByXPath,".//*[starts-with(@id,'loadmask-')][last()]/div[starts-with(@id,'loadmask-')]/.."),
	输入CAMDS窗口用户名输入框(ByEnum.ByXPath,".//*[@id='username'][last()]/tbody/tr/td[2]/input"),
	输入CAMDS窗口密码输入框(ByEnum.ByXPath,".//*[@id='password'][last()]/tbody/tr/td[2]/input"),
	输入CAMDS窗口企业部门ID输入框(ByEnum.ByXPath,".//*[@id='deptId'][last()]/tbody/tr/td[2]/input"),
	输入CAMDS窗口表格第一行用户名(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[1]/div"),
	输入CAMDS窗口表格第一行企业部门ID(ByEnum.ByXPath,".//*[starts-with(@id,'gridpanel')]/*[starts-with(@id,'gridview')]/table/tbody/tr[2]/td[2]/div"),
	输入CAMDS窗口右上角关闭按钮(ByEnum.ByXPath,".//*[starts-with(@id,'window')]/*[starts-with(@id,'window')]/*[starts-with(@id,'window')]/*[starts-with(@id,'window')]/*[starts-with(@id,'window')]/*[starts-with(@id,'tool')]"),
	输入CAMDS窗口提交按钮(ByEnum.ByXPath,".//*[starts-with(@id,'window')][last()]/*[starts-with(@id,'toolbar')]/*[starts-with(@id,'toolbar')]/*[starts-with(@id,'toolbar')]/*[starts-with(@id,'button')]"),
	窗口右上方收回滑块(ByEnum.ByXPath,".//*[@id='tool-1080-toolEl']"),
	窗口右上方打开滑块(ByEnum.ByXPath,".//*[@id='findParams-1045-placeholder-innerCt']/div/div[2]"),
	MDS信息表格第一行勾选框(ByEnum.ByXPath,".//*[@id='gridview-1064']/table/tbody/tr[2]/td[1]/div/div"),
	MDS信息表格第一行ID版本号(ByEnum.ByXPath,".//*[@id='gridview-1064']/table/tbody/tr[2]/td[3]/div"),
	MDS信息表格第一行供货编号(ByEnum.ByXPath,".//*[@id='gridview-1064']/table/tbody/tr[2]/td[6]/div"),
	MDS信息表格第一行产品名称(ByEnum.ByXPath,".//*[@id='gridview-1064']/table/tbody/tr[2]/td[7]/div"),
	MDS信息表格第一行外文名称(ByEnum.ByXPath,".//*[@id='gridview-1064']/table/tbody/tr[2]/td[8]/div"),
	MDS信息表格第一行MDS状态(ByEnum.ByXPath,".//*[@id='gridview-1064']/table/tbody/tr[2]/td[9]/div"),
	MDS信息表格第一行接收状态(ByEnum.ByXPath,".//*[@id='gridview-1064']/table/tbody/tr[2]/td[10]/div"),
	MDS信息表格第一行时间(ByEnum.ByXPath,".//*[@id='gridview-1064']/table/tbody/tr[2]/td[11]/div"),
	MDS数据下载记录窗口打开查询窗口按钮(ByEnum.ByXPath,".//*[@id='detailButton']/preceding::div[1]"),
	MDS数据下载记录窗口查看详细按钮(ByEnum.ByXPath,".//*[@id='detailButton']"),
	MDS数据下载记录窗口拒绝按钮(ByEnum.ByXPath,".//*[@id='refuseButton']"),
	MDS数据下载记录窗口关闭按钮(ByEnum.ByXPath,".//*[@id='refuseButton']/following::div[1]"),
	MDS数据下载记录窗口表格第一行勾选框(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[1]/div"),
	MDS数据下载记录窗口表格第一行主标识(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[3]/div"),
	MDS数据下载记录窗口表格第一行ID版本(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[4]/div"),
	MDS数据下载记录窗口表格第一行供货编号(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[7]/div"),
	MDS数据下载记录窗口表格第一行产品名称(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[8]/div"),
	MDS数据下载记录窗口表格第一行外文名称(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[9]/div"),
	MDS数据下载记录窗口表格第一行操作员(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[10]/div"),
	MDS数据下载记录窗口表格第一行同步时间(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[11]/div"),
	查找参数操作员输入框(ByEnum.ById,"operatorName-inputEl"),
	查找参数ID输入框(ByEnum.ById,"infoMdsId-inputEl"),
	查找参数供货编号输入框(ByEnum.ById,"comNo-inputEl"),
	查找参数名称输入框(ByEnum.ById,"comName-inputEl"),
	查找参数执行结果输入框(ByEnum.ById,"downloadResultType-inputEl"),
	查找参数执行结果下拉按钮(ByEnum.ByXPath,".//*[@id='downloadResultType-inputCell']/following::td[1]"),
	查找参数执行结果下拉选项_全部(ByEnum.ByXPath,".//li[text()='全部']"),
	查找参数执行结果下拉选项_下载成功(ByEnum.ByXPath,".//li[text()='下载成功']"),
	查找参数执行结果下拉选项_下载失败(ByEnum.ByXPath,".//li[text()='下载失败']"),
	查找参数执行结果下拉选项_下载警告(ByEnum.ByXPath,".//li[text()='下载警告']"),
	查找参数同步查询开始时间输入框(ByEnum.ById,"downloadResultDateFrom-inputEl"),
	查找参数同步查询结束时间输入框(ByEnum.ById,"downloadResultDateTo-inputEl"),
	查找参数查询按钮(ByEnum.ByXPath,".//*[@id='downloadResultDateTo']/../../../../../following::div[1]/div/div/div[1][starts-with(@id,'button')]"),
	查找参数重置按钮(ByEnum.ByXPath,".//*[@id='downloadResultDateTo']/../../../../../following::div[1]/div/div/div[2][starts-with(@id,'button')]"),
	查找参数关闭按钮(ByEnum.ByXPath,".//*[@id='downloadResultDateTo']/../../../../../following::div[1]/div/div/div[3][starts-with(@id,'button')]"),
	查看详细窗口关闭按钮(ByEnum.ByXPath,".//*[starts-with(@id,'window')][last()]/*[contains(@id,'toolbar')]/div/div/div[2][starts-with(@id,'button')]");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_MDS数据同步_332(ByEnum by, String name){
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
