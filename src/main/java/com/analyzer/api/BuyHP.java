package com.analyzer.api;


import com.web.model.Model;

import java.sql.Date;

public class BuyHP extends Model {
	
	private int id;
	//id
	private String city;
	//城市
	private String housing_name;
	//房屋名称
	private int prices;
	//房屋总价格
	private double price;
	//每平米价格
	private String format;
	//版式
	private double area;
	//面积
	private String desc;
	//描述
	private String location;
	//位置
	private Date date;
	//发布时间
	private String other;
	//其他描述
	private boolean is_rhp;

	private int web_id;
	//链接表id
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
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
	 * @return the housing_name
	 */
	public String getHousing_name() {
		return housing_name;
	}
	/**
	 * @param housing_name the housing_name to set
	 */
	public void setHousing_name(String housing_name) {
		this.housing_name = housing_name;
	}
	/**
	 * @return the prices
	 */
	public int getPrices() {
		return prices;
	}
	/**
	 * @param prices the prices to set
	 */
	public void setPrices(int prices) {
		this.prices = prices;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the other
	 */
	public String getOther() {
		return other;
	}
	/**
	 * @param other the other to set
	 */
	public void setOther(String other) {
		this.other = other;
	}


	public int getWeb_id() {
		return web_id;
	}

	public void setWeb_id(int web_id) {
		this.web_id = web_id;
	}

	public boolean isIs_rhp() {
		return is_rhp;
	}

	public void setIs_rhp(boolean is_rhp) {
		this.is_rhp = is_rhp;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BuyHP [id=" + id + ", city=" + city + ", housing_name=" + housing_name + ", prices=" + prices
				+ ", price=" + price + ", format=" + format + ", area=" + area + ", desc=" + desc + ", location="
				+ location + ", date=" + date + ", other=" + other + ", l_id=" + web_id + "]";
	}
	
	
	
	
}
