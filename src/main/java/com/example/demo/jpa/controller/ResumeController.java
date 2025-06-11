package com.example.demo.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Repository.ResumeRepository;
import com.example.demo.jpa.entity.Resume;
import com.example.demo.jpa.service.ResumeService;

@RestController
@RequestMapping("/api")
public class ResumeController 
{
	@Autowired
	ResumeService  resumeService;
	
	@PostMapping("/{applicantId}/resume")
	public ResponseEntity<Resume> saveResume(@PathVariable(name="applicantId") int id,@RequestBody Resume resume)
	{
		return ResponseEntity.ok(resumeService.addResume(id, resume));
		
	}
	
	@GetMapping("/resume/get")
	public ResponseEntity<List<Resume>> getesume()
	{
		return ResponseEntity.ok(resumeService.getResume());
		
	}

}
