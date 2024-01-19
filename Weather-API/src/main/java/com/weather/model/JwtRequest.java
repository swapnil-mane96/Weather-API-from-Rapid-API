package com.weather.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Swapnil Mane
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JwtRequest {
	private String email;
	private String password;
}
