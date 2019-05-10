package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据创建_335;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_材料数据创建_335  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1035-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1013']/table/tbody/tr[7]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	零部件创建按钮(ByEnum.ById,"button_createMds1"),
	半成品创建按钮(ByEnum.ById,"button_createMds2"),
	材料创建按钮(ByEnum.ById,"button_createMds3");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_材料数据创建_335(ByEnum by, String name){
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
