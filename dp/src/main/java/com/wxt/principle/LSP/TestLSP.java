package com.wxt.principle.LSP;

import org.junit.Test;

/**
 * @Author: weixiaotao
 * @ClassName TestLSP
 * @Date: 2018/11/7 16:31
 * @Description: 里氏替换原则
 */
public class TestLSP {
	/**
	 * A 程序员开发 add() ，mul(), push
	 *   在B push 之前 增加 divide()
	 * A 要求B 拓展个子类新增sub() 后自己在使用。
	 */
	class Calculate {
		public void add(Integer num1,Integer num2){
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}
		public void mul(Integer num1,Integer num2){
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		}
		public void divide(Integer num1,Integer num2){
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		}
	}

	/**
	 * B 程序员方法 （不知道，或者没主要已实现divide）
	 *   在A 的add 方法上pull
	 */
	class CalculateAdvance extends Calculate{
		public void divide(Integer num1,Integer num2){
			System.out.println(num2 + "/" + num1 + "=" + (num2/num1));
		}

		public void sub(Integer num1,Integer num2){
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		}
	}

	/**
	 * 原因就是类CalculateAdvance在给方法起名时无意中重写了父类Calculate的方法，造成所有运行divide功能的代码全部
	 * 调用了类CalculateAdvance重写后的方法，造成原本运行正常的功能出现了错误
	 * 我们常常会通过重写父类的方法来完成新的功能，这样写起来虽然简单，但是整个继承体系的可复用性会比较差，
	 * 特别是运用多态比较频繁时，程序运行出错的几率非常大。如果非要重写父类的方法，
	 * 比较通用的做法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖、聚合，组合等关系代替。
	 */
	@Test
	public void test1(){
		Calculate calculate = new Calculate();
		calculate.add(10,20);
		calculate.divide(100,10);

		CalculateAdvance advance = new CalculateAdvance();
		advance.sub(100,90);
		advance.divide(100,10);
	}
}
