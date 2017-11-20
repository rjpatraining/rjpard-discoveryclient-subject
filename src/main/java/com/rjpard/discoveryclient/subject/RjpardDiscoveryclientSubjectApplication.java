package com.rjpard.discoveryclient.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RjpardDiscoveryclientSubjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RjpardDiscoveryclientSubjectApplication.class, args);
	}
}
