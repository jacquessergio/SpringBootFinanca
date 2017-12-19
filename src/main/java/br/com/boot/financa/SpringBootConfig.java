package br.com.boot.financa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class SpringBootConfig {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootConfig.class, args);
	}
	
}

