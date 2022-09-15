package com.huang.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitDemoApplication.class, args);
        System.out.println("hello,git");
        System.out.println("hello,git!");
        System.out.println("hello,git!123");
        System.out.println("hello,git!master");
    }

}
