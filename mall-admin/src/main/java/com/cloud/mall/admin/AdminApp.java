package com.cloud.mall.admin;

import com.netflix.discovery.EurekaClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

//EurekaDiscoveryClientConfiguration.class
@SpringBootApplication
//@EnableEurekaClient
public class AdminApp {

    public static void main(String[] args) {
        /*AtomicInteger counter = new AtomicInteger(0);
        ExecutorService executorService  = new ThreadPoolExecutor(2, 4, 5,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(4), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                String threadName = "cloud-mall-task-"+ new Random().nextInt(4);
                System.out.println(threadName);
                return new Thread(r,threadName);
            }
        });
        for(int i=0;i<8;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    int value = counter.incrementAndGet();
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(value);
                }
            });

        }*/
        SpringApplication.run(AdminApp.class);
    }
}
