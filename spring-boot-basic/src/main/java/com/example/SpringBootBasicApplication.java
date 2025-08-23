package com.example;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.constr.Student;
import com.spring.setter.Employee;

@SpringBootApplication(scanBasePackages = {"com.example","com.spring"})
public class SpringBootBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
		
	}
	
	//@Autowired
	//private ApplicationContext context; 
	
	@Autowired
	private Employee employee;
	
	@Autowired
	private Student student;
	
	@Override
	public void run(String... args) throws Exception {
	//String[] beanNames=context.getBeanDefinitionNames();
	//Stream.of(beanNames).forEach(System.out::println);
		System.out.println(employee);
		System.out.println(student);
}
}
