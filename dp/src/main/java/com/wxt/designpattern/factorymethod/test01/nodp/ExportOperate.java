package com.wxt.designpattern.factorymethod.test01.nodp;

/**
 * @Auther: weixiaotao
 * @ClassName ExportOperate
 * @Date: 2018/10/22 13:44
 * @Description:
 */
public class ExportOperate {
	public boolean export(int type,String data){
		//先完成各种导出数据前的准备工作
		//比如进行数据校验
		System.out.println("now 进行数据校验");
		//比如进行数据转换
		System.out.println("now 进行数据转换");
		//比如进行数据格式的封装
		System.out.println("now 进行数据格式的封装");

		//然后才真正的去导出
		ExportFileApi api = null;
		//根据类型来选择究竟要创建哪一种导出文件对象
		if(type == 1){
			api = new ExportTxtFile();
		}else if(type == 2){
			api = new ExportDB();
		}else if(type==3){
			api = new ExportXmlFile();
		}
		return api.export(data);
	}
}
