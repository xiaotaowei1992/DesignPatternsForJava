package com.wxt.designpattern.builder.test03;

/**
 * @Author: weixiaotao
 * @ClassName MyFooter
 * @Date: 2018/10/23 19:27
 * @Description:
 */
public class MyFooter {
	public String genFooter(ExportFooterModel efm){
		String str = "  <Footer>\n";
		str+="    <ExportUser>"+efm.getExportUser()+"</ExportUser>\n";
		str+="  </Footer>\n";
		return str;
	}
}
