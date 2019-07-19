package com.wxt.designpattern.prototype.test01;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/30 22:29
 * QQ:1021061446
 * 声明一个克隆自身的接口
 *
 *********************************/
public interface Prototype {
    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    Prototype clone();
}
