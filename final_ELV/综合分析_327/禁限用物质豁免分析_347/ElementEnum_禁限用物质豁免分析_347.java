package cn.edu.tju.scs.seql.final_ELV.综合分析_327.禁限用物质豁免分析_347;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_禁限用物质豁免分析_347  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1037-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//a[@target = 'mainFrame'][text()='禁限用物质豁免分析']"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	车型名称输入框(ByEnum.ById,"mname-inputEl"),
	创建时间起点输入框(ByEnum.ById,"fromTime-inputEl"),
	创建时间终点输入框(ByEnum.ById,"toTime-inputEl"),
	品牌名称输入框(ByEnum.ById,"bname-inputEl"),
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
	检索结果第一行车型中文名称(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[4]/div"),
	检索结果第一行车型英文名称(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行品牌中文名称(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[2]/div"),
	检索结果第一行品牌英文名称(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[3]/div"),
	检索结果第一行生产年份(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[2]/td[7]/div"),
	开始时间早于结束时间错误信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	载入界面(ByEnum.ById,"maskload"),
	第二页返回按钮(ByEnum.ById,"button-1011-btnEl"),
	第二页导出有害物质清单按钮(ByEnum.ById,"button-1012-btnEl"),
	第二页取消标注按钮(ByEnum.ById,"removeMark-btnEl"),
	第二页有害标注按钮(ByEnum.ById,"openMarkWin-btnEl"),
	第二页弹窗确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第二页弹窗是按钮(ByEnum.ById,"button-1006-btnEl"),
	第二页弹窗否按钮(ByEnum.ById,"button-1007-btnEl"),
	有害标注页面的有害标注按钮(ByEnum.ById,"markOne-btnEl"),
	有害标注页面节点中文名称输入框(ByEnum.ByXPath,".//*[@id='winMark-body']/table/tbody[1]/tr/td[2]/input"),
	有害标注页面节点有害标注信息输入框(ByEnum.ByXPath,".//*[@id='winMark-body']/table/tbody[4]/tr/td[2]"),
	有害标注页面的有害标注信息选择输入框(ByEnum.ById,"markCombo-inputEl"),
	有害标注信息为减震器(ByEnum.ByXPath,".//*[@id='boundlist-1070']/div/ul/li[3]"),
	检索树形图所有行(ByEnum.ByXPath,".//*[@id='treeview-1018']/table/tbody/tr"),
	BOM树形刷新按钮(ByEnum.ById,"button-1022-btnEl"),
	BOM树形展开按钮(ByEnum.ById,"expandAllTree-btnEl"),
	BOM树形关闭按钮(ByEnum.ById,"button-1023-btnEl"),
	BOM树形查找按钮(ByEnum.ById,"button-1021-btnEl"),
	BOM树形前方加号按钮(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div/img[1]"),
	BOM树形前方减号按钮(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div/img[1]"),
	BOM树形图第一个子节点(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[3]/td/div"),
	定位页面中的搜索按钮(ByEnum.ById,"btn_search-btnEl"),
	定位页面中的取消按钮(ByEnum.ById,"btn_cancel-btnEl"),
	定位页面中的节点名称输入框(ByEnum.ById,"mainform_mdsname-inputEl"),
	定位页面中的供货编号输入框(ByEnum.ById,"mainform_itemnum-bodyEl"),
	车型BOM所有行(ByEnum.ByXPath,".//*[@id='treeview-1018']/table/tbody/tr"),
	进度条加载界面(ByEnum.ById,"messagebox-1001-displayfield-labelCell"),
	节点信息所有行(ByEnum.ByXPath,".//*[@id='gridview-1034']/table/tbody/tr"),
	节点信息表中的节点中文名称(ByEnum.ByXPath,".//*[@id='gridview-1034']/table/tbody/tr[2]/td[1]/div"),
	节点信息表中的节点英文名称(ByEnum.ByXPath,".//*[@id='gridview-1034']/table/tbody/tr[2]/td[2]/div"),
	节点信息表中的供货编号(ByEnum.ByXPath,".//*[@id='gridview-1034']/table/tbody/tr[2]/td[3]/div"),
	提示信息确定按钮(ByEnum.ById,"button-1005"),
	车型信息第一行(ByEnum.ByXPath,".//*[@id='gridview-1023']/table/tbody/tr[3]");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_禁限用物质豁免分析_347(ByEnum by, String name){
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
