package com.criatosoft.homeloanfinance.app.service;

import java.util.List;

import com.criatosoft.homeloanfinance.app.entity.CibilCheck;

public interface OperationExcecutiveService {

	public CibilCheck saveCibilDetails(CibilCheck ccheck);

	public List<CibilCheck> getCibilDetails();

}
