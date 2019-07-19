package com.wxt.designpattern.composite.test02.example3;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/8 18:29
 * QQ:1021061446
 *
 *********************************/
public class Client {
    public static void main(String[] args) {
        //定义所有的组合对象
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2= new Composite("衬衣");
        Component c3= new Composite("男装");
        //设置一个环状引用
        root.addChild(c1);
        c1.addChild(c2);
		c2.addChild(c3);
//        c2.addChild(c1);

        //调用根对象的输出功能来输出整棵树
        root.printStruct("");
    }
}