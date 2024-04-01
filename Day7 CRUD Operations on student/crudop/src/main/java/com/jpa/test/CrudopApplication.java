package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.hibernate.type.UserComponentType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.StudentRepo;
import com.jpa.test.entities.Student;

@SpringBootApplication
public class CrudopApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(CrudopApplication.class, args);
		StudentRepo studentRepo= context.getBean(StudentRepo.class);
		
		//Creating students
//		Student student1=new Student();
//		student1.setName("Riya");
//		student1.setAddress("Bangalore");
//		student1.setStatus("Python Programmer");
//		
//		Student student2=new Student();
//		student2.setName("Jay");
//		student2.setAddress("Lucknow");
//		student2.setStatus("Java Programmer");
//		
//		List<Student> students=List.of(student1,student2);
//		Iterable<Student> res= studentRepo.saveAll(students);
//		res.forEach(student->{
//			System.out.println(student);
//		});
//		System.out.println("Done");
		
		
		//Update student
//		Optional<Student> optional= studentRepo.findById(2);
//		Student student=optional.get();
//		student.setName("Ricky");
//		student.setStatus("C Programmer");
//		Student res=studentRepo.save(student);
//		System.out.println(res);
		
		
		//Get students
//		Iterable<Student> itr=studentRepo.findAll();
//		itr.forEach(student->{
//			System.out.println(student);
//		});
		
		
		//Delete student
//		studentRepo.deleteById(53);
//		System.out.println("deleted");
//		Iterable<Student> itr=studentRepo.findAll();
//		itr.forEach(student->{
//			System.out.println(student);
//		});
		
		//Delete all students
//		Iterable<Student> allstu=studentRepo.findAll();
//		allstu.forEach(student->{
//			System.out.println(student);
//		});
//		studentRepo.deleteAll(allstu);
	}

	    
		
}
