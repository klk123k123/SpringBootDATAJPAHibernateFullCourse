package com.example.demo.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jpa.Repository.ApplicantRepository;
import com.example.demo.jpa.Repository.ResumeRepository;
import com.example.demo.jpa.entity.Applicant;
import com.example.demo.jpa.entity.Resume;

@Service
public class ResumeService {
	@Autowired
	ApplicantRepository applicantRepository;
	@Autowired
	ResumeRepository   resumeRepository;
	
	public Resume addResume(int applicantId,Resume resume)
	{
		Optional<Applicant> applicantoptional=applicantRepository.findById(applicantId);
		if(applicantoptional.isPresent())
		{
			Applicant applicant=applicantoptional.get();
			resume.setApplicant(applicant);
			return resumeRepository.save(resume);
		}
		else
			throw new RuntimeException("Applicant id not found : "+applicantId);
	}
	
	public List<Resume> getResume()
	{
		return resumeRepository.findAll();
		
	}

}
