package com.example.quartz;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Classname TimingTaskSchedule
 * @Description TODO
 * @Date 19-11-2 下午1:11
 * @Created by xns
 */
public class TimingTaskSchedule implements ServletContextListener {

    /**
     * 服务器启动时执行该事件
     * @param arg0
     */
    @Override
    public void contextInitialized(ServletContextEvent arg0){
        try{
            QuartzLoad.run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 服务器停止时执行该事件
     * @param arg0
     */
    @Override
    public void contextDestroyed(ServletContextEvent arg0){
        try{
            QuartzLoad.stop();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
