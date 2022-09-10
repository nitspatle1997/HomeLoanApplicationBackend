package com.criatosoft.homeloanfinance.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criatosoft.homeloanfinance.app.entity.EnquiryDetails;
import com.criatosoft.homeloanfinance.app.service.SalesExecutiveService;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api")
public class SalesExecutiveController {
	@Autowired
	SalesExecutiveService ses;
	
	@PostMapping(value = "/saveEnquiry")
	public ResponseEntity<EnquiryDetails>  saveEnquiry(@Valid @RequestBody EnquiryDetails EDetails){
		
		if(EDetails.getCid()!=0) {
			return new ResponseEntity<EnquiryDetails>(HttpStatus.BAD_REQUEST);
		}
		else {
		EnquiryDetails ed=ses.saveEnquiry(EDetails);
		return new ResponseEntity<EnquiryDetails>(ed,HttpStatus.CREATED);
		}
	}
	
	@GetMapping(value = "/getEnquiry")
	public ResponseEntity<List<EnquiryDetails>> getEnquiry(){
		List<EnquiryDetails> list=ses.getEnquiry();
		
		if(list.isEmpty()) {
			return new ResponseEntity<List<EnquiryDetails>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EnquiryDetails>>(list, HttpStatus.OK);
	}
}


