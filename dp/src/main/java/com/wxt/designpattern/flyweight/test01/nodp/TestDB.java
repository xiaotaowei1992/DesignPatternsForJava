package com.wxt.designpattern.flyweight.test01.nodp;
import java.util.*;
/**
 * 供测试用，在内存中模拟数据库中的值
 */
public class TestDB {
	/**
	 * 用来存放授权数据的值
	 */
	public static List<String> colDB = new ArrayList<>();

	static{
		//通过静态块来填充模拟的数据
		colDB.add("张三,人员列表,查看");
		colDB.add("李四,人员列表,查看");
		colDB.add("李四,薪资数据,查看");
		colDB.add("李四,薪资数据,修改");
		//增加更多的授权数据
		for(int i=0;i<3;i++){
			colDB.add("张三"+i+",人员列表,查看");
		}
	}
}
