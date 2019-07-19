package com.wxt.designpattern.abstractfactory.withdp;

/**
 * @Auther: weixiaotao
 * @ClassName MSIMainboard
 * @Date: 2018/10/22 20:48
 * @Description: 微星的主板
 */
public class MSIMainboard implements MainboardApi {
	/**
	 * CPU插槽的孔数
	 */
	private Integer cpuHoles;
	/**
	 * 构造方法，传入CPU插槽的孔数
	 * @param cpuHoles CPU插槽的孔数
	 */
	public MSIMainboard(Integer cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCPU() {
		System.out.println("MSIMainboard,cpuHoles="+cpuHoles);
	}
}
