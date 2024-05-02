package com.object.of.varying.prototye.factory;

import com.object.of.varying.prototye.entity.Loan;
import com.object.of.varying.prototye.factory.impl.LoanType;

public class LoanFactory {
	
	
	
	public static Loan getLoan(LoanType loanType) {
		return loanType.getConstructor().get();
	}

}
