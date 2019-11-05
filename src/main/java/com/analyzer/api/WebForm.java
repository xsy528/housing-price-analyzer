package com.analyzer.api;

public class WebForm {
		
	private int id;
	//id
	private String web;
	//爬取城市
	private String webname;
	//爬取网站名
	private String firstweb;
	//第一页网址
	private int reliability;
	//根据深度爬取的网址（json字符串）
	private boolean isRHP;
	//爬取时间


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getWebname() {
		return webname;
	}

	public void setWebname(String webname) {
		this.webname = webname;
	}

	public String getFirstweb() {
		return firstweb;
	}

	public void setFirstweb(String firstweb) {
		this.firstweb = firstweb;
	}

	public int getReliability() {
		return reliability;
	}

	public void setReliability(int reliability) {
		this.reliability = reliability;
	}

	public boolean isRHP() {
		return isRHP;
	}

	public void setRHP(boolean RHP) {
		isRHP = RHP;
	}
}
