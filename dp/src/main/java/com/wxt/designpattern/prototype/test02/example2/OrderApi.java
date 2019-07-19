package com.wxt.designpattern.prototype.test02.example2;
/**
 * 订单的接口
 */
public interface OrderApi {
	/**
	 * 获取订单产品数量
	 * @return 订单中产品数量
	 */
	int getOrderProductNum();
	/**
	 * 设置订单产品数量
	 * @param num 订单产品数量
	 */
	void setOrderProductNum(int num);

}
