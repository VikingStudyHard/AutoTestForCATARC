package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_零部件BOM信息_339  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"treepanel-1014_header_hd"),
	二级目录名称(ByEnum.ByXPath,"html/body/div/div[2]/div/div/div[2]/div[3]/div/table/tbody/tr[5]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	BOM名称输入框(ByEnum.ById,"bname-inputEl"),
	供货编号输入框(ByEnum.ById,"symbol-inputEl"),
	创建时间起始(ByEnum.ById,"fromTime-inputEl"),
	创建时间截止(ByEnum.ById,"toTime-inputEl"),
	检索键(ByEnum.ById,"button-1011-btnEl"),
	检索结果第一行(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]"),
	检索结果所有行(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr"),
	检索结果第一行产品名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[3]/div"),
	检索结果第一行外文名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[4]/div"),
	检索结果第一行供货编号(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行时间(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[6]/div"),
	Loading框(ByEnum.ById,"loadmask-1042"),
	时间错误提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	时间错误提示确定键(ByEnum.ById,"button-1005-btnEl"),
	查看BOM键(ByEnum.ById,"button-1037-btnEl"),
	树形图根节点(ByEnum.ByXPath,"html/body/div[1]/div/div[1]/div[2]/div/div[3]/div/table/tbody/tr[2]"),
	树形图所有行(ByEnum.ByXPath,"html/body/div[1]/div/div[1]/div[2]/div/div[3]/div/table/tbody/tr"),
	导出键(ByEnum.ById,"exportButton-btnEl"),
	返回键(ByEnum.ById,"returnButton-btnEl"),
	未选择信息错误提示(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	未选择信息错误提示确定键(ByEnum.ById,"button-1005-btnEl"),
	树形图根节点左侧加号(ByEnum.ByXPath,"html/body/div[1]/div/div[1]/div[2]/div/div[3]/div/table/tbody/tr[2]/td/div/img[1]"),
	查看BOM子页面查找树键(ByEnum.ByXPath,"html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[7]/em/button"),
	查看BOM子页面查找树框名称(ByEnum.ById,"mainform_mdsname-inputEl"),
	查看BOM子页面查找树框部件号(ByEnum.ById,"mainform_itemnum-inputEl"),
	查看BOM子页面查找树框ID编号(ByEnum.ById,"mainform_mdsid-inputEl"),
	查看BOM子页面查找树框查找键(ByEnum.ById,"button-1045-btnEl"),
	查看BOM子页面查找树框取消键(ByEnum.ById,"button-1046-btnEl"),
	查看BOM子页面节点信息中文名称(ByEnum.ByXPath,"html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div/table/tbody/tr[2]/td[1]/div"),
	查看BOM子页面节点信息ID(ByEnum.ByXPath,"html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div/table/tbody/tr[2]/td[2]/div"),
	查看BOM子页面节点信息供货编号(ByEnum.ByXPath,"html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div/table/tbody/tr[2]/td[3]/div"),
	查看BOM子页面查找树框(ByEnum.ById,"window-1053"),
	查看BOM子页面打开树键(ByEnum.ByXPath,"html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[5]/em/button"),
	查看BOM子页面关闭树键(ByEnum.ByXPath,"html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[6]/em/button"),
	整体匹配键(ByEnum.ById,"matchButton-btnEl"),
	匹配结果键(ByEnum.ById,"MatchresuleButton-btnEl"),
	匹配结果子页面下载数据键(ByEnum.ById,"button-1036-btnEl"),
	匹配结果子页面发送键(ByEnum.ById,"button-1035-btnEl"),
	匹配结果子页面关闭键(ByEnum.ById,"button-1037-btnEl"),
	匹配结果子页面未选择提示框(ByEnum.ByXPath,"//div[contains(@class, 'x-message-box') and not(contains(@class,'x-hide-offsets'))]"),
	匹配结果子页面未选择提示框确定键(ByEnum.ByXPath,"//div[contains(@class, 'x-message-box') and not(contains(@class,'x-hide-offsets'))]/div[last()]//button"),
	匹配结果子页面表格第一行(ByEnum.ByXPath,"html/body/div[1]/div[4]/div/table/tbody/tr[2]"),
	匹配结果子页面表格第一行状态(ByEnum.ByXPath,"html/body/div[1]/div[4]/div/table/tbody/tr[2]/td[8]/div"),
	页面标题(ByEnum.ByXPath,"html/body/div[1]/div[1]/div/div/div/div/span"),
	匹配结果子页面返回键(ByEnum.ByXPath,"//span[text()='返回']"),
	新增BOM键(ByEnum.ById,"button-1036-btnEl"),
	body(ByEnum.ById,"ext-gen1018"),
	新增BOM子页面查找树键(ByEnum.ByXPath,"html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[7]/em/button"),
	新增BOM子页面查找树框名称(ByEnum.ById,"mainform_mdsname-inputEl"),
	新增BOM子页面查找树框部件号(ByEnum.ById,"mainform_itemnum-inputEl"),
	新增BOM子页面查找树框ID编号(ByEnum.ById,"mainform_mdsid-inputEl"),
	新增BOM子页面查找树框查找键(ByEnum.ById,"button-1045-btnEl"),
	新增BOM子页面查找树框取消键(ByEnum.ById,"button-1046-btnEl"),
	新增BOM子页面新增键(ByEnum.ById,"addtbar-btnEl"),
	新增BOM子页面删除键(ByEnum.ById,"deletetbar-btnEl"),
	新增BOM子页面挂接键(ByEnum.ById,"matchtbar-btnEl"),
	新增BOM子页面修改键(ByEnum.ById,"edittbar-btnEl"),
	新增BOM子页面新增框名称(ByEnum.ById,"editText-inputEl"),
	新增BOM子页面新增框供货编号(ByEnum.ById,"editcsymbol-inputEl"),
	新增BOM子页面新增框责任人(ByEnum.ById,"responsibleName-inputEl"),
	新增BOM子页面新增框确定键(ByEnum.ByXPath,"//div[@id='winMark']/div[3]/div/div/div[1]//button"),
	新增BOM子页面新增框取消键(ByEnum.ByXPath,"//div[@id='winMark']/div[3]/div/div/div[2]//button"),
	新增BOM子页面新增框质量(ByEnum.ById,"editweight-inputEl"),
	新增BOM子页面新增框数量(ByEnum.ById,"editquarity-inputEl"),
	修改BOM键(ByEnum.ById,"button-1038-btnEl"),
	修改未选择错误提示(ByEnum.ByXPath,"//div[@id='messagebox-1001']"),
	修改未选择错误提示确定键(ByEnum.ByXPath,"//div[@id='messagebox-1001']/div[last()]//button"),
	检索结果第一行MDS状态(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[7]/div"),
	BOM树形标签(ByEnum.ByXPath,"html/body/div[1]/div/div[1]/div[1]/div/div/div/div/span"),
	保存键(ByEnum.ById,"saveButton-btnEl"),
	挂接子页面查找键(ByEnum.ById,"button-1014-btnEl"),
	挂接子页面表格第一行(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]"),
	挂接子页面确定键(ByEnum.ById,"button-1041-btnEl"),
	树形图选中行(ByEnum.ByXPath,"//tr[contains(@class, 'x-grid-row-selected')]"),
	挂接子页面表格第一行产品名称(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[6]/div"),
	上一页(ByEnum.ById,"button-1023-btnEl"),
	下一页(ByEnum.ById,"button-1029-btnEl"),
	第一页(ByEnum.ById,"button-1022-btnEl"),
	最后一页(ByEnum.ById,"button-1030-btnEl"),
	总页数(ByEnum.ById,"tbtext-1027"),
	页码输入框(ByEnum.ById,"numberfield-1026-inputEl"),
	表格第一行序号(ByEnum.ByXPath,"html/body/div[2]/div[4]/div/table/tbody/tr[2]/td[2]/div"),
	右下角数量提示(ByEnum.ById,"tbtext-1034"),
	删除节点确定键(ByEnum.ByXPath,"//div[@id='messagebox-1001']/div[last()]/div/div/div[2]//button"),
	删除节点取消键(ByEnum.ByXPath,"//div[@id='messagebox-1001']/div[last()]/div/div/div[3]//button"),
	删除键(ByEnum.ById,"button-1039-btnEl"),
	未选择信息确定键(ByEnum.ByXPath,"//div[@id='messagebox-1001']/div[last()]/div/div/div[1]//button");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_零部件BOM信息_339(ByEnum by, String name){
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
