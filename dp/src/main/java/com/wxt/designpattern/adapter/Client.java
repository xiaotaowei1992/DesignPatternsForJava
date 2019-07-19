package com.wxt.designpattern.adapter;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 10:13
 * QQ:1021061446
 *
 *********************************/
public class Client {
    public static void main(String[] args) {
        //创建需被适配的对象
        Adaptee adaptee = new Adaptee();
        //创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        //请求处理
        target.typecRequest();
    }
}

