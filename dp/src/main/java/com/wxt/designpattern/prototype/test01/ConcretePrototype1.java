package com.wxt.designpattern.prototype.test01;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/30 22:30
 * QQ:1021061446
 * 克隆的具体实现对象
 *********************************/
public class ConcretePrototype1 implements Prototype {
    public Prototype clone() {
        //最简单的克隆，新建一个自身对象，由于没有属性，就不去复制值了
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}