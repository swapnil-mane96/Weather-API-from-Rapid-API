package com.weather.service;

import com.weather.exception.ApiLimitExceedException;

/**
 * @author Swapnil Mane
 */
public interface WeatherService {
	
	Object getForecastSummary()throws ApiLimitExceedException;
	
	Object getHourlyForecast() throws ApiLimitExceedException;
}
