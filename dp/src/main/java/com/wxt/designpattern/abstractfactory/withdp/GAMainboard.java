package com.wxt.designpattern.abstractfactory.withdp;

/**
 * @Auther: weixiaotao
 * @ClassName GAMainboard
 * @Date: 2018/10/22 20:47
 * @Description: 技嘉的主板
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
