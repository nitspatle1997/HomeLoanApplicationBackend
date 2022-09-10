package com.criatosoft.homeloanfinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criatosoft.homeloanfinance.app.entity.CibilCheck;
import com.criatosoft.homeloanfinance.app.repository.OperationExcecutiveRepository;
import com.criatosoft.homeloanfinance.app.service.OperationExcecutiveService;
@Service
public class OperationExcecutiveImpl implements OperationExcecutiveService{
	@Autowired
	OperationExcecutiveRepository oer;

	@Override
	public CibilCheck saveCibilDetails(CibilCheck ccheck) {
		
		return oer.save(ccheck);
	}

	@Override
	public List<CibilCheck> getCibilDetails() {
		
		return oer.findAll();
	}

}
