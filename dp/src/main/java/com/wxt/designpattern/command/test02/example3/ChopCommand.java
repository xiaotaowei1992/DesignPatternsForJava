package com.wxt.designpattern.command.test02.example3;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 22:43
 * QQ:1021061446
 * 命令对象，绿豆排骨煲
 *********************************/
public class ChopCommand implements Command{
    /**
     * 持有具体做菜的厨师的对象
     */
    private CookApi cookApi = null;
    /**
     * 设置具体做菜的厨师的对象
     * @param cookApi 具体做菜的厨师的对象
     */
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }
    /**
     * 点菜的桌号
     */
    private int tableNum;
    /**
     * 构造方法，传入点菜的桌号
     * @param tableNum 点菜的桌号
     */
    public ChopCommand(int tableNum){
        this.tableNum = tableNum;
    }
    public int getTableNum(){
        return this.tableNum;
    }

    public void execute() {
        this.cookApi.cook(tableNum,"绿豆排骨煲");
    }
}
