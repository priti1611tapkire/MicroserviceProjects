package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{
 
	List<Student> findByUnameAndPass(String uname, String pass);
	
}