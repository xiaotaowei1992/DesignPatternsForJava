package com.wxt.designpattern.adapter.classadapter;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 11:43
 * QQ:1021061446
 *
 *********************************/

import java.util.List;

/**
 * 类适配器对象
 */
public class ClassAdapter extends LogFileOptImpl implements ILogDbOpt{

    public ClassAdapter(String logFilePathName) {
        super(logFilePathName);
    }

    public void createLog(LogEntity lm) {
        //1：先读取文件的内容
        List<LogEntity> list = this.readLogFile();
        //2：加入新的日志对象
        list.add(lm);
        //3：重新写入文件
        this.writeLogFile(list);
    }

    public List<LogEntity> getAllLog() {
        return this.readLogFile();
    }

    public void removeLog(LogEntity lm) {
        //1：先读取文件的内容
        List<LogEntity> list = this.readLogFile();
        //2：删除相应的日志对象
        list.remove(lm);
        //3：重新写入文件
        this.writeLogFile(list);
    }

    public void updateLog(LogEntity lm) {
        //1：先读取文件的内容
        List<LogEntity> list = this.readLogFile();
        //2：修改相应的日志对象
        for(int i=0;i<list.size();i++){
            if(list.get(i).getLogId().equals(lm.getLogId())){
                list.set(i, lm);
                break;
            }
        }
        //3：重新写入文件
        this.writeLogFile(list);
    }
}

