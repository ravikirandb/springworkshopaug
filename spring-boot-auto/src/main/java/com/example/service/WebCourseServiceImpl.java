package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class WebCourseServiceImpl implements ICourseService {
	
	@Override
	public List<String> showCourses() {
		return Arrays.asList("HTML","CSS","JavaScript");
	}
}
