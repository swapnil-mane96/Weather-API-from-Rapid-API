package com.weather.exception;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Swapnil Mane
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionalMessage {
	private String error;
	private LocalDateTime dateTime;
	private Boolean status;
}
