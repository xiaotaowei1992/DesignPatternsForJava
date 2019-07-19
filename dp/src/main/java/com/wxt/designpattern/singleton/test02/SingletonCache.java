package com.wxt.designpattern.singleton.test02;

import java.util.HashMap;
import java.util.Map;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 13:32
 * QQ:1021061446
 *
 *********************************/
public class SingletonCache {
    /**
     * 定义一个缺省的key值，用来标识在缓存中的存放
     */
    private final static String DEFAULT_KEY = "One";
    /**
     * 缓存实例的容器
     */
    private static Map<String,SingletonCache> map = new HashMap<String,SingletonCache>();
    /**
     * 私有化构造方法
     */
    private SingletonCache(){
        //
    }
    public static SingletonCache getInstance(){
        //先从缓存中获取
        SingletonCache instance = (SingletonCache)map.get(DEFAULT_KEY);
        //如果没有，就新建一个，然后设置回缓存中
        if(instance==null){
            instance = new SingletonCache();
            map.put(DEFAULT_KEY, instance);
        }
        //如果有就直接使用
        return instance;
    }

    public static void main(String[] args) {

        for(int i=0;i<3;i++){
            System.out.println(SingletonCache.getInstance());
        }

    }
}
