package com.wxt.designpattern.mediator.test02;

/**
 * @Author: weixiaotao
 * @ClassName VideoCard
 * @Date: 2018/10/30 18:36
 * @Description: 显卡类，一个同事类
 */
public class VideoCard extends Colleague{
	public VideoCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 显示视频数据
	 * @param data 被显示的数据
	 */
	public void showData(String data){
		System.out.println("显卡显示，您正观看的是："+data);
	}
}