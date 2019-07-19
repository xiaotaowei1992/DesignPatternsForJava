package com.wxt.designpattern.factorymethod.test01.witddp;

/**
 * @Auther: weixiaotao
 * @ClassName ExportFileApi
 * @Date: 2018/10/22 13:37
 * @Description:
 */

/**
 * 导出的文化对象接口
 */
public interface ExportFileApi {
	/**
	 * 导出内容成为文件
	 * @param data 示意：需要保存的数据
	 * @return 是否导出成功
	 */
	boolean export(String data);
}
