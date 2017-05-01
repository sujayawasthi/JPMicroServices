package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;

import com.example.messaging.OperatingStatementChannels;

@EnableBinding(OperatingStatementChannels.class)
@SpringBootApplication
@EnableDiscoveryClient
public class OperatingStatementSpreadingServiceApplication {

	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}

	public static void main(String[] args) {
		SpringApplication.run(OperatingStatementSpreadingServiceApplication.class, args);
	}
}
