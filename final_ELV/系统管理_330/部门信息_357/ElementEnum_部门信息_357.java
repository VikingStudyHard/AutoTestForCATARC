package cn.edu.tju.scs.seql.final_ELV.系统管理_330.部门信息_357;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_部门信息_357  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"treepanel-1030_header_hd-textEl"),
	二级目录名称(ByEnum.ByXPath,"html/body/div/div[2]/div/div/div[6]/div[3]/div/table/tbody/tr[2]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	body(ByEnum.ByXPath,"html/body"),
	刷新键(ByEnum.ById,"button-1017-btnEl"),
	功能菜单所有行(ByEnum.ByXPath,"html/body/div[1]/div[2]/div/div[3]/div/table/tbody/tr"),
	打开树键(ByEnum.ById,"button-1015-btnWrap"),
	关闭树键(ByEnum.ById,"button-1016-btnWrap"),
	详细信息标题(ByEnum.ByXPath,"html/body/form/div/table[1]/tbody/tr/td/div"),
	contentFrame(ByEnum.ById,"contentIframe"),
	右键菜单添加键(ByEnum.ByXPath,"//div[contains(@id, 'treeContextMenu') and contains(@class, 'x-layer') and not(contains(@style, 'visibility: hidden'))]/div/div[2]/div[2]/div[1]"),
	右键菜单删除键(ByEnum.ByXPath,"//div[contains(@id, 'treeContextMenu') and contains(@class, 'x-layer') and not(contains(@style, 'visibility: hidden'))]/div/div[2]/div[2]/div[2]"),
	右键菜单编辑键(ByEnum.ByXPath,"//div[contains(@id, 'treeContextMenu') and contains(@class, 'x-layer') and not(contains(@style, 'visibility: hidden'))]/div/div[2]/div[2]/div[3]"),
	添加页面名称(ByEnum.ById,"textfield-1010-inputEl"),
	添加页面ID(ByEnum.ById,"textfield-1015-inputEl"),
	添加页面保存键(ByEnum.ById,"button-1023-btnEl"),
	添加页面重置键(ByEnum.ById,"button-1024-btnEl"),
	添加页面取消键(ByEnum.ById,"button-1025-btnEl"),
	添加成功确定键(ByEnum.ByXPath,"//div[@id='messagebox-1001']/div[last()]/div/div/div[1]//button"),
	删除确定键(ByEnum.ByXPath,"//div[@id='messagebox-1001']/div[last()]/div/div/div[2]//button"),
	删除取消键(ByEnum.ByXPath,"//div[@id='messagebox-1001']/div[last()]/div/div/div[3]//button");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_部门信息_357(ByEnum by, String name){
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
