package cn.edu.tju.scs.seql.final_ELV.综合分析_786.报告管理_802;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_报告管理_802  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1037-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1021']/table/tbody/tr[5]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_报告管理_802(ByEnum by, String name){
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
