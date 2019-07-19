package com.wxt.designpattern.proxy.test01;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/31 20:38
 * QQ:1021061446
 *  具体的目标对象，是真正被代理的对象
 *********************************/
public class RealSubject implements Subject {
    public void request() {
        //执行具体的功能处理
        System.out.println("具体的功能处理......");
    }
}
