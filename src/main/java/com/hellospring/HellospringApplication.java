package com.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HellospringApplication extends SpringBootServletInitializer {

	// 書き換えました。
	public static void main(String[] args) {
		SpringApplication.run(HellospringApplication.class, args);
	}
}
