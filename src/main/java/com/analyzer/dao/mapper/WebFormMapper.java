package com.analyzer.dao.mapper;


import com.analyzer.api.WebForm;
import com.analyzer.api.condition.WebFormCondition;

import java.util.List;

//@Mapper
public interface WebFormMapper {
//	@Insert("insert into web_form(w_id,w_web,w_web_name,w_first_web,w_reliability,w_is_rhp) " +
//			"values(#{id},#{web},#{webname},#{firstweb},#{reliability},#{isRHP})")
//	@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
	int saveOne(WebForm hp);
	//存储一个
//	@Insert("insert into web_form(w_id,w_web,w_web_name,w_first_web,w_reliability,w_is_rhp) " +
//			"values(#{id},#{web},#{webname},#{firstweb},#{reliability},#{isRHP})")
//	@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
//	int saveAll(List<WebForm> list);
	//储存所有
//	@Select("select * from web_form where 1=1")
	List<WebForm> selectAll();
	//根据条件筛选
//	@Select("select * from housing_form where web_id=#{web_id} and w_web_name=#{webname}")
	List<WebForm> selectAllbyCondition(int web_id,String name);
	//根据条件筛选
//	@Select("select * from housing_form where web_id=#{web_id}")
//	List<String> selectAllFirstWeb(@Param("web_id")int web_id);
	//根据web_id获得首页
	
	//删除所选条件
//	@Delete("delete from web_form where web_id=#{id}")
	boolean deleteByCondition(WebFormCondition condition);


	}