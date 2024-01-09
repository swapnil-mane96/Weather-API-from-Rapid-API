package com.weather.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.weather.service.WeatherService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Swapnil Mane
 */
@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${forecastSummaryUrl}")
	private String forecastSummaryUrl;
	
	@Value("${forecastSummaryxRapidAPIKey}")
	private String forecastSummaryxRapidAPIKey;
	
	@Value("${forecastSummaryxRapidAPIHost}")
	private String forecastSummaryxRapidAPIHost;
	
	/**
	 * This method is fetching Forecast Summary By Location Name from Rapid API
	 */
	@Override
	public Object getForecastSummary() {
		try {
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.set("X-RapidAPI-Key", forecastSummaryxRapidAPIKey);
			httpHeaders.set("X-RapidAPI-Host", forecastSummaryxRapidAPIHost);
			
			// Make get call to the Rapid API
			ResponseEntity<String> response = restTemplate.exchange(forecastSummaryUrl, HttpMethod.GET,
					new HttpEntity<>(httpHeaders), String.class);
			log.info("Output from Rapid API:{}", response.getBody());
			return response.getBody();
			
		} catch (Exception e) {
			log.error("Something went wrong while fetching data from Rapid API",e);
			throw new ResponseStatusException(
					HttpStatus.INTERNAL_SERVER_ERROR,
					"Caught Exception while calling endpoint of"
					+ " Rapid API for weather Forecast SummaryBy Location Name",e);
		}
		
	}

}
