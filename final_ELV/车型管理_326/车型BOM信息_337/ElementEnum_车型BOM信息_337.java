package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import cn.edu.tju.scs.seql.element.*;

/**
 * 对该package下的页面建模，枚举页面元素，供测试用例调用
 */
public enum ElementEnum_车型BOM信息_337  implements ElementEnum {
	FanXiangyu(ByEnum.ById,"id"),
	一级目录名称(ByEnum.ById,"tool-1036-toolEl"),
	二级目录名称(ByEnum.ByXPath,".//*[@id='treeview-1017']/table/tbody/tr[3]/td/div/a"),
	leftFrame(ByEnum.ByName,"leftFrame"),
	rightFrame(ByEnum.ByName,"mainFrame"),
	车型商标输入框(ByEnum.ById,"bname-inputEl"),
	通用名称输入框(ByEnum.ById,"mname-inputEl"),
	创建时间起点输入框(ByEnum.ById,"fromTime-inputEl"),
	创建时间终点输入框(ByEnum.ById,"toTime-inputEl"),
	检索按钮(ByEnum.ById,"button-1011-btnEl"),
	新增BOM按钮(ByEnum.ById,"button-1037-btnEl"),
	查看BOM按钮(ByEnum.ById,"button-1038-btnEl"),
	修改BOM按钮(ByEnum.ById,"button-1039-btnEl"),
	删除BOM按钮(ByEnum.ById,"button-1040-btnEl"),
	错误信息确定按钮(ByEnum.ById,"button-1005-btnEl"),
	删除BOM确认提示信息是按钮(ByEnum.ById,"button-1006-btnEl"),
	删除BOM确认提示信息否按钮(ByEnum.ById,"button-1007-btnEl"),
	检索结果所有行(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr"),
	检索结果第一行车型中文商标(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[3]/div"),
	检索结果第一行车型英文商标(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[4]/div"),
	检索结果第一行车型中文名称(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[5]/div"),
	检索结果第一行车型英文名称(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[6]/div"),
	检索结果第一行更新时间(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[7]/div"),
	检索结果第一行BOM值(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]/td[8]/div"),
	检索BOM为是的行(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]"),
	检索BOM为否的行(ByEnum.ByXPath,".//*[@id='gridview-1021']/table/tbody/tr[2]"),
	开始时间早于结束时间错误信息(ByEnum.ById,"messagebox-1001-displayfield-inputEl"),
	上一页按钮(ByEnum.ById,"button-1024-btnEl"),
	下一页按钮(ByEnum.ById,"button-1030-btnEl"),
	最后页按钮(ByEnum.ById,"button-1031-btnEl"),
	页码显示及输入框(ByEnum.ById,"numberfield-1027-inputEl"),
	页码总数显示(ByEnum.ById,"tbtext-1028"),
	提示框确定按钮(ByEnum.ById,"button-1005"),
	换页载入界面(ByEnum.ById,"loadmask-1043"),
	快速提示信息(ByEnum.ById,"ext-quicktips-tip"),
	载入界面(ByEnum.ById,"maskload"),
	BOM树形图节点(ByEnum.ByXPath,".//*[@id='treeview-1018']/table/tbody/tr[2]"),
	BOM树形打开按钮(ByEnum.ById,"button-1010-btnEl"),
	BOM树形关闭按钮(ByEnum.ById,"button-1011-btnEl"),
	BOM树形查找按钮(ByEnum.ById,"button-1012-btnEl"),
	树操作名称输入框(ByEnum.ById,"mainform_mdsname-inputEl"),
	树操作部件号输入框(ByEnum.ById,"mainform_itemnum-inputEl"),
	树操作ID编号输入框(ByEnum.ById,"mainform_mdsid-inputEl"),
	树操作查找按钮(ByEnum.ById,"button-1045-btnEl"),
	树操作取消按钮(ByEnum.ById,"button-1046-btnEl"),
	整体匹配按钮(ByEnum.ById,"matchButton-btnEl"),
	匹配结果按钮(ByEnum.ById,"MatchresuleButton-btnEl"),
	导出按钮(ByEnum.ById,"exportButton-btnEl"),
	返回按钮(ByEnum.ById,"returnButton-btnEl"),
	匹配结果页面下载按钮(ByEnum.ById,"button-1036-btnEl"),
	匹配结果页面发送按钮(ByEnum.ById,"button-1035-btnEl"),
	匹配结果页面关闭按钮(ByEnum.ById,"button-1037-btnEl"),
	匹配提示信息确定按钮(ByEnum.ById,"button-1005-btnEl"),
	保存按钮(ByEnum.ById,"saveButton-btnEl"),
	导入按钮(ByEnum.ById,"uploadButton-btnEl"),
	选取导入文件按钮(ByEnum.ById,"textfield-1071-inputEl"),
	确定导入按钮(ByEnum.ById,"button-1074-btnEl"),
	取消导入按钮(ByEnum.ById,"button-1075-btnEl"),
	BOM树形增加按钮(ByEnum.ById,"addtbar-btnEl"),
	BOM树形删除按钮(ByEnum.ById,"deletetbar-btnEl"),
	BOM树形挂接按钮(ByEnum.ById,"matchtbar-btnEl"),
	BOM树形修改按钮(ByEnum.ById,"edittbar-btnEl"),
	BOM树形更多按钮(ByEnum.ById,"toolbar-1009-menu-trigger-btnEl"),
	打开树按钮(ByEnum.ById,"menuitem-1054"),
	关闭树按钮(ByEnum.ById,"menuitem-1058"),
	查找树按钮(ByEnum.ById,"menuitem-1056"),
	节点确定按钮(ByEnum.ById,"button-1005-btnEl"),
	删除节点是按钮(ByEnum.ById,"button-1006-btnEl"),
	删除节点否按钮(ByEnum.ById,"button-1007-btnEl"),
	新增确定按钮(ByEnum.ById,"button-1057-btnEl"),
	BOM树形第一个叶子节点(ByEnum.ByXPath,".//*[@id='treeview-1018']/table/tbody/tr[3]"),
	新增取消按钮(ByEnum.ById,"button-1058-btnEl"),
	名称输入框(ByEnum.ById,"editText-inputEl"),
	供货编号输入框(ByEnum.ById,"editcsymbol-inputEl"),
	数量输入框(ByEnum.ById,"editquarity-inputEl"),
	质量输入框(ByEnum.ById,"editweight-inputEl"),
	负责人输入框(ByEnum.ById,"responsibleName-inputEl"),
	整体匹配界面名称输入框(ByEnum.ById,"editText-inputEl"),
	整体匹配界面供货编号输入框(ByEnum.ById,"editcsymbol-inputEl"),
	整体匹配界面数量输入框(ByEnum.ById,"editquarity-inputEl"),
	整体匹配界面质量输入框(ByEnum.ById,"editweight-inputEl"),
	整体匹配界面负责人输入框(ByEnum.ById,"responsibleName-inputEl"),
	整体匹配界面确定按钮(ByEnum.ById,"button-1061-btnEl"),
	整体匹配界面取消按钮(ByEnum.ById,"button-1062-btnEl"),
	操作成功确定按钮(ByEnum.ById,"button-1005-btnEl");

	private ByEnum byWhat;
	private String name;
	private ElementEnum_车型BOM信息_337(ByEnum by, String name){
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
