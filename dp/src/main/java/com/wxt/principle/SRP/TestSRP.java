package com.wxt.principle.SRP;

import org.junit.Test;

/**
 * @Author: weixiaotao
 * @ClassName TestSRP
 * @Date: 2018/11/7 16:04
 * @Description: 单一职责原则
 *
 * 只有逻辑足够简单，才可以在代码级别（类级别）上违反单一职责原则；
 * 只有类中方法数量足够少，才可以在方法级别上违反单一职责原则
 */
public class TestSRP {
	/**
	 * 1.描述动物呼吸
	 */
	class Animal {
		public void breathe(String animal){
			System.out.println(animal + "呼吸空气");
		}
	}
	@Test
	public void test(){
		Animal animal = new Animal();
		animal.breathe("哈士奇");
		animal.breathe("波斯猫");
		animal.breathe("唐老鸭");
	}

	/**
	 * 并不是所有的动物都呼吸空气的，比如鱼就是呼吸水的
	 * 遵循单一职责原则:需要将Animal类细分为陆生动物类Terrestrial，水生动物Aquatic
	 * 这样修改花销是很大的，除了将原来的类分解之外，还需要修改客户端
	 */
	/**
	 * 陆生动物
	 */
	class Terrestrial{
		public void breathe(String animal){
			System.out.println(animal+"呼吸空气");
		}
	}
	/**
	 * 水生动物
	 */
	class Aquatic{
		public void breathe(String animal){
			System.out.println(animal+"呼吸水");
		}
	}

	@Test
	public void test2(){
		Terrestrial terrestrial = new Terrestrial();
		terrestrial.breathe("牛");
		terrestrial.breathe("羊");
		terrestrial.breathe("猪");
		Aquatic aquatic = new Aquatic();
		aquatic.breathe("鱼");
	}

	/**
	 * 直接修改类Animal来达成目的虽然方法级别上违背了单一职责原则，但花销却小的多
	 */
	class Animal2{
		public void breathe(String animal){
			if("鱼".equals(animal)){
				System.out.println(animal+"呼吸水");
			}else{
				System.out.println(animal+"呼吸空气");
			}
		}
	}

	@Test
	public void test3(){
		Animal2 animal = new Animal2();
		animal.breathe("哈士奇");
		animal.breathe("波斯猫");
		animal.breathe("唐老鸭");
		animal.breathe("鱼");
	}

	/**
	 * 修改方式没有改动原来的方法，而是在类中新加了一个方法，这样虽然也违背了单一职责原则，
	 * 但在方法级别上却是符合单一职责原则的，因为它并没有动原来方法的代码
	 */
	class Animal3{
		public void breatheOxy(String animal){
			System.out.println(animal+"呼吸空气");
		}
		public void breatheWater(String animal){
			System.out.println(animal+"呼吸水");
		}
	}

	@Test
	public void test4(){
		Animal3 animal = new Animal3();
		animal.breatheOxy("哈士奇");
		animal.breatheOxy("波斯猫");
		animal.breatheOxy("唐老鸭");
		animal.breatheWater("鱼");
	}

}
