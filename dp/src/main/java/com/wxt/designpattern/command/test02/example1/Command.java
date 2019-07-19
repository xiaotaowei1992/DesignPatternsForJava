package com.wxt.designpattern.command.test02.example1;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 15:32
 * QQ:1021061446
 * 命令接口，声明执行的操作，支持可撤销操作
 *********************************/
public interface Command {
    /**
     * 执行命令对应的操作
     */
    void execute();
    /**
     * 执行撤销命令对应的操作
     */
   void undo();
}
