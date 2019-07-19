package com.wxt.designpattern.proxy.test01;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/31 20:39
 * QQ:1021061446
 * 代理对象
 *********************************/
public class Proxy {
    /**
     * 持有被代理的具体的目标对象
     */
    private RealSubject realSubject;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param realSubject 被代理的具体的目标对象
     */
    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }
    public void request() {
        //在转调具体的目标对象前，可以执行一些功能处理
        //转调具体的目标对象的方法
        realSubject.request();
        //在转调具体的目标对象后，可以执行一些功能处理
    }

}
