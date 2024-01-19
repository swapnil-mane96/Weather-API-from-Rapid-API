package com.weather.exception;

/**
 * @author Swapnil Mane
 */
public class BadCredentialException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 82384025480300391L;

	public BadCredentialException(String message) {
		super(message);
	}
}
