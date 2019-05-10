package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据管理_333;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_材料数据管理_333  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1035-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//a[text()='材料数据管理']"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	查询类型输入框(ByEnum.ById,"queryType-inputEl"),
	查询类型下拉按钮(ByEnum.ByXPath,".//*[@id='queryType-inputCell']/following::td[1]"),
	查询类型下拉选项_全部(ByEnum.ByXPath,".//li[text()='零部件']/preceding::li[1]"),
	查询类型下拉选项_零部件(ByEnum.ByXPath,".//li[text()='零部件']"),
	查询类型下拉选项_半成品(ByEnum.ByXPath,".//li[text()='半成品']"),
	查询类型下拉选项_材料(ByEnum.ByXPath,".//li[text()='材料']"),
	表单来源输入框(ByEnum.ById,"isMdsOwner-inputEl"),
	表单来源下拉按钮(ByEnum.ByXPath,".//*[@id='isMdsOwner-inputCell']/following::td[1]"),
	表单来源下拉选项_camds系统(ByEnum.ByXPath,".//li[text()='camds系统']"),
	表单来源下拉选项_环境合规系统(ByEnum.ByXPath,".//li[text()='环境合规系统']"),
	表单来源下拉选项_全部(ByEnum.ByXPath,".//li[text()='环境合规系统']/following::li[1]"),
	名称输入框(ByEnum.ById,"name-inputEl"),
	供货编号输入框(ByEnum.ById,"symbol-inputEl"),
	ID输入框(ByEnum.ById,"cid-inputEl"),
	查询时间类型输入框(ByEnum.ById,"dateType-inputEl"),
	查询时间类型下拉按钮(ByEnum.ByXPath,".//*[@id='dateType-inputCell']/following::td[1]"),
	查询时间类型下拉选项_不限(ByEnum.ByXPath,".//li[text()='不限']"),
	查询时间类型下来选项_创建时间(ByEnum.ByXPath,".//li[text()='创建时间']"),
	查询时间类型下来选项_更新时间(ByEnum.ByXPath,".//li[text()='更新时间']"),
	查询时间类型下来选项_发布时间(ByEnum.ByXPath,".//li[text()='发布时间']"),
	开始时间输入框(ByEnum.ById,"dateFrom-inputEl"),
	结束时间输入框(ByEnum.ById,"dateTo-inputEl"),
	查找按钮(ByEnum.ByXPath,".//*[@id='button-1014-btnEl']"),
	查看按钮(ByEnum.ByXPath,".//*[@id='uploadCamds']/preceding::div[4]"),
	修改按钮(ByEnum.ByXPath,".//*[@id='uploadCamds']/preceding::div[3]"),
	删除按钮(ByEnum.ByXPath,".//*[@id='uploadCamds']/preceding::div[2]"),
	导入按钮(ByEnum.ByXPath,".//*[@id='uploadCamds']/preceding::div[1]"),
	上传按钮(ByEnum.ByXPath,".//*[@id='uploadCamds']"),
	上传MDS操作记录按钮(ByEnum.ByXPath,".//*[@id='uploadCamdsRecord']"),
	检索结果表格(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody"),
	检索结果所有行(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr"),
	检索结果第一行勾选框(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr[2]/td[1]/div"),
	检索结果第一行ID(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr[2]/td[3]/div"),
	检索结果第一行供货编号(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr[2]/td[6]/div"),
	检索结果第一行产品名称(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr[2]/td[7]/div"),
	检索结果第一行外文名称(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr[2]/td[8]/div"),
	检索结果第一行MDS状态(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr[2]/td[9]/div"),
	检索结果第一行审核状态(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr[2]/td[10]/div"),
	检索结果第一行表单创建部门(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr[2]/td[11]/div"),
	检索结果第一行时间(ByEnum.ByXPath,".//*[@id='mdsInfos-body']/div/table/tbody/tr[2]/td[12]/div"),
	窗口右上方收回滑块(ByEnum.ByXPath,".//*[@id='tool-1046-toolEl']"),
	窗口右上方打开滑块(ByEnum.ByXPath,".//*[@id='findParams-1010-placeholder-innerCt']/div/div[2]"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框是按钮(ByEnum.ById,"button-1006-btnEl"),
	第一页提示框否按钮(ByEnum.ById,"button-1007-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ByXPath,".//*[@id='messagebox-1001_header_hd']/following::div[1]"),
	换页载入界面(ByEnum.ByXPath,".//*[starts-with(@id,'loadmask-')][last()]/div[starts-with(@id,'loadmask-')]/.."),
	材料数据明细标题(ByEnum.ByXPath,".//*[@id='detailcom']/a"),
	上传MDS窗口输入框(ByEnum.ByXPath,".//*[@id='mds-inputCell']"),
	上传MDS窗口浏览按钮(ByEnum.ByXPath,".//*[@id='mds-browseButtonWrap']"),
	上传MDS窗口提交按钮(ByEnum.ByXPath,".//*[@id='mds']/../../../following::div[1]/div/div/div[1][starts-with(@id,'button')]"),
	上传MDS窗口取消按钮(ByEnum.ByXPath,".//*[@id='mds']/../../../following::div[1]/div/div/div[2][starts-with(@id,'button')]"),
	上传MDS窗口窗口标题(ByEnum.ByXPath,".//*[@id='mds']/../../../../div[1]/div/div/div/div[1]/span");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_材料数据管理_333(ByEnum by, String name){
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
