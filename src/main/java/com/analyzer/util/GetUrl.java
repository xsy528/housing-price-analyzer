package com.analyzer.util;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GetUrl {
    private final static Logger LOG = LoggerFactory.getLogger(GetUrl.class);

    public static String getURL(String html,int web_id){
        LOG.warn("html.length"+html.length());
        //Iterator<Element> iterator = select.iterator();
        Document doc = Jsoup.parse(html);

        String href = null;
        if(web_id ==1||web_id == 3){
            href = "a[href]";
        }else if (web_id ==2){
//<a href="https://hz.zu.anjuke.com/fangyuan/p2/" class="aNxt">下一页 &gt;</a>
            href = "a.aNxt";
        }else if (web_id ==4){
            href = "a.cPage";
        }else if (web_id ==5){
            href = "a.next";
        }

        Elements select = doc.select(href);
        String data = null;
        for (Element element : select) {
            String text = element.text();
//            if("".equals(text)||"下一页".equals(text)){
            if("下一页".equals(text)){
            LOG.debug(element.text() + " " + element.attr("href"));
            data = element.attr("href");
            break;
            //添加对应的数据库，进行测试
            }
        }
        return data;

//			WebForm bean = mapper.findURL(data);
//			if(bean!=null){
//				return null;
//			}
//			try {
//					WebForm url = new WebForm(0, data);
//					mapper.saveURL(url);
//					session.commit();
//			} catch (Exception e) {
//				e.printStackTrace();
//				session.rollback();
//				return null;
//			}
        // 使用jsoup将html里面的a标签里面的数据全部读取出来（假如想读取其他标签，直接将a改为其他标签名称即可，例如"img"）
//        Elements links = Jsoup.parse(html).select("a");
//        // 使用循环遍历每个标签数据
//        for (Iterator<Element> it = links.iterator(); it.hasNext();) {
//            Element e = (Element) it.next();
//            // 输出其text值和其属性值（可以将href改为其他属性名称，例如src）
//            System.out.println(e.text() + " " + e.attr("href"));
//
//        }
        //System.out.println(data);
    }
}
