package com.wxt.designpattern.prototype.test01.withdp;


/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/30 22:44
 * QQ:1021061446
 *
 *********************************/
public class OrderClient {
    public static void main(String[] args) {
        //创建订单对象，这里为了演示简单，直接new了
        PersonalOrder op = new PersonalOrder();
        //设置订单数据
        op.setOrderProductNum(1925);
        op.setCustomerName("张三");
        op.setProductId("P0001");

        //这里获取业务处理的类，也直接new了，为了简单，连业务接口都没有做
        OrderBusiness ob = new OrderBusiness();
        //调用业务来保存订单对象
        ob.saveOrder(op);
        System.out.println("=====================");
        test();
        System.out.println("========testCloneable=============");
        testCloneable();
    }
    public static void test(){
        //先创建原型实例
        OrderApi oa1 = new PersonalOrder();
        //设置原型实例的订单数量的值
        oa1.setOrderProductNum(100);
        //为了简单，这里仅仅输出数量
        System.out.println("这是第一次获取的对象实例==="+oa1.getOrderProductNum());

        //通过克隆来获取新的实例
        OrderApi oa2 = (OrderApi)oa1.cloneOrder();
        //修改它的数量
        oa2.setOrderProductNum(80);
        //输出克隆出来的对象的值
        System.out.println("输出克隆出来的实例==="+oa2.getOrderProductNum());
        //再次输出原型实例的值
        System.out.println("再次输出原型实例==="+oa1.getOrderProductNum());
    }


    public static void testCloneable(){
        //先创建原型实例
        PersonalOrder2 oa1 = new PersonalOrder2();

        //设置原型实例的订单数量的值
        oa1.setOrderProductNum(100);
        //为了简单，这里仅仅输出数量
        System.out.println("这是第一次获取的对象实例==="+oa1.getOrderProductNum());

        //通过克隆来获取新的实例
        PersonalOrder2 oa2 = (PersonalOrder2)oa1.clone();
        //修改它的数量
        oa2.setOrderProductNum(80);
        //输出克隆出来的对象的值
        System.out.println("输出克隆出来的实例==="+oa2.getOrderProductNum());

        //再次输出原型实例的值
        System.out.println("再次输出原型实例==="+oa1.getOrderProductNum());
    }
}
