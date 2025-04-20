package com.scheduler.shedlock.service;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SchedulerService {
    @Scheduled(fixedRate = 10000) // 2 seconds
    @SchedulerLock(name = "testTask", lockAtMostFor = "5m", lockAtLeastFor = "2s")
    public void executeTask() {
            System.out.println("Executing task at: " + new Date());
    }
}