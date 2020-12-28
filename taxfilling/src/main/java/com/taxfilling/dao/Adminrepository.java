package com.taxfilling.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxfilling.entity.Admin;
@Repository
public interface Adminrepository extends JpaRepository<Admin, Long> {

}
