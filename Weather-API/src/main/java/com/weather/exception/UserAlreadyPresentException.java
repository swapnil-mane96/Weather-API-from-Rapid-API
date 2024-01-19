package com.weather.exception;

/**
 * @author Swapnil Mane
 */
public class UserAlreadyPresentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7603668849247111390L;
	
	public UserAlreadyPresentException(String message) {
		super(message);
	}
}
