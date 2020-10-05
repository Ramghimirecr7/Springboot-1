package com.example.Springbootudacity1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringbootUdacity1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUdacity1Application.class, args);
	}

}
