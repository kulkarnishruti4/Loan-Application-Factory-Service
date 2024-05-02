package com.object.of.varying.prototye.factory.impl;

import com.object.of.varying.prototye.entity.Loan;

public class CarLoan implements Loan{

	
	private static final float rateOfInterest = 12;

	@Override
	public double calculateInterest(double principal, double time) {

		return (principal*time*rateOfInterest)/100;
	
	}
	
	
	
	
}
