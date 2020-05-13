package com.cg.dd.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.cg.dd"})
@SpringBootApplication
public class RawMaterialMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RawMaterialMsApplication.class, args);
	}

}
