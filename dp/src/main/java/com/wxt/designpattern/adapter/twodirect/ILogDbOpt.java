package com.wxt.designpattern.adapter.twodirect;

import java.util.List;

/*********************************
 * @author weixiaotao1992@163.com
 * @date 2018/10/21 11:02
 * QQ:1021061446
 *
 *********************************/
public interface ILogDbOpt {
    /**
     * 新增日志
     * @param lm 需要新增的日志对象
     */
    void createLog(LogEntity lm);
    /**
     * 修改日志
     * @param lm 需要修改的日志对象
     */
    void updateLog(LogEntity lm);
    /**
     * 删除日志
     * @param lm 需要删除的日志对象
     */
    void removeLog(LogEntity lm);
    /**
     * 获取所有的日志
     * @return 所有的日志对象
     */
    List<LogEntity> getAllLog();

    public void removeAll();
}
