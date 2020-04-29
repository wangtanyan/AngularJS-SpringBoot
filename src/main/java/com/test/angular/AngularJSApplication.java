package com.test.angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title AngularJSApplication
 * @Description
 * @Author WT
 * @Version 1.0.0
 * @Date 2020-04-28 11:31
 */
@SpringBootApplication(scanBasePackages = "com.test.angular")
public class AngularJSApplication {
    public static void main(String[] args) {
        SpringApplication.run(AngularJSApplication.class, args);
    }
}
