package com.irdaislakhuafa.tasksceduler.scedullers;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class FirstTaskSceduller {
    /*
     * peraturan
     * 1. method wajib void/tidak memiliki return
     * 2. method tidak boleh memiliki parameter
     */

    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("DD MMMM YYYY | HH:mm:ss");

    @Scheduled(fixedDelay = (1 * 1000))
    public void myName() {
        System.out.println("Irda Islakhu Afa => " + dateFormatter.format(System.currentTimeMillis()));
    }

}
