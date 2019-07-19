package com.wxt.designpattern.simplefactory.test01;

/**
 * @ClassName PssApiImpl
 * @Description TODO
 * @Author weixiaotao
 * @Date 2018/10/19 14:49
 * @Version 1.0
 *
 **/
public class PssApiImpl implements Api{
	@Override
	public void createSystem(String name) {
		System.out.println(name + ": pss 成衣付款结算创建成功...");
	}
}
