package com.wxt.designpattern.adapter.classadapter;

import java.util.ArrayList;
import java.util.List;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 11:46
 * QQ:1021061446
 *
 *********************************/
public class Client {
    public static void main(String[] args) {
        //准备日志内容，也就是测试的数据
        LogEntity lm1 = new LogEntity();
        lm1.setLogId("001");
        lm1.setOperateUser("admin");
        lm1.setOperateTime("2010-03-02 10:08:18");
        lm1.setLogContent("这是一个测试");

        List<LogEntity> list = new ArrayList<LogEntity>();
        list.add(lm1);


        //创建新版的操作日志的接口对象
        ILogDbOpt api = new ClassAdapter("adapter_logFile.log");

        //保存日志文件
        api.createLog(lm1);

        //读取日志文件的内容
        List<LogEntity> allLog = api.getAllLog();
        System.out.println("allLog="+allLog);
    }
}
