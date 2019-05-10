package cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_进展报表统计_344  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1037-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//a[@target = 'mainFrame'][text()='进展报表统计']"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	表格第一行(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr[2]"),
	查看车型按钮(ByEnum.ById,"button-1037-btnEl"),
	品牌中文名称(ByEnum.ById,"bcname-inputEl"),
	品牌英文名称(ByEnum.ById,"bename-inputEl"),
	车型中文名称(ByEnum.ById,"mcname-inputEl"),
	车型英文名称(ByEnum.ById,"mename-inputEl"),
	车型编号(ByEnum.ById,"modNo-inputEl"),
	整车质量(ByEnum.ById,"wgt-inputEl"),
	生产年份(ByEnum.ById,"ptYear-inputEl"),
	长(ByEnum.ById,"len-inputEl"),
	宽(ByEnum.ById,"wdh-inputEl"),
	高(ByEnum.ById,"hght-inputEl"),
	表格第一行品牌中文名称(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[3]/div"),
	表格第一行品牌英文名称(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[4]/div"),
	表格第一行车型中文名称(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[5]/div"),
	表格第一行车型英文名称(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[6]/div"),
	关闭按钮(ByEnum.ByXPath,".//*[@id='modelInfoWin']/div[3]/div/div/div/em/button"),
	关闭叉叉(ByEnum.ByXPath,".//*[@id='modelInfoWin']/div[1]/div/div/div/div[2]/img"),
	查看车型两率按钮(ByEnum.ById,"button-1038-btnEl"),
	未选择记录提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	提示窗口确定按钮(ByEnum.ById,"button-1005-btnEl"),
	两率_车型中文(ByEnum.ByXPath,"//div[contains(@id, 'window') and contains(@class, 'x-layer')]/div[2]/div/div[1]/table/tbody/tr[1]//input"),
	两率_车型英文(ByEnum.ByXPath,"//div[contains(@id, 'window') and contains(@class, 'x-layer')]/div[2]/div/div[1]/table/tbody/tr[2]//input"),
	填报率(ByEnum.ByXPath,"//div[contains(@id, 'window') and contains(@class, 'x-layer')]/div[2]/div/div[1]/table/tbody/tr[3]//input"),
	审核率(ByEnum.ByXPath,"//div[contains(@id, 'window') and contains(@class, 'x-layer')]/div[2]/div/div[1]/table/tbody/tr[4]//input"),
	两率_关闭按钮(ByEnum.ByXPath,"//div[contains(@id, 'window') and contains(@class, 'x-layer')]/div[2]//button"),
	两率_最大化(ByEnum.ByXPath,"html/body/div[10]/div[1]/div/div/div/div[2]/img"),
	两率_窗口(ByEnum.ById,"window-1054-body"),
	查看车型所属部门的两率清单(ByEnum.ById,"button-1039-btnEl"),
	总部门左侧加号(ByEnum.ByXPath,"html/body/div[1]/div[2]/div/div[3]/div/table/tbody/tr[2]/td/div/img[1]"),
	总部门下第一项(ByEnum.ByXPath,"html/body/div[1]/div[2]/div/div[3]/div/table/tbody/tr[3]/td/div"),
	总部门(ByEnum.ByXPath,"html/body/div[1]/div[2]/div/div[3]/div/table/tbody/tr[2]/td/div"),
	详细信息所有行(ByEnum.ByXPath,"html/body/div[1]/div[3]/div/table/tbody/tr"),
	下载按钮(ByEnum.ById,"button-1021-btnEl"),
	返回按钮(ByEnum.ById,"button-1022-btnEl"),
	iframe(ByEnum.ByName,"contentIframe"),
	刷新(ByEnum.ById,"button-1016-btnEl"),
	打开树按钮(ByEnum.ById,"button-1014-btnEl"),
	关闭树按钮(ByEnum.ById,"button-1015-btnEl"),
	树图所有项(ByEnum.ByXPath,"html/body/div[1]/div[2]/div/div[3]/div/table/tbody/tr"),
	表格所有项(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr"),
	表格第一行BOM(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[8]/div"),
	车型名称查询(ByEnum.ById,"mname-inputEl"),
	品牌名称查询(ByEnum.ById,"bname-inputEl"),
	创建时间起始(ByEnum.ById,"fromTime-inputEl"),
	创建时间截止(ByEnum.ById,"toTime-inputEl"),
	检索按钮(ByEnum.ById,"button-1011-btnEl"),
	表格第一行时间(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[7]/div"),
	时间错误提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	时间错误提示确定键(ByEnum.ById,"button-1005-btnEl"),
	下一页(ByEnum.ById,"button-1030-btnEl"),
	最后一页(ByEnum.ById,"button-1031-btnEl"),
	上一页(ByEnum.ById,"button-1024-btnEl"),
	第一页(ByEnum.ById,"button-1023-btnEl"),
	右下角数量提示(ByEnum.ById,"tbtext-1035"),
	页码输入框(ByEnum.ById,"numberfield-1027-inputEl"),
	表格第一行序号(ByEnum.ByXPath,"html/body/div[2]/div[3]/div/table/tbody/tr[2]/td[2]/div"),
	总页数(ByEnum.ById,"tbtext-1028"),
	Loading框(ByEnum.ById,"loadmask-1042-msgEl"),
	错误提示框(ByEnum.ById,"messagebox-1001");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_进展报表统计_344(ByEnum by, String name){
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
