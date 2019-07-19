package com.wxt.designpattern.command.test02.example4;

/**
 * @Author: weixiaotao
 * @ClassName CookApi
 * @Date: 2018/12/3 19:00
 * @Description: 厨师的接口
 */
public interface CookApi {
	/**
	 * 示意，做菜的方法
	 * @param tableNum 点菜的桌号
	 * @param name 菜名
	 */
	void cook(int tableNum,String name);
}
