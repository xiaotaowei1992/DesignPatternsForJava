package com.wxt.designpattern.adapter.withdp;

import java.util.List;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 11:03
 * QQ:1021061446
 *
 *********************************/
public class LogDbOptImpl implements ILogDbOpt {
    @Override
    public void createLog(LogEntity lm) {
        System.out.println("create file in mysql....");
    }

    @Override
    public void updateLog(LogEntity lm) {
        System.out.println("update file in mysql....");
    }

    @Override
    public void removeLog(LogEntity lm) {

    }

    @Override
    public List<LogEntity> getAllLog() {
        return null;
    }
}
