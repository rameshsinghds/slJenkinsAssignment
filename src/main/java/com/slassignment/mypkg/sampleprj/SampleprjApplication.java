package com.slassignment.mypkg.sampleprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class SampleprjApplication {

	@RequestMapping(value="/")
	public String index() {
		return "<h1>Hello From New App</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleprjApplication.class, args);
	}

}

