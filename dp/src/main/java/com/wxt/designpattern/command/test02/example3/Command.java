package com.wxt.designpattern.command.test02.example3;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 22:40
 * QQ:1021061446
 * 命令接口，声明执行的操作
 *********************************/
public interface Command {
    /**
     * 执行命令对应的操作
     */
    void execute();
    /**
     * 设置命令的接收者
     * @param cookApi 命令的接收者
     */
    void setCookApi(CookApi cookApi);
    /**
     * 返回发起请求的桌号，就是点菜的桌号
     * @return 发起请求的桌号
     */
    int getTableNum();
}