package com.uniacademia.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
@EnableCaching
public class App {
	
	public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
	
//	@GetMapping("/")
//	public ModelAndView index() {
//		return new ModelAndView("index");
//	}
	
	@GetMapping("/")
	public String hello() {
		return "Hello";
	}
	
}
