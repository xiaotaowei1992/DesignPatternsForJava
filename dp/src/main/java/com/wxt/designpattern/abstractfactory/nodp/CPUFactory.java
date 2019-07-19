package com.wxt.designpattern.abstractfactory.nodp;

/**
 * @Auther: weixiaotao
 * @ClassName CPUFactory
 * @Date: 2018/10/22 20:50
 * @Description: 创建CPU的简单工厂
 */
public class CPUFactory {
	/**
	 * 创建CPU接口对象的方法
	 * @param type 选择CPU类型的参数
	 * @return CPU接口对象的方法
	 */
	public static CPUApi createCPUApi(int type){
		CPUApi cpu = null;
		//根据参数来选择并创建相应的CPU对象
		if(type==1){
			cpu = new IntelCPU(2048);
		}else if(type==2){
			cpu = new AMDCPU(1024);
		}
		return cpu;
	}
}
