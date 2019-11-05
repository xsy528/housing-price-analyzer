package com.test;

import com.analyzer.dao.HousingFormDao;
import com.analyzer.dao.WebFormDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoTest {
    @Autowired
    private  HousingFormDao housingFormDao;
    @Autowired
    private  WebFormDao webFormDao;

//    public void setHousingFormDao(HousingFormDao housingFormDao) {
//        this.housingFormDao = housingFormDao;
//    }
//    @Autowired
//    public void setWebFormDao(WebFormDao webFormDao) {
//        this.webFormDao = webFormDao;
//    }

    public static void main(String[] args) {
        DaoTest test = new DaoTest();
        test.print();
    }

    public void print(){
        System.out.println(housingFormDao);

        System.out.println(webFormDao);
       // List<HousingFormEntity> all = housingFormDao.findAll();

      //  System.out.println(all.size());
    }
}
