package com.web.model;

/**
 * 地点类
 * @author 邢少
 *
 */
public class Location {
	//城市string 格式为“浙江-杭州-滨江”
	private String city;
	//街道/小区
	private String detail;
	//存储省-市-区/县
	private String[] str = new String[3];
	
	public Location() {
		// TODO Auto-generated constructor stub
	}
	public Location(String city,String detal){
		this.city = city;
		this.detail = detal;
		this.str = city.split("-");
	}
	/**
	 * 
	 * @return
	 */
	public String getProvince(){
		return str[0];
	}
	public String getCity(){
		return str[1];
	}
	public String getCounty(){
		return str[2];
	}
	/**
	 * @return the city
	 */
	public String getCityString() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
		this.str = city.split("-");
	}
	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Location [city=" + city + ", detail=" + detail + "]";
	}
	
	
	
	
	
	

}
