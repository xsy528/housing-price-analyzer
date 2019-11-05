package com.analyzer.reptile;

import com.analyzer.dao.entity.HousingFormEntity;
import com.analyzer.util.HtmlUtil;
import com.analyzer.dao.HousingFormDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class WebReptile extends Thread{
	private final Logger LOG = LoggerFactory.getLogger(WebReptile.class);

	private boolean isRHP ;

	private int web_id;
	@Autowired
	public WebReptile(HousingFormDao housingFormDao,boolean isRHP, int web_id) {
	    this.housingFormDao = housingFormDao;
		this.isRHP = isRHP;
		this.web_id = web_id;
	}

	private HousingFormDao housingFormDao;

	static Properties properties;
	static int index = 0;
	static {
		try {
			InputStream in = new FileInputStream("src/main/resources/html.properties");
			properties = new Properties();
			properties.load(in);
		}catch (Exception e){

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (properties) {
			try {
				Object url = properties.get("" + index);
				List<HousingFormEntity> need;
				if(url!=null) {
					need = HtmlUtil.getNeed((String) url, isRHP, web_id);
					housingFormDao.saveAll(need);
					housingFormDao.flush();
				}

				LOG.warn("第"+index+"个存储成功！ ");
				index++;
			}catch (Exception e){
				LOG.error("!!!!!!!"+e.getLocalizedMessage());
			}

		}
	}
}
