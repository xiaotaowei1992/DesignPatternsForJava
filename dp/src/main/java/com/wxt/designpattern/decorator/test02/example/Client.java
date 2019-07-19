package com.wxt.designpattern.decorator.test02.example;

import java.io.*;


public class Client {
	public static void main(String[] args) throws Exception {
		//流式输出文件
		//换了位置后 文件加密后为空
		/*DataOutputStream dout =
				new DataOutputStream(
						new EncryptOutputStream(
								new BufferedOutputStream(
										new FileOutputStream("MyEncrypt.txt"))));*/
		DataOutputStream dout =
				new DataOutputStream(
						new BufferedOutputStream(
								new EncryptOutputStream2(
										new FileOutputStream("MyEncrypt.txt")
						)));
		//然后就可以输出内容了
		dout.write("abcdxy".getBytes());
		dout.close();
	}
}
