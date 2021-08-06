package com.practice.ho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class HoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
	}

}
