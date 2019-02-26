package com.client;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/rest")
public class SpringCloudConfigServerClient {

	@Value("${driverClassName}")
	String driverClassName;
	
	@Value("${username}")
	String userName;
	
	@Value("${password}")
	String password;
	
	@Value("${db}")
	String db;
	
	@RequestMapping(value="/db" , method=RequestMethod.GET)
	public String getDbDetails(){
		Map<String, String> dbDetailsMap = new HashMap<>();
		System.out.println("Drive name is :"+ driverClassName);
		dbDetailsMap.put("driverClassName",driverClassName);
		dbDetailsMap.put("userName",userName);
		dbDetailsMap.put("password",password);
		dbDetailsMap.put("db",db);
		return dbDetailsMap.toString();
		
		
	}
	
}
