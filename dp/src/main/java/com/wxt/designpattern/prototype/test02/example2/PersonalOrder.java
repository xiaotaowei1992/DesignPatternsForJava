package com.wxt.designpattern.prototype.test02.example2;
/**
 * 个人订单对象
 */
public class PersonalOrder implements Cloneable , OrderApi{
	/**
	 * 订购人员姓名
	 */
	private String customerName;
	/**
	 * 产品对象
	 */
	private Product product = null;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	public String toString(){
		//简单点输出
		return "订购产品是="+this.product.getName()+"，订购数量为="+this.orderProductNum;
	}

	public Object clone(){
		PersonalOrder obj=null;
		try {
			obj =(PersonalOrder)super.clone();
			//这一句话不可少 why?
			/**
			 * 在调用super.clone()方法的时候，java是先开辟一块内存空间，然后把实例对象的值原样
			 * 拷贝过去，对于基本数据类型没问题，但是属性product是一个引用类型，把值拷贝过去也即把对应的内存地址
			 * 也拷贝过去了，也就是拷贝后的实例和原型对象实例指向的是同一块内存空间。
			 * 因此想要真正的执行深度拷贝，必须手动的对每一个引用类型的属性值进行克隆，并重新设置，覆盖掉super.clone()所拷贝的值
			 */
			obj.setProduct((Product)this.product.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
