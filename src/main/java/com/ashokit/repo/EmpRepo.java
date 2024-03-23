package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
