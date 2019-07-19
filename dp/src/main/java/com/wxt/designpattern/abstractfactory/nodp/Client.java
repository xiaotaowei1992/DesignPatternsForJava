package com.wxt.designpattern.abstractfactory.nodp;

/**
 * @Auther: weixiaotao
 * @ClassName Client
 * @Date: 2018/10/22 20:54
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		//创建装机工程师对象
		ComputerEngineer engineer = new ComputerEngineer();
		//告诉装机工程师自己选择的配件，让装机工程师组装电脑
		engineer.makeComputer(1,1);
	}
}
