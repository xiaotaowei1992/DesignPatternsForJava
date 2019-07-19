package com.wxt.designpattern.observer.test02.order;

/**
 * @Author: weixiaotao
 * @ClassName Pay
 * @Date: 2018/11/27 10:33
 * @Description:
 */
public class Pay extends Subject {
	private Integer payId;

	private String status;

	public Pay(Integer payId) {
		this.payId = payId;
	}

	public Integer getPayId() {
		return payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	public String getStatus() {
		return status;
	}

	/**
	 * 模拟更新数据操作
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
		System.out.println("mysql update successful.....begin to send mq....");
		//status 模拟 付款单付款完成
		if (status.equals("success")) {
			notifyObservers(payId);
		}else {
			System.out.println("付款失败，不更新关联单据");
		}
	}
}
