package com.omiya.takeshi.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.omiya.takeshi")
@EnableFeignClients
@EnableMongoRepositories(basePackages = {"com.omiya.takeshi.storage.adapter.repository", "com.omiya.takeshi.storage.port"})
public class 	TakeshiStorageApplication {
	public static void main(String[] args) {
		SpringApplication.run(TakeshiStorageApplication.class, args);
	}

}
