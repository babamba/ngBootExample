package com.ngBoot.userportal;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEncryptableProperties
@SpringBootApplication
public class UserPortalApplication {

	public static void main(String[] args) {
		System.setProperty("jasypt.encryptor.password", "jw");
		SpringApplication.run(UserPortalApplication.class, args);
	}
}