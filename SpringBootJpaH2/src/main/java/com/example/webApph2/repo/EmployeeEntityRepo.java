package com.example.webApph2.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.webApph2.entity.EmployeeEntity;

@Repository
public interface EmployeeEntityRepo extends CrudRepository<EmployeeEntity, Integer>{

}
