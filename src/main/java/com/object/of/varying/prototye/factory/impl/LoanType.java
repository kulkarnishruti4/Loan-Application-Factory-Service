package com.object.of.varying.prototye.factory.impl;

import java.util.function.Supplier;

import com.object.of.varying.prototye.entity.Loan;

public enum LoanType {
	
		
	HOME(HomeLoan::new),
	CAR(CarLoan::new),
	PERSONAL(PersonalLoan::new);
	

	private Supplier<Loan> constructor;

	private LoanType(Supplier<Loan> constructor) {
		this.constructor = constructor;
	}

	public Supplier<Loan> getConstructor() {
		return constructor;
	}

	public void setConstructor(Supplier<Loan> constructor) {
		this.constructor = constructor;
	}
	
	
	
}
