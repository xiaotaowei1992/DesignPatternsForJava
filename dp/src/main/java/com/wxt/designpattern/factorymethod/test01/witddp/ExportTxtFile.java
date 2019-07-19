package com.wxt.designpattern.factorymethod.test01.witddp;

/**
 * @Auther: weixiaotao
 * @ClassName ExportTxtFile
 * @Date: 2018/10/22 13:38
 * @Description:
 */

/**
 * 导出成文本文件格式的对象
 */
public class ExportTxtFile implements ExportFileApi {
	@Override
	public boolean export(String data) {
		System.out.println("导出数据"+data+"到文本文件");
		return true;
	}
}
