package com.test;

import com.analyzer.api.WebForm;
import com.analyzer.dao.mapper.WebFormMapper;
import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;
import java.util.List;

public class Test {
    static SqlSession session=null;
    @Resource
    private static WebFormMapper webFormMapper;

    public static void main(String[] args) {
        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            session = sqlSessionFactory.openSession();
//
//            inputStream.close();//该行可能有错！！

            System.out.println(webFormMapper);
            List<WebForm> webForms = webFormMapper.selectAll();


            System.out.println("5555____"+webForms.size());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("0000000");
        }

    }
}
