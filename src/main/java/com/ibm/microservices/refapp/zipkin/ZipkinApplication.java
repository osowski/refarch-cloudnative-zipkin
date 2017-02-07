package com.ibm.microservices.refapp.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@EnableDiscoveryClient
public class ZipkinApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZipkinApplication.class, args);
		System.out.println("Running "+ZipkinApplication.class+" via Spring Boot!");
	}

}
