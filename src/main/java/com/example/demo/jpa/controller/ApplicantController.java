package com.example.demo.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.entity.Applicant;
import com.example.demo.jpa.service.ApplicantService;

@RestController
@RequestMapping("/Applicant")
public class ApplicantController {
	
	@Autowired
	ApplicantService  service;
	
	@GetMapping("/get")
	public List<Applicant> getAll()
	{
		return service.getAllApplicants();
	}
	
	@PostMapping("/post")
	public Applicant saveApplication(@RequestBody Applicant applicants)
	{
		return service.saveList(applicants);
	}
/*	{
	    "name":"lenin",
	    "emailId":"lenin@gmail.com",
	    "phonNo":98765432,
	    "status":"Active"
	}*/
}
