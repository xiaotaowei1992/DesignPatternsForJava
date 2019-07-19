package com.wxt.designpattern.observer.test02.order;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weixiaotao
 * @ClassName Subject
 * @Date: 2018/11/27 10:35
 * @Description:
 */
public class Subject {
	/**
	 * 用来保存注册的观察者对象，也就是报纸的订阅者
	 */
	private List<Order> orders = new ArrayList<>();
	/**
	 * 报纸的读者需要先向报社订阅，先要注册
	 * @param reader 报纸的读者
	 * @return 是否注册成功
	 */
	public void attach(Order reader) {
		orders.add(reader);
	}
	/**
	 * 报纸的读者可以取消订阅
	 * @param reader 报纸的读者
	 * @return 是否取消成功
	 */
	public void detach(Order reader) {
		orders.remove(reader);
	}
	/**
	 * 当每期报纸印刷出来后，就要迅速的主动的被送到读者的手中，
	 * 相当于通知读者，让他们知道
	 * @param payId 要主动推送的内容
	 */
	protected void notifyObservers(Integer payId) {
		for(Order reader : orders){
			reader.update(payId);
		}
	}
}
