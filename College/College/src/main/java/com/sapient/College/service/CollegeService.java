package com.sapient.College.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.College.model.College;
import com.sapient.College.repository.CollegeRepository;

@Service
public class CollegeService {
	
	@Autowired
	private CollegeRepository collegeRepository; 
	
	public void addCollege(College collegeid) {
		collegeRepository.save(collegeid);
	}
	
	public Optional<College> getCollege(String collegeId) {
		return collegeRepository.findById(collegeId);
	}
	
	public java.util.List<College> getAllColleges() {
		return collegeRepository.findAll();
	}
}
