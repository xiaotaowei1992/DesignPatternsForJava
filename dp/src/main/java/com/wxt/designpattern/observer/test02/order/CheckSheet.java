package com.wxt.designpattern.observer.test02.order;

/**
 * @Author: weixiaotao
 * @ClassName CheckSheet
 * @Date: 2018/11/27 10:27
 * @Description:
 */
public class CheckSheet implements Order {
	private Integer checkSheetId;
	private Integer payId;

	public CheckSheet(Integer checkSheetId) {
		this.checkSheetId = checkSheetId;
	}

	@Override
	public void update(Integer payId) {
		this.setPayId(payId);
		System.out.println("mq to mrp:"+ this.toString());
	}

	@Override
	public String toString() {
		return "CheckSheet{" + "checkSheetId=" + checkSheetId + ", payId=" + payId + '}';
	}

	public Integer getCheckSheetId() {
		return checkSheetId;
	}

	public void setCheckSheetId(Integer checkSheetId) {
		this.checkSheetId = checkSheetId;
	}

	public Integer getPayId() {
		return payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

}
