package com.example.demo.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.jpa.entity.Resume;
@Repository
public interface ResumeRepository  extends JpaRepository<Resume,Integer>{

}