package com.wxt.designpattern.iterator.test02.example1;

import java.util.Iterator;

/**
 * @Author: weixiaotao
 * @ClassName ArrayIteratorImpl
 * @Date: 2018/12/4 10:30
 * @Description:
 */
public class ArrayIteratorImpl implements Iterator {
	/**
	 * 用来存放被迭代的聚合对象
	 */
	private SalaryManager aggregate = null;
	/**
	 * 用来记录当前迭代到的位置索引
	 */
	private int index = 0;

	public ArrayIteratorImpl(SalaryManager aggregate){
		this.aggregate = aggregate;
	}

	@Override
	public boolean hasNext() {
		//判断是否还有下一个元素
		if(aggregate!=null && index<aggregate.size()){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Object retObj = null;
		if(hasNext()){
			retObj = aggregate.get(index);
			//每取走一个值，就把已访问索引加1
			index++;
		}
		return retObj;
	}

	@Override
	public void remove() {
		//TODO
	}


}
