package com.wxt.designpattern.factorymethod.test01;

/**
 * @Auther: weixiaotao
 * @ClassName ConcreteCretetor
 * @Date: 2018/10/22 14:05
 * @Description:
 */
/**
 * 具体的创建器实现对象
 */
public class ConcreteCretetor extends Creator {
	@Override
	protected Product factoryMethod() {
		//重定义工厂方法，返回一个具体的Product对象
		return new ConcreteProduct();
	}
}
