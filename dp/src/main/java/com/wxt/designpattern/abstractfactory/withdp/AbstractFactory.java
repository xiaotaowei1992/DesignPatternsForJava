package com.wxt.designpattern.abstractfactory.withdp;

/**
 * @Auther: weixiaotao
 * @ClassName AbstractFactory
 * @Date: 2018/10/22 21:12
 * @Description: 抽象工厂的接口，声明创建抽象产品对象的操作
 */
public interface AbstractFactory {
	/**
	 * 创建CPU的对象
	 * @return CPU的对象
	 */
	CPUApi createCPUApi();
	/**
	 * 创建主板的对象
	 * @return 主板的对象
	 */
	MainboardApi createMainboardApi();
}