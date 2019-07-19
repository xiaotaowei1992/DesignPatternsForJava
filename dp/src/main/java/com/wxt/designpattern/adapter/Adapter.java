package com.wxt.designpattern.adapter;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 10:13
 * QQ:1021061446
 *
 *********************************/
/**
 * 适配器(对象适配器)
 */
public class Adapter implements Target {
    /**
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;
    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void typecRequest() {
        //可能转调已经实现了的方法，进行适配
        System.out.println("usb 转 typec....");
        adaptee.usbRequest();
    }
}
