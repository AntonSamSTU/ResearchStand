package com.example.WebAppLabsSamGTU;

import com.example.WebAppLabsSamGTU.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WebAppLabsSamGtuApplication {


	public static void main(String[] args) {
		//SpringApplication.run(WebAppLabsSamGtuApplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(WebAppLabsSamGtuApplication.class);

		builder.headless(false);

		ConfigurableApplicationContext context = builder.run(args);
	}
}
