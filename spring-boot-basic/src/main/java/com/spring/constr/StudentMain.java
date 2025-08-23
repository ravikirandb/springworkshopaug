package com.spring.constr;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the IoCContainer
				ApplicationContext context= new AnnotationConfigApplicationContext("com.spring");
				
				String[] beanNames=context.getBeanDefinitionNames();
				Stream.of(beanNames).forEach(System.out::println);
				//Employee employee=(Employee) context.getBean("employee");
				//System.out.println(employee);
				Student student=context.getBean("student",Student.class);
				System.out.println(student);
				
	}

}
