package com.wxt.designpattern.mediator.test02;

/**
 * @Author: weixiaotao
 * @ClassName SoundCard
 * @Date: 2018/10/30 18:35
 * @Description: 声卡类，一个同事类
 */
public class SoundCard  extends Colleague{
	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 按照声频数据发出声音
	 * @param data 发出声音的数据
	 */
	public void soundData(String data){
		System.out.println("声卡，发出声音："+data);
	}

}