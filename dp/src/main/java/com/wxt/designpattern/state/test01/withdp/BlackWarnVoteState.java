package com.wxt.designpattern.state.test01.withdp;

public class BlackWarnVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//待进黑名单警告状态
		System.out.println("禁止登录和使用系统3天");
	}
}

