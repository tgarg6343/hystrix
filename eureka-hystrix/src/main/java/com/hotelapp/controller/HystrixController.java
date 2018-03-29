package com.hotelapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@RestController
public class HystrixController {

	@Autowired
	private HotelService hotelService;
	
	@RequestMapping(value="/hotel", produces="application/json")
	public String findAll(){
		return hotelService.findAll();
	}
}
