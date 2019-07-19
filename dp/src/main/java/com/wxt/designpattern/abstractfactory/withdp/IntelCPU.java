package com.wxt.designpattern.abstractfactory.withdp;


/**
 * @Auther: weixiaotao
 * @ClassName IntelCPU
 * @Date: 2018/10/22 20:45
 * @Description: intel 的cpu实现
 */
public class IntelCPU implements CPUApi {
	/**
	 * CPU的针脚数目
	 */
	private Integer pins;
	/**
	 * 构造方法，传入CPU的针脚数目
	 * @param pins CPU的针脚数目
	 */
	public IntelCPU(Integer pins){
		this.pins = pins;
	}

	@Override
	public void calculate() {
		System.out.println("Intel CPU,pins="+pins);
	}
}
