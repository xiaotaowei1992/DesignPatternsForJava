package com.wxt.designpattern.observer.test02.order;

/**
 * @Author: weixiaotao
 * @ClassName PayOrder
 * @Date: 2018/11/27 10:27
 * @Description:
 */
public class PayOrder implements Order{
	private Integer payOrderId;
	private Integer payId;

	public PayOrder(Integer payOrderId) {
		this.payOrderId = payOrderId;
	}

	@Override
	public void update(Integer payId) {
		this.setPayId(payId);
		System.out.println("mq to tms :"+ this.toString());
	}

	public Integer getPayId() {
		return payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	public Integer getPayOrderId() {
		return payOrderId;
	}

	public void setPayOrderId(Integer payOrderId) {
		this.payOrderId = payOrderId;
	}

	@Override
	public String toString() {
		return "PayOrder{" + "payOrderId=" + payOrderId + ", payId=" + payId + '}';
	}
}
