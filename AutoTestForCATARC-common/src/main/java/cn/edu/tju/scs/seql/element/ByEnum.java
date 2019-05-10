package cn.edu.tju.scs.seql.element;

/**
 * 枚举Selenium可以使用的web元素查找方式
 *
 */
public enum ByEnum {
	ById,
	ByLinkText,
	ByPartialLinkText,
	ByName,
	ByTagName,
	ByXPath,
	ByClassName,
	ByCssSelector;

}
