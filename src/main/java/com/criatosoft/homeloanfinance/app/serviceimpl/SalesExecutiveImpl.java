package com.criatosoft.homeloanfinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criatosoft.homeloanfinance.app.entity.EnquiryDetails;
import com.criatosoft.homeloanfinance.app.repository.SalesExecutiveRepository;
import com.criatosoft.homeloanfinance.app.service.SalesExecutiveService;
@Service
public class SalesExecutiveImpl implements SalesExecutiveService{
	@Autowired
	SalesExecutiveRepository ser;

	@Override
	public EnquiryDetails saveEnquiry(EnquiryDetails eDetails) {
		
		return ser.save(eDetails) ;
	}

	@Override
	public List<EnquiryDetails> getEnquiry() {
		
		return ser.findAll();
	}

}
