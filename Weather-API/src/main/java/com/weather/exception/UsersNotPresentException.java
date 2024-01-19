package com.weather.exception;

/**
 * @author Swapnil Mane
 */
public class UsersNotPresentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6052638184131146263L;
	
	public UsersNotPresentException(String message) {
		super(message);
	}
}
