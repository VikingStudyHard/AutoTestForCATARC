package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_零部件RRR计算_345  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1037-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1021']/table/tbody/tr[6]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	选择查询类型(ByEnum.ById,"ext-gen1204"),
	选择查询类型_全部(ByEnum.ByXPath,".//*[@id='boundlist-1093-listEl']/ul/li[1]"),
	选择查询类型_零部件(ByEnum.ByXPath,"//div[@id='boundlist-1093-listEl']/ul/li[2]"),
	选择查询类型_半成品(ByEnum.ByXPath,".//*[@id='boundlist-1093-listEl']/ul/li[3]"),
	选择查询类型_材料(ByEnum.ByXPath,".//*[@id='boundlist-1093-listEl']/ul/li[4]"),
	名称输入框(ByEnum.ById,"name-inputEl"),
	供货编号输入框(ByEnum.ById,"symbol-inputEl"),
	查询按钮(ByEnum.ById,"button-1054-btnEl"),
	查询结果表格(ByEnum.ByXPath,".//*[@id='gridview-1067']/table/tbody"),
	查询结果表格所有行(ByEnum.ByXPath,".//*[@id='gridview-1067']/table/tbody/tr"),
	MSD信息标注按钮(ByEnum.ById,"button-1083-btnEl"),
	MSD信息选择按钮1(ByEnum.ByXPath,".//*[@id='gridview-1067']/table/tbody/tr[2]/td[1]/div/div"),
	MSD信息选择按钮2(ByEnum.ByXPath,".//*[@id='gridview-1067']/table/tbody/tr[3]/td[1]/div/div"),
	MSD信息异常信息提示确定按钮(ByEnum.ByXPath,".//*[@id='button-1005-btnEl']"),
	载入界面(ByEnum.ById,"maskload"),
	MSD信息查看按钮(ByEnum.ById,"button-1082-btnEl"),
	MSD信息查看标注记录按钮(ByEnum.ById,"button-1084-btnEl"),
	MSD信息查看标注记录页面(ByEnum.ById,"loadmask-1091"),
	查看打开树按钮(ByEnum.ByXPath,".//*[@id='contentbody']/table/tbody/tr[1]/td/img[1]"),
	查看关闭树按钮(ByEnum.ByXPath,".//*[@id='contentbody']/table/tbody/tr[1]/td/img[2]"),
	符号树操作按钮(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr/td/div/img[1]"),
	查看信息页标题(ByEnum.ByXPath,".//*[@id='status']/ul/li[1]"),
	查看页树所有行(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr"),
	母树文字(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr/td/div/span"),
	母树明细文字(ByEnum.ById,"cicname"),
	子树文字(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div/span"),
	子树明细文字(ByEnum.ById,"cocname"),
	明细下一步(ByEnum.ById,"nextButton"),
	企业信息标题(ByEnum.ByXPath,".//*[@id='status']/ul/li[1]"),
	企业信息页上一步按钮(ByEnum.ById,"button_text_return"),
	查看标注记录(ByEnum.ById,"button-1084-btnEl"),
	打开查询窗口(ByEnum.ById,"button-1045-btnEl"),
	部件号(ByEnum.ById,"markCsymbol-inputEl"),
	开始时间输入框(ByEnum.ById,"markResultDateFrom-inputEl"),
	结束时间输入框(ByEnum.ById,"markResultDateTo-inputEl"),
	查看标注记录检索(ByEnum.ById,"button-1011-btnEl"),
	检索结果第一行生产年份(ByEnum.ByXPath,".//*[@id='gridview-1029']/table/tbody/tr[2]/td[12]/div"),
	错误信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	检索结果所有行(ByEnum.ByXPath,".//*[@id='gridview-1029']/table/tbody/tr"),
	检索结果第一行部件名称(ByEnum.ByXPath,".//*[@id='gridview-1029']/table/tbody/tr[2]/td[5]/div"),
	错误信息确定按钮(ByEnum.ById,"button-1005-btnEl"),
	关闭查询窗口按钮(ByEnum.ById,"button-1013-btnEl"),
	产品名称查询(ByEnum.ById,"markCname-inputEl"),
	检索结果第一行产品名称(ByEnum.ByXPath,".//*[@id='gridview-1029']/table/tbody/tr[2]/td[6]/div"),
	ID查询(ByEnum.ById,"markCid-inputEl"),
	检索结果第一行ID名称(ByEnum.ByXPath,".//*[@id='gridview-1029']/table/tbody/tr[2]/td[2]/div"),
	标注状态选择(ByEnum.ById,"ext-gen1209"),
	标注状态选择全部(ByEnum.ByXPath,".//*[@id='ext-gen1018']/div/div/ul/li[1]"),
	标注状态选择标注锁定(ByEnum.ByXPath,".//*[@id='ext-gen1018']/div/div/ul/li[2]"),
	标注状态选择标注未锁定(ByEnum.ByXPath,".//*[@id='ext-gen1018']/div/div/ul/li[3]"),
	检索结果第一行标注(ByEnum.ByXPath,".//*[@id='gridview-1067']/table/tbody/tr[2]/td[9]/div"),
	ID主页(ByEnum.ById,"cid-inputEl"),
	检索结果第一行ID主页(ByEnum.ByXPath,".//*[@id='gridview-1067']/table/tbody/tr[2]/td[3]/div"),
	名称主页(ByEnum.ById,"name-inputEl"),
	检索结果第一行产品名称主页(ByEnum.ByXPath,".//*[@id='gridview-1067']/table/tbody/tr[2]/td[6]/div"),
	检索结果第一行外文名称主页(ByEnum.ByXPath,".//*[@id='gridview-1067']/table/tbody/tr[2]/td[7]/div"),
	筛选标注按钮(ByEnum.ById,"button-1087-btnEl"),
	筛选标注页面导出按钮(ByEnum.ByXPath,".//*[@id='screeningMarkZtx']/div[3]/div/div/div[2]"),
	回收处理阶段(ByEnum.ByXPath,".//*[@id='mater-triggerWrap']/tbody/tr[1]/td[2]/div"),
	回收处理阶段选择1(ByEnum.ByXPath,".//*[@id='ext-gen1018']/div/div/ul/li[2]"),
	材料分类(ByEnum.ByXPath,".//*[@id='sto_combo-triggerWrap']/tbody/tr[1]/td[2]/div"),
	材料分类选择1(ByEnum.ByXPath,".//*[@id='ext-gen1018']/div/div/ul/li[9]"),
	自动筛选(ByEnum.ById,"button-1085-btnEl"),
	车型信息旁的选择按钮(ByEnum.ById,"button-1052-btnEl"),
	新页面的刷新按钮(ByEnum.ById,"button-1038-btnEl"),
	第一页按钮(ByEnum.ById,"button-1068-btnEl"),
	上一页按钮(ByEnum.ById,"button-1069-btnEl"),
	下一页按钮(ByEnum.ById,"button-1075-btnEl"),
	最后页按钮(ByEnum.ById,"button-1076-btnEl"),
	页码显示及输入框(ByEnum.ById,"numberfield-1072-inputEl"),
	页码总数显示(ByEnum.ById,"tbtext-1073"),
	换页载入界面(ByEnum.ById,"loadmask-1091"),
	标注页面跳转标题(ByEnum.ById,"panel-1014_header_hd-textEl"),
	标注页面刷新按钮(ByEnum.ById,"button-1021-btnEl"),
	标注页面打开树按钮(ByEnum.ById,"expandAllTree-btnEl"),
	标注打开树所有行(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr"),
	标注页面关闭树按钮(ByEnum.ById,"button-1022-btnEl"),
	标注符号树操作(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td//div/img[1]");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_零部件RRR计算_345(ByEnum by, String name){
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
