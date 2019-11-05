package com.analyzer.reptile;

import com.analyzer.util.GetUrl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FindNext{
	private final static Logger LOG = LoggerFactory.getLogger(FindNext.class);

	public static List<String>  find(List<String> list,String url, int deep,int web_id) {

		String next ;
		try {
			LOG.warn("FindNext-url:"+url);

			Document document = Jsoup.connect(url).userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
					.get();
			//将给定的url根据给的那个的深度进行爬取，将爬取的数据入库
			//从库中获取需要爬取的网址
			//循环爬取
			//将爬取的内容存入表中
//			URL u = new URL(url);
//
//			URLConnection  conn =u.openConnection();
//			InputStream in = conn.getInputStream();
//
//			BufferedReader br = new BufferedReader(new InputStreamReader(in));
//
//			String line = null;
//			StringBuffer html = new StringBuffer();
//			while((line=br.readLine())!=null){
//				html.append(line);
//			}
//
//			in.close();
//			br.close();
			next = GetUrl.getURL(document.html(),web_id);
			LOG.debug(">>>>next:"+next);
			list.add(next);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			LOG.error("!!!!!!"+e.getMessage());
			return list;
		}

		if("".equals(next)||next ==null)
			return list;

		if(deep >0&&!url.equals(next)){
			return find(list,next,deep-1,web_id);
		}else {
			return list;
		}
	}

//	public void run() {
//		// TODO Auto-generated method stub
//		String url = "";
//		//目标网页
//		int deep = 0;
//		//爬取深度
//		try {
//			Document document = Jsoup.connect(url)
//			         .userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
//			         .get();
//			//将给定的url根据给的那个的深度进行爬取，将爬取的数据入库
//
//			//从库中获取需要爬取的网址
//
//			//循环爬取
//				//将爬取的内容存入表中
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
}
