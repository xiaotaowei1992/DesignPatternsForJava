package com.wxt.designpattern.singleton.test01;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 13:22
 * QQ:1021061446
 *
 *********************************/

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取应用配置文件，单例实现
 */
public class AppConfig {
    /**
     * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只会创建一次
     */
    private static AppConfig instance = new AppConfig();
    /**
     * 定义一个方法来为客户端提供AppConfig类的实例
     * @return 一个AppConfig的实例
     */
    public static AppConfig getInstance(){
        return instance;
    }

    /**
     * 用来存放配置文件中参数A的值
     */
    private String parameterA;
    /**
     * 用来存放配置文件中参数B的值
     */
    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }
    public String getParameterB() {
        return parameterB;
    }
    /**
     * 私有化构造方法
     */
    private AppConfig(){
        //调用读取配置文件的方法
        readConfig();
    }
    /**
     * 读取配置文件，把配置文件中的内容读出来设置到属性上
     */
    private void readConfig(){
        Properties p = new Properties();
        try {
        InputStream in = new FileInputStream(new File("AppConfig.properties"));

            System.out.println("现在读取配置文件一次============");
            p.load(in);
            //把配置文件中的内容读出来设置到属性上
            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
        } catch (Exception e) {
            System.out.println("装载配置文件出错了，具体堆栈信息如下：");
            e.printStackTrace();
        }
    }

}
