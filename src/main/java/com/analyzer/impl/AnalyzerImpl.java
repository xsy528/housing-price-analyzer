package com.analyzer.impl;

import com.analyzer.interfaces.Analyzer;
import com.web.model.Model;
import com.analyzer.api.BuyHP;
import com.analyzer.api.RentalHP;
import com.analyzer.api.condition.BuyCondition;
import com.analyzer.api.condition.RentalCondition;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class AnalyzerImpl implements Analyzer {

	public List<BuyHP> getBHPScreenResult(BuyCondition condition) {
		// TODO Auto-generated method stub
		//return DaoUtil.getSelectBHP(condition);
		return null;
	}

	public List<RentalHP> getRHPScreenResult(RentalCondition condition) {
		// TODO Auto-generated method stub
		//return DaoUtil.getSelectRHP(condition);
		return null;
	}

	
	public boolean resultToExcel(String filePath,List<Model> list){
		try{
			
		 FileOutputStream os = new FileOutputStream(new File(filePath));
		 
		 WritableWorkbook workbook = Workbook.createWorkbook(os);
	        //创建新的一页
	     WritableSheet sheet = workbook.createSheet("First Sheet",0);
	     
	        sheet.addCell(new Label(0,0,"序号"));
	        sheet.addCell(new Label(1,0,"房源名称"));
	        sheet.addCell(new Label(2,0,"位置"));
	        sheet.addCell(new Label(3,0,"价格"));
	        sheet.addCell(new Label(4,0,"每平米价格"));
	        sheet.addCell(new Label(5,0,"房屋版式"));
	        sheet.addCell(new Label(6,0,"房屋面积"));
	        sheet.addCell(new Label(7,0,"归属县区"));
	        sheet.addCell(new Label(8,0,"发布时间"));
	        sheet.addCell(new Label(9,0,"其他描述"));
	       
	      if(list.get(0) instanceof RentalHP) {
	        RentalHP rhp = null;
	        String[] split = null;
		       for (int i = 1; i < list.size(); i++) {
		        	//列数
		        		rhp = (RentalHP)list.get(i-1);
						sheet.addCell(new Label(0,i,rhp.getId()+""));
						sheet.addCell(new Label(1,i,rhp.getHousing_name()));
						sheet.addCell(new Label(2,i,rhp.getCity()+rhp.getLocation()));
						sheet.addCell(new Label(3,i,rhp.getPrices()+""));
						sheet.addCell(new Label(4,i,(rhp.getPrices()/rhp.getArea())+""));
						sheet.addCell(new Label(5,i,rhp.getFormat()));
						sheet.addCell(new Label(6,i,rhp.getArea()+""));
						split = rhp.getCity().split("-");
						sheet.addCell(new Label(7,i,split[split.length-1]));
						sheet.addCell(new Label(8,i," "));
						sheet.addCell(new Label(9,i,rhp.getOther()));
				}
	       }else {
	    	    BuyHP bhp = null;
		        String[] split = null;
			       for (int i = 1; i < list.size(); i++) {
			        	//列数
			    	   		bhp = (BuyHP)list.get(i-1);
							sheet.addCell(new Label(0,i,bhp.getId()+""));
							sheet.addCell(new Label(1,i,bhp.getHousing_name()));
							sheet.addCell(new Label(2,i,bhp.getCity()+bhp.getLocation()));
							sheet.addCell(new Label(3,i,bhp.getPrices()+""));
							sheet.addCell(new Label(4,i,bhp.getPrice()+""));
							sheet.addCell(new Label(5,i,bhp.getFormat()));
							sheet.addCell(new Label(6,i,bhp.getArea()+""));
							split = bhp.getCity().split("-");
							sheet.addCell(new Label(7,i,split[split.length-1]));
							sheet.addCell(new Label(8,i,bhp.getDate().toString()));
							sheet.addCell(new Label(9,i,bhp.getOther()));
					}
			
		}
		}catch(Exception e){
			return false;
		}
	      return true;
	}

}
