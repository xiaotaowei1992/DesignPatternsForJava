package com.wxt.designpattern.builder.test04;

/**
 * @Author: weixiaotao
 * @ClassName Client
 * @Date: 2018/10/23 19:46
 * @Description:
 *
 * 使用生成器模式构建复杂对象

  考虑这样一个实际应用，要创建一个保险合同的对象，里面很多属性的值都有约束，要求创建出来的对象是满足这些约束规则的。
  约束规则比如：保险合同通常情况下可以和个人签订，也可以和某个公司签订，但是一份保险合同不能同时与个人和公司签订。
  这个对象里面有很多类似这样的约束，那么该如何来创建这个对象呢？
	1：使用Builder模式来构建复杂对象，先不考虑带约束
	2：使用Builder模式来构建复杂对象，考虑带约束规则(update)
	3：进一步，把构建器对象和被构建对象合并(update2)
 */
public class Client {
	public static void main(String[] args) {
		//创建构建器
		ConcreteBuilder builder = new ConcreteBuilder("001",12345L,67890L);
		//设置需要的数据，然后构建保险合同对象
		InsuranceContract contract =
				builder.setPersonName("张三")
						.setOtherData("AbstractTemplate")
						.build();

		//操作保险合同对象的方法
		contract.someOperation();

		ConcreteBuilder builder2 = new ConcreteBuilder("001",12345L,67890L);
		InsuranceContract contract2 =
				builder2
						.setPersonName("李四")
						.setCompanyName("cc")
						.setOtherData("company")
						.build();
		contract2.someOperation();


	}
}
