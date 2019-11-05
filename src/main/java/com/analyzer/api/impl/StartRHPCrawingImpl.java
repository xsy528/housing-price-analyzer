package com.analyzer.api.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.analyzer.dao.HousingFormDao;
import com.analyzer.reptile.FindNext;
import com.analyzer.reptile.WebReptile;
import com.analyzer.dao.WebFormDao;
import com.analyzer.dao.entity.WebFormEntity;
import com.analyzer.interfaces.StartCrawling;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class StartRHPCrawingImpl implements StartCrawling {

	private final Logger LOG = LoggerFactory.getLogger(StartRHPCrawingImpl.class);


	private WebFormDao webFormDao;

	private HousingFormDao housingFormDao;

	@Autowired
	public StartRHPCrawingImpl(WebFormDao webFormDao, HousingFormDao housingFormDao){
		this.webFormDao = webFormDao;
		this.housingFormDao = housingFormDao;
	}

	@Override
	public void start(){
		
		try {
			LOG.warn("====================start crawing==================");

			OutputStream out = new FileOutputStream("src/main/resources/html.properties");
			Properties properties = new Properties();
			
			List<WebFormEntity> list = webFormDao.findAll();
			LOG.warn(">>>>>>>>>>>>>爬取网站个数为："+list.size());
			List<String> webList = new ArrayList<String>();
			int web_id = 0;
			if(list != null)
			for(int i = 0;i<list.size();i++){
				String url = list.get(i).getwFirstWeb();
				LOG.warn(">>>url:"+url);
				web_id = getWebId(url);
				LOG.warn(">>>>>web_id:"+web_id);
				int deep = 10;
				webList.add(url);
				webList = FindNext.find(webList,url, deep,web_id);
//				if(item != null){
//					webList.add(url);
//					webList.addAll(item);
//				}
//				else {
//					webList.add(url);
//				}
				
			}
			
			for (int i = 0; i < webList.size(); i++) {
				String s = webList.get(i);
				if(s ==null||"".equals(s))
					continue;
				properties.put(i+"", "\""+s+"\"");

			}
			properties.store(out, "");
			out.close();


			LOG.warn("====================start Reptile==================");
			Thread t1 = new WebReptile(housingFormDao,true,web_id);
			Thread t2 = new WebReptile(housingFormDao,true,web_id);
			Thread t3 = new WebReptile(housingFormDao,true,web_id);
			Thread t4 = new WebReptile(housingFormDao,true,web_id);
			
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
		} catch (FileNotFoundException e) {
			LOG.error(e.getLocalizedMessage());
			e.printStackTrace();
		} catch (IOException e) {
			LOG.error(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
	private int getWebId(String url){
		if(url.indexOf("hz.58")!=0){
			return 1;
		}else if(url.indexOf("anjuke")!=0){
			return 2;
		}else if(url.indexOf("zu.fang")!=0){
			return 3;
		}else if(url.indexOf("5i5j.com")!=0){
			return 4;
		}else if(url.indexOf("ziroom")!=0){
			return 5;
		}else {
			return 0;
		}
	}

}
