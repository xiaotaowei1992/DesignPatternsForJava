package com.wxt.principle.DIP;

import org.junit.Test;

/**
 * @Author: weixiaotao
 * @ClassName TestDIP
 * @Date: 2018/11/19 13:21
 * @Description: Dependence Inversion Principle 依赖倒置原则
 */
public class TestDIP {

	class Clothes{
		public void sell(){
			System.out.println("shein 卖 衣服....");
		}
	}

	class Shein {
		public void work(Clothes clothes){
			clothes.sell();
		}
	}
	@Test
	public void test(){
		Shein shein = new Shein();
		shein.work(new Clothes());
	}
	//****************shein 拓展业务 开始买裤子，鞋子***********
	//shein.work(),要想能卖裤子，鞋子，那么shein类得不断修改才能适配去卖裤子等，也即shein和裤子，鞋子的耦合性较高，需要降低

	interface IGoods{
		void sell();
	}

	class Clothes2 implements IGoods{
		public void sell(){
			System.out.println("shein 卖 衣服....");
		}

	}
	class Plants implements IGoods{
		public void sell(){
			System.out.println("shein 卖 裤子....");
		}
	}
	class Shoes implements IGoods{
		public void sell(){
			System.out.println("shein 卖 鞋子....");
		}
	}

	class Shein2 {
		public void work(IGoods iGoods){
			iGoods.sell();
		}
	}

	@Test
	public void test2(){
		//以后无论在卖什么东西，哪怕卖手机，卖电脑，均不用修改shein类了，降低了公司与物品间的耦合
       Shein2 shein2 = new Shein2();
       shein2.work(new Clothes2());
       shein2.work(new Plants());
       shein2.work(new Shoes());
	}

}
