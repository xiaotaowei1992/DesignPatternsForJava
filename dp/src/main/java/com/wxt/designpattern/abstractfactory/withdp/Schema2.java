package com.wxt.designpattern.abstractfactory.withdp;

/**
 * @Auther: weixiaotao
 * @ClassName Schema2
 * @Date: 2018/10/22 21:13
 * @Description:
 */
/**
 * 装机方案二：AMD的CPU + 微星的主板
 * 这里创建CPU和主板对象的时候，是对应的，能匹配上的
 */
public class Schema2 implements AbstractFactory{
	@Override
	public CPUApi createCPUApi() {
		return new AMDCPU(939);
	}
	@Override
	public MainboardApi createMainboardApi() {
		return new MSIMainboard(939);
	}
}
