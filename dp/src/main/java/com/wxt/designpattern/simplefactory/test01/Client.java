package com.wxt.designpattern.simplefactory.test01;

/**
 * @ClassName nodp
 * @Description TODO
 * @Author weixiaotao
 * @Date 2018/10/19 14:50
 * @Version 1.0
 *
 **/
public class Client {
	public static void main(String[] args) {
		Api pss =  new PssApiImpl();
		pss.createSystem("春哥");
	}
}
