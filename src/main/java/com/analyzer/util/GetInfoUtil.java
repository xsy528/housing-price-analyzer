package com.analyzer.util;

import com.analyzer.dao.entity.HousingFormEntity;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class GetInfoUtil {
    private final static Logger LOG = LoggerFactory.getLogger(GetInfoUtil.class);

    public static void main(String[] args) {
        try {
            List<HousingFormEntity> need = getNeed("1https://hz.58.com/chuzu/?utm_source=sem-sales-baidu-pc&spm=56414705433.14561788326&utm_campaign=sell&utm_medium=cpc&showpjs=pc_fg1", true, 1);
           // System.out.println(need.size());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static List<HousingFormEntity> getNeed(String url, boolean isRHP, int web_id) throws Exception {
        LOG.warn(">>>>"+url);

        Document document = Jsoup.connect(url.substring(1,url.length()-1))
                .userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
                .get();
        LOG.warn("<<<<<<<<<<<<<<<<");

        //Elements elements = document.getElementsByClass("house-cell");
        Elements elements = document.select("li");
        Elements div = elements.select("div");
        Elements h2 = div.select("h2");
        Elements p = div.select("p");
        Elements div1 = div.select("div");

        System.out.println(div);
//        for (Element e:elements){
//           e.
//        }



        return null;
    }
}