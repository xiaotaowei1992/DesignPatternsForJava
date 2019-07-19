package com.wxt.designpattern.singleton.test03;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 13:40
 * QQ:1021061446
 *
 *********************************/
public class Client {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println(DataSourceEnum.DATASOURCE.getConnection().hashCode());
        }
    }
}
