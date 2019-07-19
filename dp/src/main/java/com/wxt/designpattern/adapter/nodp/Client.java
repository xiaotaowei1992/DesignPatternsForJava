package com.wxt.designpattern.adapter.nodp;

import java.util.ArrayList;
import java.util.List;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 10:40
 * QQ:1021061446
 *
 *********************************/
public class Client {
    public static void main(String[] args) {
        //准备日志内容，也就是测试的数据
        LogEntity lm1 = new LogEntity();
        lm1.setLogId("001");
        lm1.setOperateUser("weixiaotao");
        lm1.setOperateTime("2018/10/21 10:40");
        lm1.setLogContent("这是一个测试");

        List<LogEntity> list = new ArrayList<LogEntity>();
        list.add(lm1);

        //创建操作日志文件的对象
        ILogFileOpt api = new LogFileOptImpl();
        //为了简单演示，将日志文件路径初始化
        ((LogFileOptImpl) api).setLogFilePathName("adapter_logFile.log");
        //保存日志文件
        api.writeLogFile(list);

        //读取日志文件的内容
        List<LogEntity> readLog = api.readLogFile();
        System.out.println("readLog="+readLog);
    }
}
