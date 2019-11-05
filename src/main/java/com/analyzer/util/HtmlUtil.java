package com.analyzer.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.analyzer.dao.entity.HousingFormEntity;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HtmlUtil {
	private final static Logger LOG = LoggerFactory.getLogger(HtmlUtil.class);

	/*public static void main(String[] args) {
		try {
			List<HousingFormEntity> need = getNeed("1https://hz.58.com/chuzu/?utm_source=sem-sales-baidu-pc&spm=56414705433.14561788326&utm_campaign=sell&utm_medium=cpc&showpjs=pc_fg1", true, 1);
			System.out.println(need.size());
		}catch (Exception e){
			e.printStackTrace();
		}
	}*/

	public static List<HousingFormEntity> getNeed(String url, boolean isRHP, int web_id) throws Exception {

		LOG.warn(">>>>"+url);

		Document document = Jsoup.connect(url.substring(1,url.length()-1))
				.userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
				.get();
		LOG.warn("<<<<<<<<<<<<<<<<");
		String html = document.html();
		HtmlCleaner hc = new HtmlCleaner();
		TagNode tn = hc.clean(html);
		//获得所有的四个要素

		List<HousingFormEntity> list = new ArrayList<>();

//		this.id = id;
//		this.region = region;
//		this.name = name;
//		this.price = price;
//		this.prices = prices;
//		this.format = format;
//		this.area = area;
//		this.desc = desc;
//		this.owner = owner;
//		this.location = location;
//		this.other = other;
//		this.isRhp = isRhp;
//		this.webId = webId;
		Object[] span1 = null;//name 房屋
		Object[] span2 = null;//price 每月价格/每平价格
		Object[] span3 = null;//prices 无/总价格
		Object[] span4 = null;//format 房屋版式
		Object[] span5 = null;//area 面积
		Object[] span6 = null;//desc 描述
		Object[] span7 = null;//owner 房主 
		Object[] span8 = null;// location 具体位置
		Object[] span9 = null;//other 其他描述
		String region = null; //区
		if (web_id == 1) {  //58同城
			if (isRHP) {
				span1 = tn.evaluateXPath("//a[@class='strongbox']/text()");
				LOG.warn("span1:"+span1.length);
				//房源名字
				span2 = tn.evaluateXPath("//div[@class='money']/b");
				LOG.warn("span2:"+span2.length);
				//价格
				//span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//p[@class='room']/text()");
				LOG.warn("span4:"+span4.length);
				//版型和面积
				//span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span6 = tn.evaluateXPath("//p[@class='infor']/text()");
				LOG.warn("span6:"+span6.length);
				//描述
				span7 = tn.evaluateXPath("////span[@class='listjjr']/text()");
				LOG.warn("span7:"+span7.length);
				//房主
				span8 = tn.evaluateXPath("//p[@class='infor']/a/text()");
				LOG.warn("span8:"+span8.length);
				//具体位置
				span9 = tn.evaluateXPath("////span[@class='jjr_par_dp']/text()");
				LOG.warn("span9:"+span9.length);
				//其他描述
				//region = tn.evaluateXPath("///div[@class='bar_left']/h2");
				//LOG.warn("region:"+span5.length);

			} else {
				span1 = tn.evaluateXPath("//span[@class='name']/text()");
				span2 = tn.evaluateXPath("//p[@class='job_salary']/text()");
				span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span6 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span7 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span8 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span9 = tn.evaluateXPath("//a[@class='next']/@herf");


			}


		} else if (web_id == 2) {  //安居客
			if (isRHP) {
				span1 = tn.evaluateXPath("//span[@class='name']/text()");
				span2 = tn.evaluateXPath("//p[@class='job_salary']/text()");
				span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span6 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span7 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span8 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span9 = tn.evaluateXPath("//a[@class='next']/@herf");


			} else {
				span1 = tn.evaluateXPath("//span[@class='name']/text()");
				span2 = tn.evaluateXPath("//p[@class='job_salary']/text()");
				span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span6 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span7 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span8 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span9 = tn.evaluateXPath("//a[@class='next']/@herf");


			}

		} else if (web_id == 3) {  //链家  //租房去除链家
			if (isRHP) {
				span1 = tn.evaluateXPath("//span[@class='name']/text()");
				span2 = tn.evaluateXPath("//p[@class='job_salary']/text()");
				span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span6 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span7 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span8 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span9 = tn.evaluateXPath("//a[@class='next']/@herf");


			} else {
				span1 = tn.evaluateXPath("//span[@class='name']/text()");
				span2 = tn.evaluateXPath("//p[@class='job_salary']/text()");
				span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span6 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span7 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span8 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span9 = tn.evaluateXPath("//a[@class='next']/@herf");


			}

		} else if (web_id == 4) {  //房天下
			if (isRHP) {
				span1 = tn.evaluateXPath("//span[@class='name']/text()");
				span2 = tn.evaluateXPath("//p[@class='job_salary']/text()");
				span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span6 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span7 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span8 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span9 = tn.evaluateXPath("//a[@class='next']/@herf");


			} else {
				span1 = tn.evaluateXPath("//span[@class='name']/text()");
				span2 = tn.evaluateXPath("//p[@class='job_salary']/text()");
				span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span6 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span7 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span8 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span9 = tn.evaluateXPath("//a[@class='next']/@herf");


			}

		} else if (web_id == 5) {    //自如网
			if (isRHP) {
				span1 = tn.evaluateXPath("//span[@class='name']/text()");
				span2 = tn.evaluateXPath("//p[@class='job_salary']/text()");
				span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span6 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span7 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span8 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span9 = tn.evaluateXPath("//a[@class='next']/@herf");


			} else {
				span1 = tn.evaluateXPath("//span[@class='name']/text()");
				span2 = tn.evaluateXPath("//p[@class='job_salary']/text()");
				span3 = tn.evaluateXPath("//span[@class='address']/text()");
				span4 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span5 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span6 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span7 = tn.evaluateXPath("//div[@class='comp_name']/text()");
				span8 = tn.evaluateXPath("//div[@class='comp_name']/text()");

				span9 = tn.evaluateXPath("//a[@class='next']/@herf");


			}

		}
		int n[] = {span1==null?180:span1.length,
				span2==null?180:span2.length,
				span3==null?180:span3.length,
				span4==null?180:span4.length,
				span5==null?180:span5.length,
				span6==null?180:span6.length,
				span7==null?180:span7.length,
				span8==null?180:span8.length,
				span9==null?180:span9.length,
		};
		Arrays.sort(n);
		LOG.warn("HtmlUtil记录的数据个数为："+n[0]);
		if(isRHP){
		for (int i = 0; i < n[0]; i++) {
			HousingFormEntity entity = new HousingFormEntity(null, region, span1[i].toString(),
					3400,
					//Double.parseDouble( span2[i].toString()),
					null, span4[i].toString().substring(0,6),
					90,
					//Double.parseDouble(((String) span3[i]).split("&nbsp;&nbsp;&nbsp;&nbsp")[1]),
					span6[i].toString(), span7[i].toString(),
					span8[i].toString(), span9[i].toString(), (byte) (isRHP ? 1 : 0), web_id);
			//System.out.println(entity.toString());
			list.add(entity);

		}}else {
			for (int i = 0; i < n[0]; i++) {
			HousingFormEntity entity = new HousingFormEntity(null, region, (String) span1[i], Double.parseDouble((String) span2[i]),
					Double.parseDouble((String) span3[i]), (String) span4[i], Double.parseDouble((String) span5[i]), (String) span6[i], (String) span7[i],
					(String) span8[i], (String) span9[i], (byte) (isRHP ? 1 : 0), web_id);
			list.add(entity);

		}

		}
		LOG.warn(">>>>>>"+list.size());
		return list;
	}

}