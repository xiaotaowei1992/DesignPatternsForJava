package com.wxt.designpattern.command.test03.example1;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/1 22:52
 * QQ:1021061446
 *
 *********************************/
public class PrintService implements Command{
    /**
     * 要输出的内容
     */
    private String str = "";
    /**
     * 构造方法，传入要输出的内容
     * @param s 要输出的内容
     */
    public PrintService(String s){
        str = s;
    }

    public void execute() {
        System.out.println("打印的内容为="+str);
    }
}