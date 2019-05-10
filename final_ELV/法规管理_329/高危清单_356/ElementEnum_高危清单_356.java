package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_高危清单_356  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1039-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1029']/table/tbody/tr[6]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	品牌名称输入框(ByEnum.ById,"bname-inputEl"),
	车型名称输入框(ByEnum.ById,"mname-inputEl"),
	起始时间输入框(ByEnum.ById,"fromTime-inputEl"),
	终止时间输入框(ByEnum.ById,"toTime-inputEl"),
	检索按钮(ByEnum.ByXPath,".//*[@id='toTime']/following::div[1]"),
	查看车型按钮(ByEnum.ByXPath,".//*[@id='modelsGrid']/div[1]/div/div/div[starts-with(@id,'button')][1]"),
	管理车型的高危部件清单按钮(ByEnum.ByXPath,".//*[@id='modelsGrid']/div[1]/div/div/div[starts-with(@id,'button')][2]"),
	检索结果表格(ByEnum.ByXPath,".//*[@id='modelsGrid-body']/div/table/tbody"),
	检索结果所有行(ByEnum.ByXPath,".//*[@id='modelsGrid-body']/div/table/tbody/tr"),
	检索结果第一行品牌中文名称(ByEnum.ByXPath,".//*[@id='modelsGrid-body']/div/table/tbody/tr[2]/td[3]/div"),
	检索结果第一行品牌英文名称(ByEnum.ByXPath,".//*[@id='modelsGrid-body']/div/table/tbody/tr[2]/td[4]/div"),
	检索结果第一行车型中文名称(ByEnum.ByXPath,".//*[@id='modelsGrid-body']/div/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行车型英文名称(ByEnum.ByXPath,".//*[@id='modelsGrid-body']/div/table/tbody/tr[2]/td[6]/div"),
	检索结果第一行车型记录创建时间(ByEnum.ByXPath,".//*[@id='modelsGrid-body']/div/table/tbody/tr[2]/td[7]/div"),
	第一页提示框最外层(ByEnum.ById,"messagebox-1001"),
	第一页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第一页提示框确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第一页提示框是按钮(ByEnum.ById,"button-1006-btnEl"),
	第一页提示框否按钮(ByEnum.ById,"button-1007-btnEl"),
	第一页提示框右上角关闭按钮(ByEnum.ByXPath,".//*[@id='messagebox-1001_header_hd']/following::div[1]"),
	换页载入界面(ByEnum.ByXPath,".//*[starts-with(@id,'loadmask-')][last()]/div[starts-with(@id,'loadmask-')]/.."),
	查看车型窗口输入框_品牌中文名称(ByEnum.ByXPath,".//*[@id='bcname-inputEl']"),
	查看车型窗口输入框_品牌英文名称(ByEnum.ByXPath,".//*[@id='bename-inputEl']"),
	查看车型窗口输入框_车型中文名称(ByEnum.ByXPath,".//*[@id='mcname-inputEl']"),
	查看车型窗口输入框_车型英文名称(ByEnum.ByXPath,".//*[@id='mename-inputEl']"),
	查看车型窗口输入框_车型编号(ByEnum.ByXPath,".//*[@id='modNo-inputEl']"),
	查看车型窗口输入框_整车质量(ByEnum.ByXPath,".//*[@id='wgt-inputEl']"),
	查看车型窗口输入框_生产年份(ByEnum.ByXPath,".//*[@id='ptYear-inputEl']"),
	查看车型窗口输入框_长(ByEnum.ByXPath,".//*[@id='len-inputEl']"),
	查看车型窗口输入框_宽(ByEnum.ByXPath,".//*[@id='wdh-inputEl']"),
	查看车型窗口输入框_高(ByEnum.ByXPath,".//*[@id='hght-inputEl']"),
	查看车型窗口输入框_填报(ByEnum.ByXPath,".//*[@id='mk-inputEl']"),
	查看车型窗口关闭按钮(ByEnum.ByXPath,".//*[@id='modelInfoWin-body']/following::div[1]/div/div/div"),
	第二页返回按钮(ByEnum.ByXPath,".//*[@id='openMarkWin']/preceding::div[1]"),
	第二页填报按钮(ByEnum.ByXPath,".//*[@id='openMarkWin']"),
	第二页取消填报按钮(ByEnum.ByXPath,".//*[@id='removeMark']"),
	第二页高危清单导出按钮(ByEnum.ByXPath,".//*[@id='rrrReport']"),
	第二页载入页面(ByEnum.ByXPath,".//*[@id='maskload']"),
	BOM树查找按钮(ByEnum.ByXPath,".//*[@id='expandAllTree']/preceding::div[2]"),
	BOM树刷新按钮(ByEnum.ByXPath,".//*[@id='expandAllTree']/preceding::div[1]"),
	BOM树打开树按钮(ByEnum.ByXPath,".//*[@id='expandAllTree']"),
	BOM树关闭树按钮(ByEnum.ByXPath,".//*[@id='expandAllTree']/following::div[1]"),
	BOM树所有节点列表(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr"),
	BOM树根节点前加减号(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div/img[1]"),
	BOM树根节点_BOM节点(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]"),
	BOM树第二层节点_零部件(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[3]"),
	BOM树第三层节点_半成品(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[4]"),
	BOM树第四层节点_材料(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[5]"),
	BOM树第五层节点_物质(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[6]"),
	BOM树选中节点(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[contains(@class,'x-grid-row-focused')]/td/div"),
	BOM树右键菜单填报按钮(ByEnum.ByXPath,".//*[@id='rMenu1-textEl']"),
	BOM树右键菜单取消填报按钮(ByEnum.ByXPath,".//*[@id='rMenu2-textEl']"),
	BOM查找节点名称输入框(ByEnum.ByXPath,".//*[@id='mainform_mdsname-inputEl']"),
	BOM查找供货编号输入框(ByEnum.ByXPath,".//*[@id='mainform_itemnum-inputEl']"),
	BOM查找版本组ID输入框(ByEnum.ByXPath,".//*[@id='mainform_mdsid-inputEl']"),
	BOM查找查找按钮(ByEnum.ByXPath,".//*[@id='btn_search-btnEl']"),
	BOM查找关闭按钮(ByEnum.ByXPath,".//*[@id='btn_cancel-btnEl']"),
	弹出窗口填报按钮(ByEnum.ByXPath,".//*[@id='markOne-btnEl']"),
	弹出窗口零部件通用名称输入框(ByEnum.ByXPath,".//*[@id='markCombo-inputEl']"),
	弹出窗口零部件通用名称选项一(ByEnum.ByXPath,".//div[starts-with(@id,'boundlist')][last()]/div[starts-with(@id,'boundlist')]/ul/li[1]"),
	下方备案参数表(ByEnum.ByXPath,".//*[@id='rrrCalc']/div[4]/div/table/tbody"),
	下方备案参数表所有行(ByEnum.ByXPath,".//*[@id='rrrCalc']/div[4]/div/table/tbody/tr");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_高危清单_356(ByEnum by, String name){
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
