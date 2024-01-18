package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer> {
	
	@Query(value = "select s.slname from Student s where s.sid=:id")
	public String findBySid(@Param("id") int  s);
	
	@Query(value = "select s.slname from Student s where s.sid=:id")
	public String findByStudentslnameSid(@Param("id") int  s);
	
	@Query("from Student")
	List<Student> getAllData();
	
	@Query(value = "select * from Student s where s.sid=:id", nativeQuery = true)
	String dataByid(@Param("id")int s);
	
	@Query(value = "select * from Student s where s.sname=:name", nativeQuery = true)
	String dataByname(@Param("name")String name);
	
}
