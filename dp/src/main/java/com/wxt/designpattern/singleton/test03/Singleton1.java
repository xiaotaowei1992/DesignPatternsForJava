package com.wxt.designpattern.singleton.test03;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 13:36
 * QQ:1021061446
 * 双重检查加锁
 *********************************/
public class Singleton1 {
    /**
     * 对保存实例的变量添加volatile的修饰
     */
    private volatile static Singleton1 instance = null;
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized(Singleton1.class){
                //再次检查实例是否存在，如果不存在才真的创建实例
                if(instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
