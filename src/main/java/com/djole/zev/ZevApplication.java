package com.djole.zev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ZevApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZevApplication.class, args);
	}

}
