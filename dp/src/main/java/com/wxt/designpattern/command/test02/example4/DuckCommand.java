package com.wxt.designpattern.command.test02.example4;

/**
 * @Author: weixiaotao
 * @ClassName DuckCommand
 * @Date: 2018/12/3 19:03
 * @Description: 命令对象，北京烤鸭
 */

import java.io.Serializable;
public class DuckCommand implements Command,Serializable {
	private CookApi cookApi = null;
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	private int tableNum;
	public DuckCommand(int tableNum){
		this.tableNum = tableNum;
	}
	public int getTableNum(){
		return this.tableNum;
	}

	public void execute() {
		this.cookApi.cook(tableNum,"北京烤鸭");
	}
}

