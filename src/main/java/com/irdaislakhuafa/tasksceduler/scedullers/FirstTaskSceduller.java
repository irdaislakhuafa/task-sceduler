package com.irdaislakhuafa.tasksceduler.scedullers;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Async;
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

    // will waiting current thread finish before next thread will be execute
    @Scheduled(fixedDelay = (1 * 1000))
    @Async
    public void myName() {
        System.out.println("Irda Islakhu Afa => " + dateFormatter.format(System.currentTimeMillis()));
    }

    // without waiting current thread to execute next thread
    @Scheduled(fixedRate = 1000)
    @Async
    public void sheName() throws Exception {
        Thread.sleep(10000);
        System.out.println("\n(" + Thread.currentThread().getName() + ")" + "Ana Ardani => "
                + dateFormatter.format(System.currentTimeMillis()));

    }

    @Scheduled(initialDelay = (10 * 1000), fixedDelay = (20 * 1000))
    @Async
    public void thisIsInitialMethod() {
        System.out.println("\033\143");
    }

}
