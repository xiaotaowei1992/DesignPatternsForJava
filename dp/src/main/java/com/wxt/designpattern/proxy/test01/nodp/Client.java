package com.wxt.designpattern.proxy.test01.nodp;

import java.util.List;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/31 20:50
 * QQ:1021061446
 *
 *********************************/
public class Client {
    public static void main(String[] args) throws Exception{
        UserManager userManager = new UserManager();
        List<UserModel> col = userManager.getUserByDepId("0101");
        System.out.println(col);
    }
}
