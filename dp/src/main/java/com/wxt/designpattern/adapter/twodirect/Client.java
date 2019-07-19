package com.wxt.designpattern.adapter.twodirect;

import java.util.ArrayList;
import java.util.List;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 11:33
 * QQ:1021061446
 *
 *********************************/
public class Client {
    public static void main(String[] args) {
        //准备日志内容，也就是测试的数据
        LogEntity lm1 = new LogEntity();
        lm1.setLogId("001");
        lm1.setOperateUser("admin");
        lm1.setOperateTime("2018-03-02 10:08:18");
        lm1.setLogContent("这是一个测试");

        List<LogEntity> list = new ArrayList<LogEntity>();
        list.add(lm1);

        //创建操作日志文件的对象
        ILogFileOpt fileLogApi = new LogFileOptImpl("adapter_logFile.log");
        ILogDbOpt dbLogApi = new LogDbOptImpl();

        //创建经过双向适配后的操作日志的接口对象
        ILogFileOpt fileLogApi2 = new TwoDirectAdapter(fileLogApi, dbLogApi);
        ILogDbOpt dbLogApi2 = new TwoDirectAdapter(fileLogApi, dbLogApi);

        //先测试从文件操作适配到第二版，虽然调用的是第二版的接口，其实是文件操作在实现
        dbLogApi2.createLog(lm1);
        List<LogEntity> allLog = dbLogApi2.getAllLog();
        System.out.println("allLog555=" + allLog);

        //再测试从数据库存储适配成第一版的接口，也就是调用第一版的接口，其实是数据实现
        System.out.println("--------------------------->File Api  ");
        fileLogApi2.writeLogFile(list);
        fileLogApi2.readLogFile();
    }
}
