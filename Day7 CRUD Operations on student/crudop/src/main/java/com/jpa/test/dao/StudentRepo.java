package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
