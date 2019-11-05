package com.analyzer.api;


import com.web.model.Model;

public class RentalHP extends Model {

	private int id;
	//id
	private String city;
	//城市
	private String housing_name;
	//房屋名称
	private int prices;
	//价格/月
	private String format;
	//版式
	private int area;
	//面积
	private String desc;
	//描述
	private String owner;
	//房主
	private String location;
	//位置
	private String other;
	//其他描述
	//private String url;
	//具体信息网址
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
	public int getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(int area) {
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
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
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

	public boolean isIs_rhp() {
		return is_rhp;
	}

	public void setIs_rhp(boolean is_rhp) {
		this.is_rhp = is_rhp;
	}

	public int getWeb_id() {
		return web_id;
	}

	public void setWeb_id(int web_id) {
		this.web_id = web_id;
	}

	/**
	 * @return the url
	 */


	@Override
	public String toString() {
		return "RentalHP [id=" + id + ", city=" + city + ", housing_name=" + housing_name + ", prices=" + prices
				+ ", format=" + format + ", area=" + area + ", desc=" + desc + ", owner=" + owner + ", location="
				+ location + ", other=" + other + "]";
	}
	 
	
	
}
