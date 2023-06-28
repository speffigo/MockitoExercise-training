package com.springboot.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.details.Details;
import com.springboot.restapi.services.GeneralDetails;

@RestController
public class StudentController {

	@Autowired
	private GeneralDetails generaldetails;

	@GetMapping("/data")
	public List<Details> retrievedetails() {

		return this.generaldetails.getDetails();
	}

	@PostMapping("/add")
	public List<Details> createdetails(@RequestBody Details detail) {
		return this.generaldetails.addDetail(detail);
	}

	@PutMapping("/update")
	public Details updateDetail(@RequestBody Details detail) {
		return this.generaldetails.updateDetail(detail);
	}

}
