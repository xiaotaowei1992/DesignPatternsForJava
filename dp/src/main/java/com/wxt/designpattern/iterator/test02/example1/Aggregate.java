package com.wxt.designpattern.iterator.test02.example1;
import java.util.Iterator;
/**
 * @Author: weixiaotao
 * @ClassName Aggregate
 * @Date: 2018/12/4 10:28
 * @Description: 聚合对象的接口，定义创建相应迭代器对象的接口
 */


public abstract class Aggregate {
	/**
	 * 工厂方法，创建相应迭代器对象的接口
	 * @return 相应迭代器对象的接口
	 */
	public abstract Iterator createIterator();
}

