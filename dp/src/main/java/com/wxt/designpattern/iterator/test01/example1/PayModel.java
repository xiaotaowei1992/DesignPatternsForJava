package com.wxt.designpattern.iterator.test01.example1;

/**
 * @Author: weixiaotao
 * @ClassName PayModel
 * @Date: 2018/12/3 19:36
 * @Description: 工资描述模型对象
 */
public class PayModel {
	/**
	 * 支付工资的人员
	 */
	private String userName;
	/**
	 * 支付的工资数额
	 */
	private double pay;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String toString(){
		return "userName="+userName+",pay="+pay;
	}
}
