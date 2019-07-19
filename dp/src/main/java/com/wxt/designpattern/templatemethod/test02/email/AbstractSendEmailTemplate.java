package com.wxt.designpattern.templatemethod.test02.email;

/**
 * @Author: weixiaotao
 * @ClassName AbstractSendEmailTemplate
 * @Date: 2018/11/20 14:08
 * @Description:
 */
public abstract class AbstractSendEmailTemplate {
	protected String getHead() {
		return "head";
	}
	protected abstract String getBody();
	private String getFooter() {
		return "footer:pleasse call test@shein.com ";
	}
	public final void sendEmail(){
		String head = getHead();
		String body = getBody();
		String footer = getFooter();
		StringBuilder emailMessage = new StringBuilder();
		emailMessage.append("<p>").append(head).append("</p>")
				.append("<p>").append(body).append("</p>")
				.append("<p>").append(footer).append("</p>");
		System.out.println("send context : " +  emailMessage.toString());
	}
}
