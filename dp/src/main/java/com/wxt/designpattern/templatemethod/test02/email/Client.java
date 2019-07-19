package com.wxt.designpattern.templatemethod.test02.email;

/**
 * @Author: weixiaotao
 * @ClassName Client
 * @Date: 2018/11/20 14:11
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		AddUserSendEmail addUserSendEmail = new AddUserSendEmail();
		addUserSendEmail.sendEmail();
		UpdateEmailConfigSendEmail updateEmailConfigSendEmail = new
				UpdateEmailConfigSendEmail();
		updateEmailConfigSendEmail.sendEmail();
	}

}
