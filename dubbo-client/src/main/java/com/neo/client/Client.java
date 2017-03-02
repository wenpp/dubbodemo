package com.neo.client;

import com.neo.service.LoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenpeng on 2017/2/23.
 */
public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        context.start();


        LoginService loginService = (LoginService)context.getBean("loginService");
        String ss = loginService.login();

        System.out.println(ss);
    }
}
