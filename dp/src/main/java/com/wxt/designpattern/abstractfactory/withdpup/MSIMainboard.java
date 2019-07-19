package com.wxt.designpattern.abstractfactory.withdpup;
/**
 * 微星的主板
 */
public class MSIMainboard implements MainboardApi{
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