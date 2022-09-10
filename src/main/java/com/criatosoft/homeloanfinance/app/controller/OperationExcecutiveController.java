package com.criatosoft.homeloanfinance.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criatosoft.homeloanfinance.app.entity.CibilCheck;
import com.criatosoft.homeloanfinance.app.service.OperationExcecutiveService;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api")
public class OperationExcecutiveController {
	@Autowired
	OperationExcecutiveService oes;
	
	@PostMapping(value = "/saveCibilDetails")
	public ResponseEntity<CibilCheck> saveCibilDetails(@RequestBody CibilCheck ccheck) {
		if(ccheck.getCibilId()==0) {
			return new ResponseEntity<CibilCheck>(HttpStatus.BAD_REQUEST);
		}
		else {
			CibilCheck cc=oes.saveCibilDetails(ccheck);
			return new ResponseEntity<CibilCheck>(cc,HttpStatus.CREATED);
		}
		
	}
	
	@GetMapping(value = "/getCibilDetails")
	public ResponseEntity<List<CibilCheck>> getCibilDetails(){
		List<CibilCheck> cibillist=oes.getCibilDetails();
		return new ResponseEntity<List<CibilCheck>>(cibillist,HttpStatus.OK);
	}

}
