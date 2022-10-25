package com.ilia.digital.folhadepontoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("healthchecker")
@SpringBootApplication
public class FolhadepontoapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhadepontoapplicationApplication.class, args);
	}

}
