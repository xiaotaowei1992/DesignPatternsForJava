package com.wxt.designpattern.factorymethod.test01.witddp;

/**
 * @Auther: weixiaotao
 * @ClassName ExportXmlFileOperate
 * @Date: 2018/10/22 15:05
 * @Description:
 */
public class ExportXmlFileOperate extends ExportOperate{
	@Override
	protected ExportFileApi factoryMethod() {
		return new ExportXmlFile();
	}
}
