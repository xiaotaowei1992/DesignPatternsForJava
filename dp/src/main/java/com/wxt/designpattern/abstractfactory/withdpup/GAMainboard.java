package com.wxt.designpattern.abstractfactory.withdpup;
/**
 * 技嘉的主板
 */
public class GAMainboard implements MainboardApi {
	/**
	 * CPU插槽的孔数
	 */
	private Integer cpuHoles;
	/**
	 * 构造方法，传入CPU插槽的孔数
	 * @param cpuHoles CPU插槽的孔数
	 */
	public GAMainboard(Integer cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCPU() {
		System.out.println("GAMainboard,cpuHoles="+cpuHoles);
	}
}
