package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_新建消息_348  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1038-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1025']/table/tbody/tr[2]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	BOM节点版本组号输入框(ByEnum.ById,"bomsysbol-inputEl"),
	标题输入框(ByEnum.ById,"newsTitle-inputEl"),
	接收人输入框(ByEnum.ById,"recipient-inputEl"),
	内容输入框(ByEnum.ById,"newsContent-textareaEl"),
	内容输入frame(ByEnum.ById,"newsContent-iframeEl"),
	返回按钮(ByEnum.ByXPath,".//*[@id='sendRequest']/preceding::div[2]"),
	保存信息按钮(ByEnum.ByXPath,".//*[@id='sendRequest']/preceding::div[1]"),
	保存并发送信息按钮(ByEnum.ByXPath,".//*[@id='sendRequest']");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_新建消息_348(ByEnum by, String name){
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
