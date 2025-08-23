package com.spring.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Student {
	private String studentName;
	private String city;
	private Department department;
	
	
	// no need to add @Autowired Annotation
	public Student(Department department) {
		super();
		this.department = department;
	}
	public String getStudentName() {
		return studentName;
	}
	
	@Value("${student.name}")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	@Value("${student.city}")
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", department=" + department + "]";
	}
	
}
