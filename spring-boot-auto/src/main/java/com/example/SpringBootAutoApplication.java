package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.payment.IPaymentProcessor;
import com.example.service.ICourseService;


@SpringBootApplication
public class SpringBootAutoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutoApplication.class, args);
	}
	
	@Autowired
	// by type
	@Qualifier("webCourseServiceImpl")
	private ICourseService courseService;  //= new WebCourseServiceImpl();
	
	@Autowired
    // by name  - if the bean name and the instance variable name are same
	private ICourseService cloudCourseServiceImpl;  // = new CloudCourseServiceImpl();
	
	// by constructor
	private ICourseService backendCourse;
	public SpringBootAutoApplication(@Qualifier("backendCourseServiceImpl") ICourseService backendCourse) {
		super();
		this.backendCourse = backendCourse;
	}
	
	@Autowired 
	@Qualifier("netPay")
	private IPaymentProcessor paymentProcessor;



	@Override
	public void run(String... args) throws Exception {
		courseService.showCourses().forEach(System.out::println);
		cloudCourseServiceImpl.showCourses().forEach(System.out::println);
		backendCourse.showCourses().forEach(System.out::println);
		System.out.println();
		paymentProcessor.payBill();
		
		
	}

}
