package com.wxt.designpattern.singleton.test02;

import java.util.HashMap;
import java.util.Map;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 13:34
 * QQ:1021061446
 *
 *********************************/

/**
 * 简单演示如何扩展单例模式，控制实例数目为3个
 */
public class SingletonMore {
    /**
     * 定义一个缺省的key值的前缀
     */
    private final static String DEFAULT_PREKEY = "Cache";
    /**
     * 缓存实例的容器
     */

    //实例调度的问题
    private static Map<String,SingletonMore> map = new HashMap<String,SingletonMore>();
    /**
     * 用来记录当前正在使用第几个实例，到了控制的最大数目，就返回从1开始
     */
    private static int num = 1;
    /**
     * 定义控制实例的最大数目
     */
    private final static int NUM_MAX = 3;

    private SingletonMore(){}

    public static SingletonMore getInstance(){
        String key = DEFAULT_PREKEY+num;
        SingletonMore oneExtend = map.get(key);
        if(oneExtend==null){
            oneExtend = new SingletonMore();
            map.put(key, oneExtend);
        }
        //把当前实例的序号加1
        num++;
        if(num > NUM_MAX){
            //如果实例的序号已经达到最大数目了，那就重复从1开始获取
            num = 1;
        }
        return oneExtend;
    }

    public static void main(String[] args) {
        SingletonMore t1 = getInstance();
        SingletonMore t2 = getInstance();
        SingletonMore t3 = getInstance();
        SingletonMore t4 = getInstance();
        SingletonMore t5 = getInstance();
        SingletonMore t6 = getInstance();

        System.out.println("t1=="+t1);
        System.out.println("t2=="+t2);
        System.out.println("t3=="+t3);
        System.out.println("t4=="+t4);
        System.out.println("t5=="+t5);
        System.out.println("t6=="+t6);
    }
}
