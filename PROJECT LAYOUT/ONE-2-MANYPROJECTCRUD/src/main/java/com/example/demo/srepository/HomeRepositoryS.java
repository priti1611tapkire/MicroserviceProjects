package com.example.demo.srepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface HomeRepositoryS extends CrudRepository<Student, Integer> {

}
