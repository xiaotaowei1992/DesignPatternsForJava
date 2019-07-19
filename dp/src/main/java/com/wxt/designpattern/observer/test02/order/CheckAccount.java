package com.wxt.designpattern.observer.test02.order;

/**
 * @Author: weixiaotao
 * @ClassName CheckAccount
 * @Date: 2018/11/27 10:27
 * @Description:
 */
public class CheckAccount implements Order {
	private Integer checkAccountId;
	private  Integer payId;

	public CheckAccount(Integer checkAccountId) {
		this.checkAccountId = checkAccountId;
	}

	@Override
	public void update(Integer payId) {
		this.setPayId(payId);
		System.out.println("mq to 105 :" + this.toString());
	}

	public Integer getPayId() {
		return payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	public Integer getCheckAccountId() {
		return checkAccountId;
	}

	public void setCheckAccountId(Integer checkAccountId) {
		this.checkAccountId = checkAccountId;
	}

	@Override
	public String toString() {
		return "CheckAccount{" + "checkAccountId=" + checkAccountId + ", payId=" + payId + '}';
	}
}
