package com.wxt.designpattern.templatemethod.test02.email;

/**
 * @Author: weixiaotao
 * @ClassName UpdateEmailConfigSendEmail
 * @Date: 2018/11/20 14:11
 * @Description:
 */
public class UpdateEmailConfigSendEmail extends AbstractSendEmailTemplate {
	@Override
	protected String getHead() {
		return "Update Email HEAD";
	}
	@Override
	protected String getBody() {
		return "update email config";
	}
}
