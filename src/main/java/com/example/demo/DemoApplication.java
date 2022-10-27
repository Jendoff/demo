package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Value("${tea}")
	private String testText;

	@Autowired
	TestClass testClass;

	public static void main(String[] args) {
		System.out.println("Hello world 2");
		SpringApplication.run(DemoApplication.class, args);
	}

	//@Bean
	//public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
	//	return new PropertySourcesPlaceholderConfigurer();
	//}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world 3");
		testClass.getTea();
		System.out.println("My tea is also " + testText);
	}
}
