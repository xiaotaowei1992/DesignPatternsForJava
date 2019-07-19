package com.wxt.designpattern.simplefactory.test02;

/**
 * @ClassName Factory
 * @Description 工厂类，用来创造Api对象
 * @Author weixiaotao
 * @Date 2018/10/19 15:01
 * @Version 1.0
 *
 **/
public class Factory {
	/**
	 * 具体的创造Api对象的方法
	 * @param type 示意，从外部传入的选择条件
	 * @return 创造好的Api对象
	 */
	public static Api createSystem(Integer type){
		//应该根据某些条件去选择究竟创建哪一个具体的实现对象
		//这些条件可以从外部传入，也可以从其它途径获取
		//如果只有一个实现，可以省略条件，因为没有选择的必要

		//示意使用条件
		//1：参数来源于 client
		//2：参数来源于配置文件
		//3：参数来源于系统自身，比如运行期间的某个值 比如运行期间的某个值 系统环境ubuntu centos windows,或xx系统变量
		Api sys = null;
		if (type == 1) {
			sys = new PssApiImpl();
		}else if (type == 2) {
			sys = new FssApiImpl();
		}else if (type == 3) {
			sys = new TssApiImpl();
		}
		return sys;
	}
}
