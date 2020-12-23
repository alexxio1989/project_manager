package com.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.ws")
public class RunApplication {
	
   public static void main(String[] args) {
      SpringApplication.run(RunApplication.class, args);
   }
   
   @Bean
   public RestTemplate getRestTemplate() {
	   return new RestTemplate();
   }
}
