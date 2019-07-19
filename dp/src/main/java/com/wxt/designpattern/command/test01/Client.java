package com.wxt.designpattern.command.test01;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 13:53
 * QQ:1021061446
 *
 *********************************/
public class Client {
    /**
     * 示意，负责创建命令对象，并设定它的接受者
     */
    public void assemble(){
        //创建接受者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建Invoker，把命令对象设置进去
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        //执行命令
        invoker.runCommand();
    }
}
