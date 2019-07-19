package com.wxt.designpattern.command.test02.example3;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 22:38
 * QQ:1021061446
 * 厨师的接口
 *********************************/
public interface CookApi {
    /**
     * 示意，做菜的方法
     * @param tableNum 点菜的桌号
     * @param name 菜名
     */
    void cook(int tableNum,String name);
}
