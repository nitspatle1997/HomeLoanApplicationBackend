package com.criatosoft.homeloanfinance.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criatosoft.homeloanfinance.app.entity.CibilCheck;

@Repository
public interface OperationExcecutiveRepository extends JpaRepository<CibilCheck, Integer> {

}
