package com.test.job;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

public class QuartzsJob {

    public void run(){
        System.out.println("running");
    }
}
