package com.sapient.College.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.College.model.College;
import com.sapient.College.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@PostMapping(path = "/colleges", consumes = "application/json", produces = "application/json")
	public void addCollege(@RequestBody College college) {
		collegeService.addCollege(college);
	}
	
	@GetMapping(path = "/colleges/{collegeId}")
	public College getCollege(@PathVariable String collegeId){	
		return collegeService.getCollege(collegeId).get();
	}
	
	@GetMapping(path = "/colleges")
	public List<College> getAllColleges(){			
		return collegeService.getAllColleges();
	}
}
