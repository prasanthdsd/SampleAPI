package com.example.controller;

import com.example.domain.Bank;
import com.example.domain.FDRequest;
import com.example.service.FDInterestCalculatorService;

import lombok.NonNull;

import java.io.Console;
import java.util.List;

import javax.validation.Valid;

import org.checkerframework.common.value.qual.StringVal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FDInterestCalculator {
	
	Logger logger =  LoggerFactory.getLogger(FDInterestCalculator.class);

    private final FDInterestCalculatorService service;

    FDInterestCalculator(FDInterestCalculatorService service) {
        this.service = service;
    }

    @GetMapping(value = "/calculate/fdinterest")
    public ResponseEntity<FDRequest> getQuestions( @RequestParam String bank,
    		@RequestParam Integer durationInYear) {
        if(bank!=null && !bank.equalsIgnoreCase("null") && durationInYear!=null)
        {
        	FDRequest f1= service.calculateInterest(bank, durationInYear);
    	
        	return new ResponseEntity<FDRequest>(f1,HttpStatus.OK);
        }
        else
        {
        	return new ResponseEntity<FDRequest>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @GetMapping("/bank/{bankName}")
    public ResponseEntity<Bank> getCustomerDetails(@Valid @PathVariable("bankName") String bankName)
	{
        logger.info(bankName);
		
			Bank b1 = new Bank();
			b1.setBankName(bankName);
			b1.setBankAddress("Banglore");
			b1.setIntrestRate(10);
			return new ResponseEntity<Bank>(b1,HttpStatus.OK);
		
		
	}
    


}
