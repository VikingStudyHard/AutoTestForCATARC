package cn.edu.tju.scs.seql.final_ELV.综合分析_786.禁限用物质豁免分析_806;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_禁限用物质豁免分析_806  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1037-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//a[@target = 'mainFrame'][text()='禁限用物质豁免分析']"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_禁限用物质豁免分析_806(ByEnum by, String name){
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
