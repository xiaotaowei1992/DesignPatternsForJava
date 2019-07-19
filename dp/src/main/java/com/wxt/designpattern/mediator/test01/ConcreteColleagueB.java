package com.wxt.designpattern.mediator.test01;

/**
 * @Author: weixiaotao
 * @ClassName ConcreteColleagueB
 * @Date: 2018/10/30 17:54
 * @Description: 具体的同事类B
 */
public class ConcreteColleagueB extends Colleague{
	public ConcreteColleagueB(Mediator mediator) {
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
