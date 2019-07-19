package com.wxt.designpattern.abstractfactory.withdp;

/**
 * @Auther: weixiaotao
 * @ClassName Schema1
 * @Date: 2018/10/22 21:13
 * @Description:
 */
/**
 * 装机方案一：Intel 的CPU + 技嘉的主板
 * 这里创建CPU和主板对象的时候，是对应的，能匹配上的
 */
public class Schema1 implements AbstractFactory{
	@Override
	public CPUApi createCPUApi() {
		return new IntelCPU(1156);
	}
	@Override
	public MainboardApi createMainboardApi() {
		return new GAMainboard(1156);
	}
}
