package com.example.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Classname QuartzLoad
 * @Description TODO
 * @Date 19-11-2 下午1:00
 * @Created by xns
 */
public class QuartzLoad {
    private static Scheduler sched;
    public static void run() throws Exception{
        System.out.println("启动定时任务!");
        SchedulerFactory sfact = new StdSchedulerFactory();
        sched = sfact.getScheduler();

        JobDetail jobDetail = JobBuilder.newJob((Class<? extends Job>) TestJob.class).withIdentity("myjob1","group1").build();

        CronTrigger trigger1 = (CronTrigger) TriggerBuilder.newTrigger()
                .withIdentity("tigger1","group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0 8 ? * MON"))
                .build();
        sched.scheduleJob(jobDetail,trigger1);
        sched.start();
    }

    /**
     * 停止
     * @throws Exception
     */
    public static void stop() throws Exception{
        sched.shutdown();
    }
}
