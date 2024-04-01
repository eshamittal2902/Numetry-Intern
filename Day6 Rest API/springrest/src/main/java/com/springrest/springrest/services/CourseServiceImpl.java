package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(120,"Java Core","It contains basics of java"));
		list.add(new Course(220,"Spring Boot","Creating rest api"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==course.getId()) {
				list.set(i, course);
				break;
			}
		}
		return course;
	}

	@Override
	public Course deleteCourse(long courseId) {
		list.removeIf(course -> course.getId()==courseId);
		return null;
	}
	
	

	

}
