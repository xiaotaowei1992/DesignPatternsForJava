package com.wxt.principle.ISP;

import org.junit.Test;

/**
 * @Author: weixiaotao
 * @ClassName TestISP
 * @Date: 2018/11/19 13:58
 * @Description:
 */
public class TestISP {
	interface I {
		void method1();
		void method2();
		void method3();
		void method4();
		void method5();
	}

	class A{
		public void depend1(I i){
			i.method1();
		}
		public void depend2(I i){
			i.method2();
		}
		public void depend3(I i){
			i.method3();
		}
	}

	class B implements I{
		public void method1() {
			System.out.println("类B实现接口I的方法1");
		}
		public void method2() {
			System.out.println("类B实现接口I的方法2");
		}
		public void method3() {
			System.out.println("类B实现接口I的方法3");
		}
		//对于类B来说，method4和method5不是必需的，但是由于接口A中有这两个方法，
		//所以在实现过程中即使这两个方法的方法体为空，也要将这两个没有作用的方法进行实现。
		public void method4() {}
		public void method5() {}
	}

	class C{
		public void depend1(I i){
			i.method1();
		}
		public void depend2(I i){
			i.method4();
		}
		public void depend3(I i){
			i.method5();
		}
	}

	class D implements I{
		public void method1() {
			System.out.println("类D实现接口I的方法1");
		}
		//对于类D来说，method2和method3不是必需的，但是由于接口A中有这两个方法，
		//所以在实现过程中即使这两个方法的方法体为空，也要将这两个没有作用的方法进行实现。
		public void method2() {}
		public void method3() {}

		public void method4() {
			System.out.println("类D实现接口I的方法4");
		}
		public void method5() {
			System.out.println("类D实现接口I的方法5");
		}
	}

	@Test
	public void test1(){
		A a = new A();
		a.depend1(new B());
		a.depend2(new B());
		a.depend3(new B());

		C c = new C();
		c.depend1(new D());
		c.depend2(new D());
		c.depend3(new D());
	}

	//*******************-----------------------------------
	interface I1 {
		public void method1();
	}

	interface I2 {
		public void method2();
		public void method3();
	}

	interface I3 {
		public void method4();
		public void method5();
	}

	class A1{
		public void depend1(I1 i){
			i.method1();
		}
		public void depend2(I2 i){
			i.method2();
		}
		public void depend3(I2 i){
			i.method3();
		}
	}

	class B1 implements I1, I2{
		public void method1() {
			System.out.println("类B实现接口I1的方法1");
		}
		public void method2() {
			System.out.println("类B实现接口I2的方法2");
		}
		public void method3() {
			System.out.println("类B实现接口I2的方法3");
		}
	}

	class C1{
		public void depend1(I1 i){
			i.method1();
		}
		public void depend2(I3 i){
			i.method4();
		}
		public void depend3(I3 i){
			i.method5();
		}
	}

	class D1 implements I1, I3{
		public void method1() {
			System.out.println("类D实现接口I1的方法1");
		}
		public void method4() {
			System.out.println("类D实现接口I3的方法4");
		}
		public void method5() {
			System.out.println("类D实现接口I3的方法5");
		}
	}

	@Test
	public void test2(){
		A1 a = new A1();
		a.depend1(new B1());
		a.depend2(new B1());
		a.depend3(new B1());


		C1 c = new C1();
		c.depend1(new D1());
		c.depend2(new D1());
		c.depend3(new D1());

	}

}
