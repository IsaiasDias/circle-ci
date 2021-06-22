package com.uniacademia.twitter.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.social.twitter.api.SearchParameters;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Trend;
import org.springframework.social.twitter.api.Trends;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

import com.uniacademia.twitter.exceptions.NotValidCountryException;
import com.uniacademia.twitter.util.CountryWOEID;

@Service
@CacheConfig(cacheNames = {"country"})
public class TwitterTrendService {

	@Autowired
	private Twitter twitter;
	
	@Cacheable(value = "country", key = "#id")
	public List<String> getTrendTweetsByCountry(String id){
		if (!EnumUtils.isValidEnum(CountryWOEID.class, id.toUpperCase())) {
			throw new NotValidCountryException();
		}
		
		Trends trends = twitter.searchOperations().getLocalTrends(CountryWOEID.valueOf(id.toUpperCase()).getWoeid());
		
		List<String> tweetsIds = new ArrayList<>();
		for (Trend trend : trends.getTrends()) {
			SearchResults results = twitter.searchOperations().search(new SearchParameters(trend.getName()).count(2));
			if (results.getTweets().size() > 0) {
				tweetsIds.add(String.valueOf(results.getTweets().get(0).getId()));
			}
		}
		
		return tweetsIds.subList(0, 20);
	}
	
}
