package com.example.demo.drepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Department;

@Repository
public interface HomeRepositoryD extends CrudRepository<Department, Integer>{

	
}
