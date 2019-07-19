package com.wxt.designpattern.templatemethod.test02.sort;

/**
 * @Author: weixiaotao
 * @ClassName UserModel
 * @Date: 2018/11/20 13:59
 * @Description: 用户数据模型
 */
public class UserModel {
	private String userId;
	private String name;
	private int age;
	public UserModel(String userId,String name,int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
	}
	public String getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString(){
		return "userId="+userId+",name="+name+",age="+age;
	}
}
