package com.AccountInformation.AccountInformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class AccountInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountInformationApplication.class, args);
	}

}
