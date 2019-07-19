package com.wxt.designpattern.command.test02.example2;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 16:36
 * QQ:1021061446
 * 命令对象，北京烤鸭
 *********************************/
public class DuckCommand implements Command{
    private CookApi cookApi = null;
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    public void execute() {
        this.cookApi.cook("北京烤鸭");
    }
}
