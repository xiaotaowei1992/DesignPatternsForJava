package com.wxt.designpattern.command.test02.example2;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 16:37
 * QQ:1021061446
 * 命令对象，蒜泥白肉
 *********************************/
public class PorkCommand implements Command {
    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }


    public void execute() {
        this.cookApi.cook("蒜泥白肉");
    }
}