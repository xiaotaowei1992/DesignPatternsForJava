package com.wxt.designpattern.bridge.test01.nodp2;
/**
 * 消息的统一接口
 */
public interface Message {
	/**
	 * 发送消息
	 * @param message 要发送的消息内容
	 * @param toUser 把消息发送的目的人员
	 */
	void send(String message,String toUser);
}