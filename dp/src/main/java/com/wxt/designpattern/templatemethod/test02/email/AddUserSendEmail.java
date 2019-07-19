package com.wxt.designpattern.templatemethod.test02.email;

/**
 * @Author: weixiaotao
 * @ClassName AddUserSendEmail
 * @Date: 2018/11/20 14:10
 * @Description:
 */
public class AddUserSendEmail extends AbstractSendEmailTemplate {
	@Override
	protected String getBody() {
		return "add user";
	}
}
