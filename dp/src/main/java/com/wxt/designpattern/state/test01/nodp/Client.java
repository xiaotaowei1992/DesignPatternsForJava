package com.wxt.designpattern.state.test01.nodp;

/**
 * @Author: weixiaotao
 * @ClassName Client
 * @Date: 2018/12/12 19:02
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		VoteManager vm = new VoteManager();
		for(int i=0;i<8;i++){
			vm.vote("u1" , "A");
		}
	}
}
