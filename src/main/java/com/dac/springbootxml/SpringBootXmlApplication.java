package com.dac.springbootxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringBootXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootXmlApplication.class, args);
        //ApplicationContext context = new ClassPathXmlApplicationContext("/");
    }

}
