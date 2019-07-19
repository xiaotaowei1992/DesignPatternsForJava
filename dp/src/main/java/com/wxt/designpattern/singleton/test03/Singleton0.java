package com.wxt.designpattern.singleton.test03;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 13:36
 * QQ:1021061446
 *
 *********************************/
public class Singleton0 {
    private static Singleton0 instance;
    private Singleton0 (){
    }
    public static synchronized Singleton0 getInstance() {
        if (instance == null) {
            instance = new Singleton0();
        }
        return instance;
    }
}
//这种写法能够在多线程中很好的工作，但是每次调用getInstance方法时都需要进行同步
// ，造成不必要的同步开销，而且大部分时候我们是用不到同步的，所以不建议用这种模式。
