package com.spring.setter;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	public static void main (String []args) {
		//create the IoCContainer
		ApplicationContext context= new AnnotationConfigApplicationContext("com.spring");
		
		String[] beanNames=context.getBeanDefinitionNames();
		Stream.of(beanNames).forEach(System.out::println);
		//Employee employee=(Employee) context.getBean("employee");
		//System.out.println(employee);
		Employee employee1=context.getBean("employee",Employee.class);
		System.out.println(employee1);
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
	}
	

}
