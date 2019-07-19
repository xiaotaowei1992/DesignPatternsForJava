package com.wxt.designpattern.abstractfactory.nodp;

/**
 * @Auther: weixiaotao
 * @ClassName MainboardFactory
 * @Date: 2018/10/22 20:51
 * @Description: 创建主板的简单工厂
 */
public class MainboardFactory {
	/**
	 * 创建主板接口对象的方法
	 * @param type 选择主板类型的参数
	 * @return 主板接口对象的方法
	 */
	public static MainboardApi createMainboardApi(int type){
		MainboardApi mainboard = null;
		//根据参数来选择并创建相应的主板对象
		if(type==1){
			mainboard = new GAMainboard(2048);
		}else if(type==2){
			mainboard = new MSIMainboard(1024);
		}
		return mainboard;
	}
}
