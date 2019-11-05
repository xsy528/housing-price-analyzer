package com.web.util;

import com.analyzer.dao.entity.HousingFormEntity;
import com.web.model.View;
import com.web.model.Views;

import java.util.ArrayList;
import java.util.List;


public class GetModels extends Views {
	
	public ArrayList<View> findByPage(int page,List<HousingFormEntity> list,int n){
		ArrayList<View> views = new ArrayList<>();
		for (int i = 0;i<n ;i++){
			HousingFormEntity entity = list.get(page);
			View view = new View(entity.getId()+"",entity.getName(),entity.getRegion(),entity.getPrice()+"",entity.getArea()+""
					,entity.getLocation(), entity.getFormat(),entity.getDesc());
			views.add(view);
		}
		return views;
	}

}
