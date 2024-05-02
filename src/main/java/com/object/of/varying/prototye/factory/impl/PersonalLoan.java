package com.object.of.varying.prototye.factory.impl;

import com.object.of.varying.prototye.entity.Loan;

public class PersonalLoan implements Loan {
	
	
	private static final float rateOfInterest = 10;

	@Override
	public double calculateInterest(double principal, double time) {

		return (principal*time*rateOfInterest)/100;
	
	}

	
}
