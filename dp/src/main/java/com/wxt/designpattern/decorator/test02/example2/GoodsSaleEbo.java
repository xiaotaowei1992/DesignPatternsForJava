package com.wxt.designpattern.decorator.test02.example2;

public class GoodsSaleEbo implements GoodsSaleEbi{

	public boolean sale(String user,String customer, SaleModel saleModel) {
		System.out.println(user+"保存了"+customer+"购买 "+saleModel+" 的销售数据");
		return true;
	}
}