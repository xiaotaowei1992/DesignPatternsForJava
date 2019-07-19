package com.wxt.designpattern.interpreter.test01.withdp;

public class Client {
	public static void main(String[] args) throws Exception {
		//准备上下文
		Context c = new Context("InterpreterTest.xml");

		//想要获取c元素的值，也就是如下表达式的值："root/a/b/c"

		//首先要构建解释器的抽象语法树
		ElementExpression root = new ElementExpression("root");
		ElementExpression aEle = new ElementExpression("a");
		ElementExpression bEle = new ElementExpression("b");
		ElementTerminalExpression cEle = new ElementTerminalExpression("c");
		//组合起来
		root.addEle(aEle);
		aEle.addEle(bEle);
		bEle.addEle(cEle);

		//调用
		String ss[] = root.interpret(c);
		System.out.println("c的值是="+ss[0]);

		c.reInit();
		//想要获取c元素的name属性，也就是如下表达式的值："root/a/b/c.name"
		//这个时候c不是终结了，需要把c修改成ElementExpressioin
		ElementExpression root1 = new ElementExpression("root");
		ElementExpression aEle1 = new ElementExpression("a");
		ElementExpression bEle1 = new ElementExpression("b");
		ElementExpression cEle1 = new ElementExpression("c");
		PropertyTerminalExpression prop = new PropertyTerminalExpression("name");
		//组合
		root1.addEle(aEle1);
		aEle1.addEle(bEle1);
		bEle1.addEle(cEle1);
		cEle1.addEle(prop);

		//调用
		String ss1[] = root1.interpret(c);
		System.out.println("c的属性name的值是="+ss1[0]);

		//如果要使用同一个上下文，连续进行解析，需要重新初始化上下文对象
		//比如要连续的重新再获取一次属性name的值，当然你可以重新组合元素，
		//重新解析，只要是在使用同一个上下文，就需要重新初始化上下文对象
		c.reInit();
		String ss2[] = root1.interpret(c);
		System.out.println("重新获取c的属性name的值是="+ss2[0]);
	}
}
