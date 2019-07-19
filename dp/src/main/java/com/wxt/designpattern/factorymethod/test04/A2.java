package com.wxt.designpattern.factorymethod.test04;

/**
 * @Auther: weixiaotao
 * @ClassName A2
 * @Date: 2018/10/22 15:31
 * @Description:
 */
public class A2 extends A1{
	@Override
	protected C1 createC1() {
		return new C2();
	}
}
