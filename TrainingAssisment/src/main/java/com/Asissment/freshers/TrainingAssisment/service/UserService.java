package com.Asissment.freshers.TrainingAssisment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Asissment.freshers.TrainingAssisment.model.UserModel;
import com.Asissment.freshers.TrainingAssisment.repository.EmployeeRepo;

@Service
public class UserService {

	@Autowired
	private EmployeeRepo empRepo;

	public String createUser(String name, String department, String manager, int age,long salary) {
		UserModel user = new UserModel(name,department,manager,age,salary);
		empRepo.save(user);
		return ("New user created with ID: " + user.getId());
	}

	public List<UserModel> listUsers() {
		return empRepo.findAll();
	}

	public void deleteAllUsers() {
		empRepo.deleteAll();
	}

	public String deleteUserById(String id) {
		empRepo.deleteById(id);
		return id;
	}
	
	public Optional<UserModel> findUserById(String id){
		return empRepo.findById(id);
	}

	public String updateUserOnce(String id, UserModel user) {
		
		Optional<UserModel> u=empRepo.findById(id);
		UserModel userMine=u.get();
		
		userMine.setName(user.getName());
		userMine.setDepartment(user.getDepartment());
		userMine.setAge(user.getAge());
		userMine.setManager(user.getManager());
		userMine.setSalary(user.getSalary());
		
		empRepo.save(userMine);
		
		
		return "The Update Operation has been completed.";
	}

}
