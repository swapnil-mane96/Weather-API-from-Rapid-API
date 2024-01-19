package com.weather.exception;

/**
 * @author Swapnil Mane
 */
public class UserNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6705646296731004323L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
