package com.wxt.designpattern.simplefactory.test02;

/**
 * @ClassName nodp
 * @Description 客户端，使用Api接口
 * @Author weixiaotao
 * @Date 2018/10/19 15:09
 * @Version 1.0
 *
 **/
public class Client {
	public static void main(String[] args) {
		//通过简单工厂来获取接口对象
		Api sys = Factory.createSystem(2);
		sys.createSystem("军哥");
	}
}
