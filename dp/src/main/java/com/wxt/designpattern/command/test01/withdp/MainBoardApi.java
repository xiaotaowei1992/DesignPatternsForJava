package com.wxt.designpattern.command.test01.withdp;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 13:55
 * QQ:1021061446
 * 主板的接口
 *********************************/
public interface MainBoardApi {
    /**
     * 主板具有能开机的功能
     */
    void open();

    /**
     * 主板具有实现重启的功能
     */
    void reset();
}
