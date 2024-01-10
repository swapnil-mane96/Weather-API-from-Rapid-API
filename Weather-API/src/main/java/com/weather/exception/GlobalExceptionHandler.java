package com.weather.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * This class is used to handle all exceptions in the project
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	/**
	 * This method used to handle exceptions
	 * if you have exceeded the DAILY quota for Requests
	 *
	 */
	@ExceptionHandler(ApiLimitExceedException.class)
	public ResponseEntity<ExceptionalMessage> apiLimitExceedException (ApiLimitExceedException apiLimitExceedException){
		String errMessage = apiLimitExceedException.getMessage();
		return new ResponseEntity<ExceptionalMessage>(new ExceptionalMessage(errMessage,LocalDateTime.now(),false), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
