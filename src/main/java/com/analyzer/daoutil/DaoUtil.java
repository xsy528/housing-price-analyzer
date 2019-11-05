package com.analyzer.daoutil;

import com.analyzer.dao.mapper.BuyHPMapper;
import com.analyzer.dao.mapper.RentalHPMapper;
import com.analyzer.dao.mapper.WebFormMapper;
import com.analyzer.api.BuyHP;
import com.analyzer.api.RentalHP;
import com.analyzer.api.WebForm;
import com.analyzer.api.condition.WebFormCondition;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DaoUtil {
//	static SqlSession session=null;
//	static{
//		try {
//			InputStream inputStream = Autowrieds.getAutowriedAsStream("mybatis-config.xml");
//
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//			 session = sqlSessionFactory.openSession();
//
//			 inputStream.close();//该行可能有错！！
//	//session.insert(arg0, arg1);另一种执行方法
//		} catch (IOException e) {
//			e.printStackTrace();
//			session.close();
//		}
//
//	}
	@Autowired
	private static RentalHPMapper rentalHPMapper;
	@Autowired
	private static BuyHPMapper buyHPMapper;
	@Autowired
	private static WebFormMapper webFormMapper;
	//@Autowired
	//private static LinkFormMapper linkFormMapper;
	/**
	 * 全部储存租房信息
	 * @param list
	 * @return
	 */
	public static int putRHP(List<RentalHP> list){
		if (list.size() == 0) {
			return 0;
		}
		if(list.size()==1){
		  return rentalHPMapper.saveOne(list.get(0));
		}
		
		//int saveAll = rentalHPMapper.saveAll(list);
		return 0;
	}
	public static void deleteRHP(int id){
		try {
			rentalHPMapper.deleteOne(id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	/**
	 * 根据条件筛选符合要求的
	 * @param condition
	 * @return
	 */
//	public static List<RentalHP> getSelectRHP(RentalCondition condition){
//		int maxPrices = condition.getMaxPrices();
//		int minPrices = condition.getMinPrices();
//		String format = condition.getFormat();
//		int area = condition.getArea();
//		String province = condition.getProvince();
//		String city = condition.getCity();
//		String county = condition.getCounty();
//		String detail = condition.getDetail();
//		String other = condition.getOther();
//
//
//		List<RentalHP> select = rentalHPMapper.selectAllbyCondition(maxPrices,minPrices,format,area
//				,province,city,county,detail,other);
//		return select;
//	}
	/**
	 * 存储卖房信息
	 * @param list
	 * @return
	 */
	public static int putBHP(List<BuyHP> list){
		if (list.size() == 0) {
			return 0;
		}
		if(list.size()==1){
		  return buyHPMapper.saveOne(list.get(0));
		}
		
	//	int saveAll = buyHPMapper.saveAll(list);
		return 0;
	}
	/**
	 * 
	 * @param id
	 */
	public static void deleteBHP(int id){
		try {
			buyHPMapper.deleteOne(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	/**
//	 * 筛选特定的房源
//	 * @param condition
//	 * @return
//	 */
//	public static List<BuyHP> getSelectBHP(BuyCondition condition){
//		int maxPrices = condition.getMaxPrices();
//		int minPrices = condition.getMinPrices();
//		double price = condition.getPrice();
//		String format = condition.getFormat();
//		float area = condition.getArea();
//		String province = condition.getProvince();
//		String city = condition.getCity();
//		String county = condition.getCounty();
//		String detail = condition.getDetail();
//		String other = condition.getOther();
//
//
//		List<BuyHP> select = buyHPMapper.selectAllbyCondition(maxPrices,minPrices
//				,price,format,area,province,city,county,detail,other);
//		return select;
//	}
	
	public static int putWeb(List<WebForm> list){
		if (list.size() == 0) {
			return 0;
		}
		if(list.size()==1){
			  return webFormMapper.saveOne(list.get(0));
			}
		try {
			//return webFormMapper.saveAll(list);
			return 0;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	public static boolean deleteWeb(WebFormCondition condition){
		return 	webFormMapper.deleteByCondition(condition);
	}

	public static List<WebForm> getWebsite() {
		return webFormMapper.selectAll();
	}
}

