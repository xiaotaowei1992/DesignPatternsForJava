package com.wxt.designpattern.proxy.test01.withdp;

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
        List<UserModelApi> col = userManager.getUserByDepId("0101");

        //如果只是显示用户名称，那么不需要重新查询数据库
        for(UserModelApi umApi : col){
            System.out.println("用户编号：="+umApi.getUserId()+",用户姓名：="+umApi.getName());
        }
        //如果访问非用户编号和用户姓名外的属性，那就会重新查询数据库
        for(UserModelApi umApi : col){
            System.out.println("用户编号：="+umApi.getUserId()+",用户姓名：="+umApi.getName()+",所属部门：="+umApi.getDepId());
        }
        for(UserModelApi umApi : col){
            System.out.println("用户编号：="+umApi.getUserId()+",用户姓名：="+umApi.getName()+",所属部门：="+umApi.getDepId());
        }
    }
}

//以时间换空间
//1+N次查询的问题

//Lazy Load===〉实现机制就是   代理
