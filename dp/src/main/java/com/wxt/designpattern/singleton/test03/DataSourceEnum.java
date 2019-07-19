package com.wxt.designpattern.singleton.test03;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 13:39
 * QQ:1021061446
 *
 *********************************/
/**
 * 使用枚举来实现单例模式的示例
 *
 * Java规范中规定，每一个枚举类型极其定义的枚举变量在JVM中都是唯一的，因此在枚举类型的序列化和反序列化上，
 * Java做了特殊的规定。
 * 在序列化的时候Java仅仅是将枚举对象的name属性输出到结果中，反序列化的时候则是
 * 通过 java.lang.Enum 的 valueOf() 方法来根据名字查找枚举对象。
 * 也就是说，以下面枚举为例，序列化的时候只将 DATASOURCE 这个名称输出，
 * 反序列化的时候再通过这个名称，查找对于的枚举类型，因此反序列化后的实例也会和之前被序列化的对象实例相同。
 * 枚举天生保证序列化单例。
 * 原文：https://blog.csdn.net/gavin_dyson/article/details/70832185
 *
 */
public enum DataSourceEnum {
    /**
     * 定义一个枚举的元素,它就代表了 DataSourceEnum 的一个实例
     */
    DATASOURCE;

    private DBConnection connection;

    DataSourceEnum(){
        connection = new DBConnection();
    }
    public DBConnection getConnection(){
        return connection;
    }

}
