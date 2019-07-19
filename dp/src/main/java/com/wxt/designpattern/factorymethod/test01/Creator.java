package com.wxt.designpattern.factorymethod.test01;

/**
 * @Auther: weixiaotao
 * @ClassName Creator
 * @Date: 2018/10/22 13:56
 * @Description:
 */

/**
 * 创建器，声明工厂方法
 */
public abstract class Creator {
	/**
	 * 工厂方法，一般不对外
	 * 创建 product 的工厂方法
	 * @return product对象
	 */
	protected abstract Product factoryMethod();

	/**
	 * 提供给外部使用的方法，
	 * 客户端一般使用Creator提供的这些方法来完成所需要的功能
	 * 示意方法，实现某些具体功能的方法
	 */
	public void someOperation(){
		//通常在这些方法实现中，需要调用工厂方法来获取Product对象
		Product product = factoryMethod();
	}
}
