package com.wxt.designpattern.adapter.classadapter;


import java.util.List;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 11:03
 * QQ:1021061446
 *
 *********************************/
public class LogDbOptImpl implements ILogDbOpt {
    public void createLog(LogEntity lm) {
        System.out.println("now in LogDbOperate createLog,lm="+lm);
    }

    public List<LogEntity> getAllLog() {
        System.out.println("now in LogDbOperate getAllLog");
        return null;
    }

    public void removeLog(LogEntity lm) {
        System.out.println("now in LogDbOperate removeLog,lm="+lm);
    }

    public void updateLog(LogEntity lm) {
        System.out.println("now in LogDbOperate updateLog,lm="+lm);
    }

}
