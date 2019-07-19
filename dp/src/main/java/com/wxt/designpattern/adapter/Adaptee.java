package com.wxt.designpattern.adapter;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 10:13
 * QQ:1021061446
 *
 *********************************/
/**
 * 已经存在的接口，这个接口需要被适配
 */
public class Adaptee {
     /**
     * 示意方法，原本已经存在，已经实现的方法
	 */
    public void usbRequest() {
        System.out.println("小米手机usb 充电....");
    }
}
