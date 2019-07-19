package com.wxt.designpattern.abstractfactory.withdpup;
/**
 * AMD的CPU实现
 */
public class AMDCPU implements CPUApi{
	/**
	 * CPU的针脚数目
	 */
	private Integer pins;
	/**
	 * 构造方法，传入CPU的针脚数目
	 * @param pins CPU的针脚数目
	 */
	public AMDCPU(Integer pins){
		this.pins = pins;
	}
	@Override
	public void calculate() {
		System.out.println("now in AMD CPU,pins="+pins);
	}
}
