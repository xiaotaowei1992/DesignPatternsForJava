package com.wxt.designpattern.prototype.test01.withdp;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/30 22:53
 * QQ:1021061446
 *  个人订单对象,利用Java的Clone功能
 *********************************/
public class PersonalOrder2 implements Cloneable,OrderApi {
    /**
     * 订购人员姓名
     */
    private String customerName;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    public int getOrderProductNum() {
        return this.orderProductNum;
    }
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }



    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String toString(){
        return "本个人订单的订购人是="+this.customerName+"，订购产品是="+this.productId+"，订购数量为="+this.orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        //不做实现
        return null;
    }
    @Override
    public Object clone(){
        //克隆方法的真正实现，直接调用父类的克隆方法就可以了
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}