package com.taxfilling.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxfilling.entity.Representative;
@Repository
public interface Representativerepository extends JpaRepository<Representative, Long>{

}
