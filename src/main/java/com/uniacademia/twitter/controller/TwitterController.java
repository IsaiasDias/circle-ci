package com.uniacademia.twitter.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uniacademia.twitter.exceptions.NotValidCountryException;
import com.uniacademia.twitter.service.TwitterTrendService;

@RestController
@RequestMapping(value = "/api/tweet/")
public class TwitterController {

	@Autowired
	private TwitterTrendService twitterTrendService;
	
	//@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public List<String>getTrendsByCountry(@PathVariable String id) throws ExecutionException {
		List<String> trends = twitterTrendService.getTrendTweetsByCountry(id);
		return trends;
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Não é um país suportado") // 400
	@ExceptionHandler(NotValidCountryException.class)
	public void isNotIP() {

	}
}
