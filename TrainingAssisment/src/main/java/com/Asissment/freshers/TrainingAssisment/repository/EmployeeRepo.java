package com.Asissment.freshers.TrainingAssisment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Asissment.freshers.TrainingAssisment.model.UserModel;

@Repository
public interface EmployeeRepo extends MongoRepository<UserModel, String> {

}
