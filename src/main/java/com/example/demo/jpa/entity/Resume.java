package com.example.demo.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String content;
	
	@OneToOne
	@JoinColumn(name="applicantiD",nullable = false)
	@JsonIgnore //will use for getting only unique data not infity
	private Applicant applicant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Resume [id=" + id + ", content=" + content + ", applicant=" + applicant + "]";
	}

}
