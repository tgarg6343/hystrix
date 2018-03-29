package com.hotelapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.hotelapp.model.Hotel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HotelService {

	
	@HystrixCommand(fallbackMethod="fallbackFindAll")
	public String findAll(){
throw new RuntimeException();
	}
	public String fallbackFindAll(){
		return "fallback";
	}
	

}
