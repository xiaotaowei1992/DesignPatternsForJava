package com.wxt.designpattern.command.test03.example2;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 22:53
 * QQ:1021061446
 *
 *********************************/
public class Invoker {
    public void startPrint(Command cmd){
        System.out.println("在Invoker中，输出服务前");
        cmd.execute();
        System.out.println("输出服务结束");
    }
}