package com.web.model;

import java.util.ArrayList;

public class Views {
	private int count = 0;
	
	private ArrayList<View> views = new ArrayList<View>();

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the views
	 */
	public ArrayList<View> getViews() {
		return views;
	}

	/**
	 * @param views the views to set
	 */
	public void setViews(ArrayList<View> views) {
		this.views = views;
	}
	
	

}
