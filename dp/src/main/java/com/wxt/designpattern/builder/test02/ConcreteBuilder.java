package com.wxt.designpattern.builder.test02;

/**
 * @Author: weixiaotao
 * @ClassName ConcreteBuilder
 * @Date: 2018/10/23 11:39
 * @Description:
 */
public class ConcreteBuilder implements Builder {
	/**
	 * 构建器最终构建的产品对象
	 */
	private Product resultProduct;
	/**
	 * 获取构建器最终构建的产品对象
	 * @return 构建器最终构建的产品对象
	 */
	public Product getResult() {
		return resultProduct;
	}

	@Override
	public void buildPart1() {
		//构建某个部件的功能处理...
	}

	@Override
	public void buildPart2() {
		//构建某个部件的功能处理...
	}
}
