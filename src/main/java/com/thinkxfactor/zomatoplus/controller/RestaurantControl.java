package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;
@RestController
@RequestMapping("/restaurant")
public class RestaurantControl {
	@Autowired
	private RestaurantRepository repo;
	@GetMapping("/all")
	public List<Restaurant> restaurantLogin() {
		return repo.findAll();
		
	}

	@PostMapping("/create")
	public Restaurant create(@RequestBody Restaurant restaurant ) {
		repo.saveAndFlush(restaurant);
		System.out.println(restaurant.toString());
		return restaurant;
	}
}
