package com.wxt.designpattern.builder.test02;

/**
 * @Author: weixiaotao
 * @ClassName Builder
 * @Date: 2018/10/23 11:38
 * @Description: 构建器接口，定义创建一个产品对象所需的各个部件的操作
 */
public interface Builder {
	/**
	 * 示意方法，构建某个部件
	 */
	void buildPart1();
	/**
	 * 示意方法，构建某个部件
	 */
	void buildPart2();
}
