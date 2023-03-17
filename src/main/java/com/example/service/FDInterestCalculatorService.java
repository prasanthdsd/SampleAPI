package com.example.service;

import com.example.domain.Bank;
import com.example.domain.Employee;
import com.example.domain.FDRequest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FDInterestCalculatorService {
	
	private static List<Bank> loadBanks()
	{
		List<Bank> bankObj = new ArrayList<Bank>();
		//bankObj.add(new Bank("ICICI",11, "Bangalore"));
		//bankObj.add(new Bank("HDFC",12, "Hyderabad"));
		//bankObj.add(new Bank("SBI",13, "Chennai"));
		
		return bankObj;
	}
	private List<Bank> banks = loadBanks();

    public FDRequest calculateInterest(String bank, Integer durationInYear) {

        FDRequest fdRequest = new FDRequest(bank, durationInYear);
        fdRequest.setFdInterestRate("10%");
        return fdRequest;
    }

//	public Bank bankDetails() {
//		
//		Bank bank = new Bank("ICICI",11, "Bangalore",new Employee("abc", null, 0));
//		
//		return bank;
//	}

	public Bank addBankDetail(Bank bank1) {
		// TODO Auto-generated method stub
		banks.add(bank1);
		return bank1;
		
	}
}
/// 