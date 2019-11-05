package com.analyzer.api.condition;

import java.sql.Date;

public class WebFormCondition {
	
	private String city;
	
	private String webName;
	
	private Date startTime;
	
	private Date enTime;

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the webName
	 */
	public String getWebName() {
		return webName;
	}

	/**
	 * @param webName the webName to set
	 */
	public void setWebName(String webName) {
		this.webName = webName;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the enTime
	 */
	public Date getEnTime() {
		return enTime;
	}

	/**
	 * @param enTime the enTime to set
	 */
	public void setEnTime(Date enTime) {
		this.enTime = enTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WebFormCondition [city=" + city + ", webName=" + webName + ", startTime=" + startTime + ", enTime="
				+ enTime + "]";
	}
	
	
	

}
