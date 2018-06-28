package com.thinkxfactor.zomatoplus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thinkxfactor.zomatoplus.models.User;

@SpringBootApplication
@ComponentScan("com.thinkxfactor")
@EnableJpaRepositories(basePackages = "com.thinkxfactor")
@EntityScan("com.thinkxfactor")  
public class ZomatoplusApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZomatoplusApplication.class);
	}
	
	
}

/*@GetMapping("/create")
public User create(@RequestParam(value="username") String username,@RequestParam(value="password") String password) {
	User user1=new User(username,password);
	return user1;
}*/