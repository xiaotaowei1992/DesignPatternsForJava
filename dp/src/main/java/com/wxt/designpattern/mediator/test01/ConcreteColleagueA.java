package com.wxt.designpattern.mediator.test01;

/**
 * @Author: weixiaotao
 * @ClassName ConcreteColleagueA
 * @Date: 2018/10/30 17:53
 * @Description: 具体的同事类A
 */
public class ConcreteColleagueA extends Colleague{
	/**
	 * 构造方法，传入中介者对象
	 * @param mediator 中介者对象
	 */
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	/**
	 * 示意方法，执行某些业务功能
	 */
	public void someOperation() {
		//在需要跟其他同事通信的时候，通知中介者对象
		getMediator().changeMsg(this);
	}
}
