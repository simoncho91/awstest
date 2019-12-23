package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class AwsBoardTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsBoardTestApplication.class, args);
		System.out.println("세팅 완료");
	}

}
