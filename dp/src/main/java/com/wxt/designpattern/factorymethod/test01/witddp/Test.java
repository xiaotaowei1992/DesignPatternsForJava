package com.wxt.designpattern.factorymethod.test01.witddp;

/**
 * @Auther: weixiaotao
 * @ClassName Test
 * @Date: 2018/10/22 15:07
 * @Description:
 */
public class Test {
	private String name = "";
	private ExportFileApi api = null;

	public Test(String name,ExportFileApi api){
		this.name = name;
		this.api= api;
	}

	public void testExport(){
		System.out.println("name="+name);
		this.api.export("hello AbstractTemplate...");
	}
}
