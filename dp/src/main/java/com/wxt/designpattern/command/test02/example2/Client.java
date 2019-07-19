package com.wxt.designpattern.command.test02.example2;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 16:40
 * QQ:1021061446
 *
 *********************************/
public class Client {
    public static void main(String[] args) {
        //只是负责向服务员点菜就好了
        //创建服务员
        Waiter waiter = new Waiter();

        //创建命令对象，就是要点的菜
        Command chop = new ChopCommand();
        Command duck = new DuckCommand();
        Command pork = new PorkCommand();

        //点菜，就是把这些菜让服务员记录下来
        waiter.orderDish(chop);
        waiter.orderDish(duck);
        waiter.orderDish(pork);

        //点菜完毕
        waiter.orderOver();
    }
}
