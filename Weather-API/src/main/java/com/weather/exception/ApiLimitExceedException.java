package com.weather.exception;

public class ApiLimitExceedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ApiLimitExceedException(String message) {
		super(message);
	}

}
