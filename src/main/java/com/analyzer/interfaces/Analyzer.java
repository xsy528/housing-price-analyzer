package com.analyzer.interfaces;


import com.web.model.Model;
import com.analyzer.api.BuyHP;
import com.analyzer.api.RentalHP;
import com.analyzer.api.condition.BuyCondition;
import com.analyzer.api.condition.RentalCondition;

import java.util.List;

/**
 * 所有方法接口类
 * @author 邢少
 *
 */
public interface Analyzer {
	
	//获取买房筛选结果
	public List<BuyHP> getBHPScreenResult(BuyCondition condition);
	//获取租房筛选结果
	public List<RentalHP>  getRHPScreenResult(RentalCondition condition);
	//将结果转成excel表格
	public boolean resultToExcel(String filePath, List<Model> list);
	
}
