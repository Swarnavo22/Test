package com.internity.certificateGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication	//(scanBasePackages="com.internity.certificateGenerator")
//@ComponentScan({"com.internity.certificateGenerator"})
public class CertificateGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificateGeneratorApplication.class, args);
//		new SpringApplicationBuilder(CertificateGeneratorApplication.class)
//		.registerShutdownHook(true)
//		.run(args);
//		 new SpringApplication(CertificateGeneratorApplication.class).run(args);
		System.out.println("Hello boot");
	}

}
