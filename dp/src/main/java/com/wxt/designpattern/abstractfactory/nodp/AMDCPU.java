package com.wxt.designpattern.abstractfactory.nodp;

/**
 * @Auther: weixiaotao
 * @ClassName AMDCPU
 * @Date: 2018/10/22 20:42
 * @Description:AMD 的 cpu实现
 */
public class AMDCPU implements CPUApi{
	/**
	 * cpu的针脚数目
	 */
	private int pins = 0;

	/**
	 * 构造方法，传入CPU的针脚数目
	 * @param pins CPU的针脚数目
	 */
	public AMDCPU(int pins){
		this.pins = pins;
	}

	@Override
	public void calculate() {
		System.out.println("AMD CPU,pins="+pins);
	}
}
