package com.example.demo.jpa.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.jpa.entity.Applicant;
@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Integer> {

}
