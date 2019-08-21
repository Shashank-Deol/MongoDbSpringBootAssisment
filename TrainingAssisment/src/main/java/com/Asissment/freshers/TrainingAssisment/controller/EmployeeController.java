package com.Asissment.freshers.TrainingAssisment.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Asissment.freshers.TrainingAssisment.model.UserModel;

@RestController
@RequestMapping(value = "/UserModel", method = RequestMethod.GET)
public class EmployeeController {

	@Autowired
	// private com.freshers.trainingApp.service.userService userService;
	private com.Asissment.freshers.TrainingAssisment.service.UserService userService;

	@PostMapping(value = "/add")
	public String createUser(
			/*
			 * @RequestParam("username") String uname,
			 * 
			 * @RequestParam("password") String password,
			 * 
			 * @RequestParam("emailId") String email,
			 * 
			 * @RequestParam("contactNumber")BigInteger contact
			 */
			@RequestParam("username") String name, @RequestParam("department") String department,
			@RequestParam("manager") String manager, @RequestParam("age") int age,
			@RequestParam("salary") long salary) {
		return userService.createUser(name, department, manager, age, salary);
	}

	@DeleteMapping(value = "/deleteUserById/{id}")
	public String deleteUserById(@PathVariable(value = "id") String id) {
		return userService.deleteUserById(id);
	}

	@GetMapping(value = "/deleteAllUsers")
	public void deleteUsersAll() {
		userService.deleteAllUsers();
	}

	@GetMapping("/list")
	public List<?> listUsers() {
		return userService.listUsers();
	}

	@GetMapping(value = "/getUserById/{id}")
	public Optional<UserModel> getUserById(@PathVariable(value = "id") String id) {
		return userService.findUserById(id);
	}
	
	@GetMapping(value="/updateUser/{id}")
	public String updateUser(@PathVariable(value = "id") String id, @RequestParam("username") String name,
			@RequestParam("department") String department, @RequestParam("manager") String manager,
			@RequestParam("age") int age, @RequestParam("salary") long salary) {
		UserModel us = new UserModel(name, department, manager, age, salary);
		return userService.updateUserOnce(id, us);
	}

	/*
	 * public users updateUser(@PathVariable(value="id") String id,@RequestBody
	 * users user) { user.setId(id); (new userRepo()).save(user); return user; }
	 */
}
