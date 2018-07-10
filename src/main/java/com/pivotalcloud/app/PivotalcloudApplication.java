package com.pivotalcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class PivotalcloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(PivotalcloudApplication.class, args);
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "welcome Chaitanya to pivotal cloud";
	}
	
}
