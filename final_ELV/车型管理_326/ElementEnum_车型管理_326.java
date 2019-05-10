package cn.edu.tju.scs.seql.final_ELV.车型管理_326;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_车型管理_326  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"treepanel-1026_header_hd-textEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1029']/table/tbody/tr[3]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	退出按钮(ByEnum.ByXPath,".//a[text()='退出']");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_车型管理_326(ByEnum by, String name){
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
