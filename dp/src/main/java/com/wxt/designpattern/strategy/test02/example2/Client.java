package com.wxt.designpattern.strategy.test02.example2;

public class Client {
	public static void main(String[] args) {
		LogContext log = new LogContext();
		log.log("记录日志");
		log.log("再次记录日志");
	}
}
