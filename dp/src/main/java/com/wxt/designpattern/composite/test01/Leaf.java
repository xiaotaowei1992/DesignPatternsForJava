package com.wxt.designpattern.composite.test01;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/12/8 17:22
 * QQ:1021061446
 * 叶子对象，叶子对象不再包含其它子对象
 *********************************/
public class Leaf extends Component {
    /**
     * 示意方法，叶子对象可能有自己的功能方法
     */
    public void someOperation() {
        // do something
    }

}