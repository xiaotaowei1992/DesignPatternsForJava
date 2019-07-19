package com.wxt.designpattern.command.test03.example2;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 22:53
 * QQ:1021061446
 *
 *********************************/
public interface Command {
    void execute();
    /**
     * 设置要输出的内容
     * @param s 要输出的内容
     */
    void setStr(String s);
}