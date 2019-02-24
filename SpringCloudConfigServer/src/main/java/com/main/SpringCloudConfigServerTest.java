package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerTest {

	public static void main(String[] args) {
	 SpringApplication.run(SpringCloudConfigServerTest.class, args);		
	}



}
