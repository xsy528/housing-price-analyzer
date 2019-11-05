package com.analyzer.api.condition;

/**
 * 买房筛选条件实体类
 * @author 邢少
 *
 */
public class BuyCondition extends Condition{

	//prices, format, area, location, other
	
	//最大总价格
	private int maxPrices;
	//最小总价格
	private int minPrices;
	//版式
	private String format;
	//面积
	private float Maxarea;

	private float Minarea;
		//区
		private String region;
		//详细
		private String detail;

	//其他，如靠近地铁等
	private String other;
	/**
	 * @return the maxPrices
	 */
	public int getMaxPrices() {
		return maxPrices;
	}
	/**
	 * @param maxPrices the maxPrices to set
	 */
	public void setMaxPrices(int maxPrices) {
		this.maxPrices = maxPrices;
	}
	/**
	 * @return the minPrices
	 */
	public int getMinPrices() {
		return minPrices;
	}
	/**
	 * @param minPrices the minPrices to set
	 */
	public void setMinPrices(int minPrices) {
		this.minPrices = minPrices;
	}

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
	public String getDetail() {
		return detail;
	}
	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
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

	public float getMaxarea() {
		return Maxarea;
	}

	public void setMaxarea(float maxarea) {
		Maxarea = maxarea;
	}

	public float getMinarea() {
		return Minarea;
	}

	public void setMinarea(float minarea) {
		Minarea = minarea;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
}
