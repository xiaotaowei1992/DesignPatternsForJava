package com.wxt.designpattern.simplefactory.test02;

/**
 * @ClassName PssApiImpl
 * @Description 接口的具体实现对象
 * @Author weixiaotao
 * @Date 2018/10/19 14:49
 * @Version 1.0
 *
 **/
public class TssApiImpl implements Api {
	@Override
	public void createSystem(String name) {
		System.out.println(name + ": tss 运费付款结算创建成功...");
	}
}
