package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_整车RRR计算_346  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1037-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//a[@target = 'mainFrame'][text()='整车RRR计算']"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	品牌名称输入框(ByEnum.ById,"bname-inputEl"),
	车型名称输入框(ByEnum.ById,"mname-inputEl"),
	创建时间起点输入框(ByEnum.ById,"fromTime-inputEl"),
	创建时间终点输入框(ByEnum.ById,"toTime-inputEl"),
	检索按钮(ByEnum.ById,"button-1011-btnEl"),
	第一页确定按钮(ByEnum.ById,"gotoBomPage-btnEl"),
	第一页刷新按钮(ByEnum.ById,"button-1038-btnEl"),
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
	树形图第一个根节点(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div"),
	第二页自动标注按钮(ByEnum.ById,"autoMark-btnEl"),
	第二页取消标注按钮(ByEnum.ById,"removeMark-btnEl"),
	第二页清空标注按钮(ByEnum.ById,"deleteMark-btnEl"),
	第二页返回按钮(ByEnum.ById,"button-1011-btnEl"),
	第二页校验按钮(ByEnum.ById,"validation-btnEl"),
	第二页回收利用率信息标注按钮(ByEnum.ById,"openMarkWin-btnEl"),
	第二页回收利用率报告按钮(ByEnum.ById,"recycling-btnEl"),
	第二页双选弹窗是按钮(ByEnum.ById,"button-1006"),
	第二页双选弹窗否按钮(ByEnum.ById,"button-1007"),
	第二页弹窗提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第二页单选弹窗确认按钮(ByEnum.ById,"button-1005-btnEl"),
	第二页载入界面(ByEnum.ById,"maskload"),
	BOM树中标注锁定选项(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[6]/td/div"),
	BOM树形刷新按钮(ByEnum.ById,"button-1021-btnEl"),
	BOM树形展开按钮(ByEnum.ById,"expandAllTree-btnEl"),
	BOM树形关闭按钮(ByEnum.ById,"button-1022-btnEl"),
	BOM树形前方加号按钮(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div/img[1]"),
	BOM树形前方减号按钮(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div/img[1]"),
	BOM树已标注子节点(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[6]/td/div"),
	BOM树已标注子节点前加号(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[6]/td/div/img[2]"),
	BOM树中物质节点(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[7]/td/div"),
	BOM树未标注子节点(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[3]/td/div"),
	回收利用率信息标注弹窗输入框(ByEnum.ById,"markCombo-inputEl"),
	回收利用率信息标注弹窗选项_预处理(ByEnum.ByXPath,".//*[@id='winMark']/following::div[2]/div/ul/li[1]"),
	回收利用率信息标注弹窗选项_拆解(ByEnum.ByXPath,".//*[@id='winMark']/following::div[2]/div/ul/li[2]"),
	回收利用率信息标注弹窗选项_不可回收(ByEnum.ByXPath,".//*[@id='winMark']/following::div[2]/div/ul/li[3]"),
	回收利用率信息标注弹窗标注按钮(ByEnum.ById,"markOne-btnEl"),
	第三页报告查询按钮(ByEnum.ById,"button-1014-btnEl"),
	第三页载入界面(ByEnum.ById,"loadmask-1043"),
	第三页所有检索结果(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr"),
	第三页检索结果第一行ID(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr[2]/td[3]/div"),
	第三页确定按钮(ByEnum.ById,"btnCommit-btnEl"),
	第三页查询类型输入框(ByEnum.ById,"queryType-inputEl"),
	第三页表单来源输入框(ByEnum.ById,"isMdsOwner-inputEl"),
	第三页名称输入框(ByEnum.ById,"name-inputEl"),
	第三页供货编号输入框(ByEnum.ById,"symbol-inputEl"),
	第三页ID输入框(ByEnum.ById,"cid-inputEl"),
	第三页查询时间类型输入框(ByEnum.ById,"dateType-inputEl"),
	第三页开始时间输入框(ByEnum.ById,"dateFrom-inputEl"),
	第三页结束时间输入框(ByEnum.ById,"dateTo-inputEl"),
	第三页查询类型选项_全部(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[1]"),
	第三页查询类型选项_零部件(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[2]"),
	第三页查询类型选项_半成品(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[3]"),
	第三页查询类型选项_材料(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[4]"),
	第三页表单来源选项_全部(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[1]"),
	第三页表单来源选项_camds系统(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[2]"),
	第三页表单来源选项_环境合规系统(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[3]"),
	第三页查询时间类型选项_不限(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[1]"),
	第三页查询时间类型选项_创建时间(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[2]"),
	第三页查询时间类型选项_更新时间(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[3]"),
	第三页查询时间类型选项_发布时间(ByEnum.ByXPath,".//*[@id='boundlist-1045-listEl']/ul/li[4]"),
	第三页查询结果所有行(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr"),
	第三页查询结果第一行ID(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr[2]/td[3]/div"),
	第三页查询结果第一行版本号(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr[2]/td[3]/div"),
	第三页查询结果第一行供货编号(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr[2]/td[3]/div"),
	第三页查询结果第一行产品名称(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr[2]/td[3]/div"),
	第三页查询结果第一行外文名称(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr[2]/td[3]/div"),
	第三页查询结果第一行MDS状态(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr[2]/td[3]/div"),
	第三页查询结果第一行表单创建部门(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr[2]/td[3]/div"),
	第三页查询结果第一行时间(ByEnum.ByXPath,".//*[@id='gridview-1025']/table/tbody/tr[2]/td[3]/div"),
	第三页提示信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	第三页弹窗确认按钮(ByEnum.ById,"button-1005-btnEl");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_整车RRR计算_346(ByEnum by, String name){
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
