package com.uniacademia.twitter.util;

public enum CountryWOEID {
	
	US(23424977L), UK(23424975L), BR(23424768L);
	
	CountryWOEID(Long woeid) {
		this.woeid = woeid;
	}

	private final long woeid;

	public long getWoeid() {
		return woeid;
	}

}
