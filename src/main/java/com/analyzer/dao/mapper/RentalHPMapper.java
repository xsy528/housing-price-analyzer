package com.analyzer.dao.mapper;


import com.analyzer.api.RentalHP;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface RentalHPMapper {

	@Insert("insert into housing_form(id,region,NAME,prices,FORMAT,AREA,DESC,OWNER,location,other,is_rhp,web_id) " +
			"values(#{id},#{city},#{housing_name},#{prices},#{format},#{area},#{desc},#{owner},#{location},#{other},#{is_rhp},#{web_id})")
	 int saveOne(RentalHP hp);
	//存储一个
	// int saveAll(List<RentalHP> list);
	//储存所有
	@Select("select * from housing_form where id=#{id}")
	List<RentalHP> selectAllbyCondition(int maxPrices, int minPrices, String format
		, int area, String province, String city, String county, String detail
		, String other);
	//根据条件筛选
	@Delete("delete from housing_form where id=#{id}")
	void deleteOne(int id);
}
