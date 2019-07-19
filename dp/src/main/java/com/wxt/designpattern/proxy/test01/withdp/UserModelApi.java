package com.wxt.designpattern.proxy.test01.withdp;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/31 20:54
 * QQ:1021061446
 * 定义用户数据对象的接口
 *********************************/
public interface UserModelApi {
    String getUserId();
    void setUserId(String userId);
    String getName();
    void setName(String name);
    String getDepId();
    void setDepId(String depId);
    String getSex();
    void setSex(String sex);
}
