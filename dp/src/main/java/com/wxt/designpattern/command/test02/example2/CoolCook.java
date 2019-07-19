package com.wxt.designpattern.command.test02.example2;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 16:34
 * QQ:1021061446
 * 厨师对象，做凉菜
 *********************************/
public class CoolCook implements CookApi {
    public void cook(String name) {
        System.out.println("凉菜"+name+"已经做好，本厨师正在装盘。" );
    }
}
