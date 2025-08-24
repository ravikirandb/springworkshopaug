package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CloudCourseServiceImpl implements ICourseService {
	
	@Override
	public List<String> showCourses() {
		return Arrays.asList("AWS","GoogleCloud","Microservices");
	}
}
