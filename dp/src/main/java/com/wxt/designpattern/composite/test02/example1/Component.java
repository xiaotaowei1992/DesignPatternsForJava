package com.wxt.designpattern.composite.test02.example1;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/8 18:28
 * QQ:1021061446
 * 抽象的组件对象，安全性的实现方式
 *********************************/
public abstract class Component {
    /**
     * 输出组件自身的名称
     */
    public abstract void printStruct(String preStr);
}

