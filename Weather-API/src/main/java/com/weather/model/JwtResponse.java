package com.weather.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Swapnil Mane
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JwtResponse {
	private String jwtToken;
	private String username;
}
