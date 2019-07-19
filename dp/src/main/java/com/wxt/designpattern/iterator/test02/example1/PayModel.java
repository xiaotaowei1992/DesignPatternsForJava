package com.wxt.designpattern.iterator.test02.example1;

/**
 * @Author: weixiaotao
 * @ClassName PayModel
 * @Date: 2018/12/4 10:28
 * @Description:
 */
public class PayModel {
	private String userName;
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

