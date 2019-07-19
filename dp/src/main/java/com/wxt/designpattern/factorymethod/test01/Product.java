package com.wxt.designpattern.factorymethod.test01;

/**
 * @Auther: weixiaotao
 * @ClassName Product
 * @Date: 2018/10/22 13:51
 * @Description:
 */

/**
 * 工厂方法所创建的对象的接口
 */
public interface Product {
	//定义Product 的方法.

	/**
	 * 示意卖出xxx商品
	 * @param name 商品名
	 */
	void sell(String name);
}
