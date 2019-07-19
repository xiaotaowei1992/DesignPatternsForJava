package com.wxt.designpattern.singleton.test01;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 13:09
 * QQ:1021061446
 *
 *********************************/

/**
 * 单例-饿汉式
 */
public class Singleton2 {
    /**
     * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只会创建一次
     */
    private static Singleton2 instance = new Singleton2();
    /**
     * 私有化构造方法，好在内部控制创建实例的数目
     */
    private Singleton2(){

    }
    /**
     * 定义一个方法来为客户端提供类实例
     * @return 一个Singleton的实例
     */
    public Singleton2 getInstance(){
        return instance;
    }

    //*************************** 其他属性方法*******************
    /**
     * 示意方法，单例可以有自己的操作
     */
    public void singletonOperation(){
        //功能处理
    }
    /**
     * 示意属性，单例可以有自己的属性
     */
    private String singletonData;
    /**
     * 示意方法，让外部通过这些方法来访问属性的值
     * @return 属性的值
     */
    public String getSingletonData(){
        return singletonData;
    }
}
