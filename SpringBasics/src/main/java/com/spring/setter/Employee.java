package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {
	
	private String employeeName;
	private int employeeId;
	
	@Autowired
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	@Value("${employee.employeeName}")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	@Value("${employee.employeeId}")
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", address=" + address + "]";
	}
	

}
