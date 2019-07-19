package com.wxt.designpattern.factorymethod.test01.nodp;

/**
 * @Auther: weixiaotao
 * @ClassName ExportXmlFile
 * @Date: 2018/10/22 13:38
 * @Description:
 */
public class ExportXmlFile implements ExportFileApi{
	@Override
	public boolean export(String data) {
		System.out.println("导出数据"+data+"到xml文件");
		return true;
	}
}
