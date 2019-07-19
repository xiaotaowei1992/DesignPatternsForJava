package com.wxt.designpattern.adapter.withdp;

import java.io.*;
import java.util.List;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 10:34
 * QQ:1021061446
 *
 *********************************/
public class LogFileOptImpl implements ILogFileOpt {

    private String logFilePathName;

    public LogFileOptImpl(String logFilePathName) {
        this.logFilePathName = logFilePathName;
    }

    /**
     * Object输出的本来就是字节数据
     * @return
     */
    @Override
    public List<LogEntity> readLogFile() {
        List<LogEntity> list = null;
        ObjectInputStream oin = null;
        try {
            File f = new File(logFilePathName);
            if(f.exists()){
                oin = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream(f))
                );
                list = (List<LogEntity>)oin.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(oin!=null){
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogEntity> list) {

        File f = new File(logFilePathName);
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(f))
            );
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                oout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
