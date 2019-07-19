package com.wxt.designpattern.factorymethod.test01;

/**
 * @Auther: weixiaotao
 * @ClassName ConcreteProduct
 * @Date: 2018/10/22 13:53
 * @Description:
 */

/**
 * 具体的product对象
 */
public class ConcreteProduct implements Product {
	//实现Product要求的方法
	@Override
	public void sell(String name) {
		System.out.println("天猫平台卖出商品：" + name);
	}
}
