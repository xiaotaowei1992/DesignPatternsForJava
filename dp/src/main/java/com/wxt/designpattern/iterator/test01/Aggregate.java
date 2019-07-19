package com.wxt.designpattern.iterator.test01;

/**
 * @Author: weixiaotao
 * @ClassName Aggregate
 * @Date: 2018/12/3 19:23
 * @Description: 聚合对象的接口，定义创建相应迭代器对象的接口
 */
public abstract class Aggregate {
	/**
	 * 工厂方法，创建相应迭代器对象的接口
	 * @return 相应迭代器对象的接口
	 */
	public abstract Iterator createIterator();
}
