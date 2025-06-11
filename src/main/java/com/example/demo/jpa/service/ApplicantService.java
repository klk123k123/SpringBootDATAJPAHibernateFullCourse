package com.example.demo.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jpa.Repository.ApplicantRepository;
import com.example.demo.jpa.entity.Applicant;
import com.example.demo.jpa.entity.Resume;

@Service
public class ApplicantService {
	
	@Autowired
	ApplicantRepository repository;
	

	public List<Applicant> getAllApplicants()
	{
		//Iterable<Applicant> all=repository.findAll();
		//List<Applicant>list=new ArrayList<Applicant>();
		//all.forEach(list::add);
		return (List<Applicant>) repository.findAll();
		
	}
	public Applicant saveList(Applicant obj)
	{
		Resume resume=obj.getResume();
		if(resume!=null)
		resume.setApplicant(obj);
		return repository.save(obj);
	}
}
