package com.wxt.designpattern.adapter;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 10:13
 * QQ:1021061446
 *
 *********************************/
/**
 * 定义客户端使用的接口，与特定领域相关
 */
public interface Target {
    /**
     * 示意方法，客户端请求处理的方法
     */
    void typecRequest();
}
