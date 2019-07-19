package com.wxt.designpattern.singleton.test01;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 13:22
 * QQ:1021061446
 *
 *********************************/

public class Client {
    public static void main(String[] args) {
        //创建读取应用配置的对象

        for(int i=0;i<5;i++){
            AppConfig config = AppConfig.getInstance();

            String paramA = config.getParameterA();
            String paramB = config.getParameterB();

            System.out.println("i="+i+"paramA="+paramA+",paramB="+paramB);
        }
    }
}