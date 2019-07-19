package com.wxt.designpattern.simplefactory.test02;

/**
 * @ClassName Api
 * @Description 接口的定义，该接口可以通过简单工厂来创建
 * @Author weixiaotao
 * @Date 2018/10/19 14:45
 * @Version 1.0
 *
 **/
public interface Api {
	/**
	 * 模拟xx用户创建不同系统
	 * @param name
	 */
	void createSystem(String name);
}
