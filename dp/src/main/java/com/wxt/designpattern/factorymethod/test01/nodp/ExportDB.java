package com.wxt.designpattern.factorymethod.test01.nodp;

/**
 * @Auther: weixiaotao
 * @ClassName ExportDB
 * @Date: 2018/10/22 13:37
 * @Description:
 */
/**
 * 导出成数据库备份文件形式的对象
 */
public class ExportDB implements ExportFileApi{
	@Override
	public boolean export(String data) {
		System.out.println("导出数据：" + data + ",到数据库备份文件");
		return true;
	}
}
