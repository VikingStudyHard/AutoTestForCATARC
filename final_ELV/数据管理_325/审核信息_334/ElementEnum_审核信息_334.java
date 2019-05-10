package cn.edu.tju.scs.seql.final_ELV.数据管理_325.审核信息_334;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_审核信息_334  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1035-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1013']/table/tbody/tr[5]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	查看按钮(ByEnum.ById,"viewbutton-btnEl"),
	错误信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	错误信息确定按钮(ByEnum.ById,"button-1005-btnEl"),
	MSD信息选择按钮1(ByEnum.ByXPath,".//*[@id='gridview-1028']/table/tbody/tr[2]/td[1]/div/div"),
	MSD信息选择按钮2(ByEnum.ByXPath,".//*[@id='gridview-1028']/table/tbody/tr[3]/td[1]/div/div"),
	MDS信息所有操作按钮(ByEnum.ByXPath,".//*[@id='toolbar-1042-targetEl']/div"),
	审核按钮(ByEnum.ById,"button-1043"),
	查看审核信息按钮(ByEnum.ById,"viewauinfo"),
	查看页面标题(ByEnum.ByXPath,".//*[@id='status']/ul/li[1]"),
	查看打开树按钮(ByEnum.ByXPath,".//*[@id='contentbody']/table/tbody/tr[1]/td/img[1]"),
	查看关闭树按钮(ByEnum.ByXPath,".//*[@id='contentbody']/table/tbody/tr[1]/td/img[2]"),
	符号树操作按钮(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr/td/div/img[1]"),
	查看页树所有行(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr"),
	母树文字(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr/td/div/span"),
	子树文字(ByEnum.ByXPath,".//*[@id='btree-body']/div/table/tbody/tr[2]/td/div/span"),
	审核状态选择(ByEnum.ById,"ext-gen1124"),
	审核状态选择标注未审核(ByEnum.ByXPath,".//*[@id='ext-gen1018']/div/div/ul/li[3]"),
	第一页按钮(ByEnum.ById,"button-1029-btnEl"),
	上一页按钮(ByEnum.ById,"button-1030-btnEl"),
	下一页按钮(ByEnum.ById,"button-1036-btnEl"),
	最后页按钮(ByEnum.ById,"button-1037-btnEl"),
	页码显示及输入框(ByEnum.ById,"numberfield-1033-inputEl"),
	页码总数显示(ByEnum.ById,"tbtext-1034"),
	换页载入界面(ByEnum.ById,"loadmask-1047"),
	查询按钮(ByEnum.ById,"button-1014-btnEl");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_审核信息_334(ByEnum by, String name){
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
