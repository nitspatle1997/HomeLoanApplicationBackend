package com.criatosoft.homeloanfinance.app.service;

import java.util.List;

import com.criatosoft.homeloanfinance.app.entity.EnquiryDetails;

public interface SalesExecutiveService {

	public EnquiryDetails saveEnquiry(EnquiryDetails eDetails);

	public List<EnquiryDetails> getEnquiry();

}
