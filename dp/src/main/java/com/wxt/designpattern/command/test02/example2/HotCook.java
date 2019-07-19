package com.wxt.designpattern.command.test02.example2;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 16:35
 * QQ:1021061446
 * 厨师对象，做热菜
 *********************************/
public class HotCook implements CookApi{

    public void cook(String name) {
        System.out.println("本厨师正在做："+name);
    }
}
