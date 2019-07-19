package com.wxt.designpattern.command.test02.example3;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 22:43
 * QQ:1021061446
 * 命令对象，北京烤鸭
 *********************************/
public class DuckCommand implements Command{
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

