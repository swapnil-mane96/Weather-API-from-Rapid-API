package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.service.WeatherService;

/**
 * @author Swapnil Mane
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {
	@Autowired
	WeatherService weatherService;
	
	@GetMapping("/forecastSummaryByLocationName")
	public ResponseEntity<?> getForecastSummaryByLocationName(){
		return ResponseEntity.ok(this.weatherService.getForecastSummary());
	}
	
	
	
}
