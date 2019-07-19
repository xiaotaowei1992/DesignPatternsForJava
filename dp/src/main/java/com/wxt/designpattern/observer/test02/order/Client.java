package com.wxt.designpattern.observer.test02.order;

/**
 * @Author: weixiaotao
 * @ClassName Client
 * @Date: 2018/11/27 10:39
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		//手动创建：模拟根据（预）付款申请单关联的应付单，报账单，对账单 用于付款单付款后回写
		CheckSheet checkSheet = new CheckSheet(12);
		CheckAccount chekAccount = new CheckAccount(11);
		PayOrder payOrder = new PayOrder(13);

		Pay pay = new Pay(1);
		pay.attach(checkSheet);
		pay.attach(chekAccount);
		pay.attach(payOrder);
		pay.setStatus("success");
	}
}
