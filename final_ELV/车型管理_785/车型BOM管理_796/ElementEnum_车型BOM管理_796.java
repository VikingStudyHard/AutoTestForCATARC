package cn.edu.tju.scs.seql.final_ELV.车型管理_785.车型BOM管理_796;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_车型BOM管理_796  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"menu7_a"),
	二级目录名称(ByEnum.ByCssSelector,"#m7_1 > a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"FrameRight");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_车型BOM管理_796(ByEnum by, String name){
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
