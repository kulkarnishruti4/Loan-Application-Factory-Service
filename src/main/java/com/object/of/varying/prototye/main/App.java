package com.object.of.varying.prototye.main;

import com.object.of.varying.prototye.entity.Loan;
import com.object.of.varying.prototye.factory.LoanFactory;
import com.object.of.varying.prototye.factory.impl.LoanType;

public class App {
	
	
	public static void main(String[] args) {
		
		
		Loan myLoan = LoanFactory.getLoan(LoanType.HOME);
		
		System.out.println(myLoan.calculateInterest(1000, 12));
		
		
		
		Loan anotherLoan = LoanFactory.getLoan(LoanType.CAR);
		
		System.out.println(anotherLoan.calculateInterest(1000, 12));
		
	}
	
	
	

}
