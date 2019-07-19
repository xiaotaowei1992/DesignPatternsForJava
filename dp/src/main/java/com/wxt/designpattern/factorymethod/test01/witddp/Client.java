package com.wxt.designpattern.factorymethod.test01.witddp;

/**
 * @Auther: weixiaotao
 * @ClassName Client
 * @Date: 2018/10/22 15:05
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		//创建需要使用的Creator对象
		ExportOperate operate = new ExportTxtFileOperate();
		//调用输出数据的功能方法
		operate.export("AbstractTemplate data...");

		Test test = new ExportTxtFileOperate().createTest("wxt");
		test.testExport();
	}
}
