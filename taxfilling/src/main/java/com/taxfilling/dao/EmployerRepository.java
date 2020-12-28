package com.taxfilling.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxfilling.entity.Employer;
@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {

}
