package com.wxt.designpattern.adapter.withdp;

import java.util.List;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 11:06
 * QQ:1021061446
 *
 *********************************/
public class MyAdapter extends LogDbOptImpl {
    /**
     * 持有需要被适配的接口对象
     */
    private ILogFileOpt logAdaptee;

    private TimeUtil utilAdaptee = null;
    /**
     * 构造方法，传入需要被适配的对象
     * @param logAdaptee ,utilAdaptee需要被适配的对象
     */
    public MyAdapter(ILogFileOpt logAdaptee,TimeUtil utilAdaptee) {
        this.logAdaptee = logAdaptee;
        this.utilAdaptee = utilAdaptee;
    }
    public List<LogEntity> getAllLog() {
        return logAdaptee.readLogFile();
    }

    public void removeLog(LogEntity lm) {
        //1：先读取文件的内容
        List<LogEntity> list = logAdaptee.readLogFile();
        //2：删除相应的日志对象
        list.remove(lm);
        //3：重新写入文件
        logAdaptee.writeLogFile(list);
    }
}
