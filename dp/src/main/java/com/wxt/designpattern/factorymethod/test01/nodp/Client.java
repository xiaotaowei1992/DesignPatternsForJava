package com.wxt.designpattern.factorymethod.test01.nodp;

/**
 * @Auther: weixiaotao
 * @ClassName Client
 * @Date: 2018/10/22 13:38
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		ExportOperate export = new ExportOperate();
		export.export(1,"AbstractTemplate data....");
	}
}
