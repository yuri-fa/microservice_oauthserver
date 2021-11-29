package br.com.yuri.microservice.oathserver;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class OathserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(OathserverApplication.class, args);
	}
	
	@GetMapping(path = "/user")
	public Principal principal(Principal user) {
		return user;
	}

}
