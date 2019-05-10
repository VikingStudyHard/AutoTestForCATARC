package cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_有害物质分析_342  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1037-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1021']/table/tbody/tr[2]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	品牌名称输入框(ByEnum.ById,"bname-inputEl"),
	车型名称输入框(ByEnum.ById,"mname-inputEl"),
	创建时间起点输入框(ByEnum.ById,"fromTime-inputEl"),
	创建时间终点输入框(ByEnum.ById,"toTime-inputEl"),
	检索按钮(ByEnum.ById,"button-1011-btnEl"),
	第一页确定按钮(ByEnum.ById,"gotoBomPage-btnEl"),
	第一页刷新按钮(ByEnum.ById,"button-1038"),
	第一页按钮(ByEnum.ById,"button-1024-btnEl"),
	上一页按钮(ByEnum.ById,"button-1025-btnEl"),
	下一页按钮(ByEnum.ById,"button-1031-btnEl"),
	最后页按钮(ByEnum.ById,"button-1032-btnEl"),
	页码显示及输入框(ByEnum.ById,"numberfield-1028-inputEl"),
	页码总数显示(ByEnum.ById,"tbtext-1029"),
	换页载入界面(ByEnum.ById,"loadmask-1041"),
	快速提示信息(ByEnum.ById,"ext-quicktips-tip"),
	检索结果所有行(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr"),
	检索结果表格(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody"),
	检索结果第一行品牌中文名称(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[2]/div"),
	检索结果第一行品牌英文名称(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[3]/div"),
	检索结果第一行车型中文名称(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[4]/div"),
	检索结果第一行车型英文名称(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行整车质量(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[6]/div"),
	检索结果第一行生产年份(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[7]/div"),
	检索结果第一行长(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[8]/div"),
	检索结果第一行宽(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[9]/div"),
	检索结果第一行高(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[10]/div"),
	开始时间早于结束时间错误信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	树形图第一个根节点(ByEnum.ByXPath,".//*[@id='treeview-1013']/table/tbody/tr[2]/td/div"),
	法规选择下拉框(ByEnum.ById,"ext-gen1131"),
	第一条法规(ByEnum.ByXPath,".//*[@id='boundlist-1060-listEl']/ul/li[1]"),
	物质选择下拉框(ByEnum.ById,"ext-gen1134"),
	第一个物质选项(ByEnum.ByXPath,".//*[@id='boundlist-1062-listEl']/ul/li[1]"),
	载入界面(ByEnum.ById,"maskload"),
	全部显示多选框(ByEnum.ById,"ext-gen1137"),
	全部显示选项(ByEnum.ByXPath,".//*[@id='boundlist-1062-listEl']/ul/li[1]"),
	合规部分显示选项(ByEnum.ByXPath,".//*[@id='boundlist-1062-listEl']/ul/li[2]"),
	不合规部分显示选项(ByEnum.ByXPath,".//*[@id='boundlist-1062-listEl']/ul/li[3]"),
	按树节点搜索单选按钮(ByEnum.ById,"radiofield-1049-inputEl"),
	按特定物质搜索单选按钮(ByEnum.ById,"radiofield-1050-inputEl"),
	第二页确定按钮(ByEnum.ById,"button-1053-btnEl"),
	第二页返回按钮(ByEnum.ById,"button-1052-btnEl"),
	第二页下载分析结果按钮(ByEnum.ById,"button-1054-btnEl"),
	第二页备注按钮(ByEnum.ById,"button-1055-btnEl"),
	第二页弹窗确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第二页弹窗提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	BOM树形刷新按钮(ByEnum.ById,"button-1016-btnEl"),
	BOM树形展开按钮(ByEnum.ById,"button-1017-btnEl"),
	BOM树形关闭按钮(ByEnum.ById,"button-1018-btnEl"),
	BOM树形前方加号按钮(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div/img[1]"),
	BOM树形前方减号按钮(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div/img[1]");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_有害物质分析_342(ByEnum by, String name){
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
