package com.training.exception;

public class RangeCheckException extends Exception {

	
	private long bookNumber;
	
	public RangeCheckException() {
		super();
		this.bookNumber=bookNumber;
	}
	

	public RangeCheckException(long bookNumber) {
		super();
		this.bookNumber = bookNumber;
	}


	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "HELLLLL";
	}
	
	
}
