package com.dubbo.serviceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
