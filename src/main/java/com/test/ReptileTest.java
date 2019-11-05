package com.test;

import com.analyzer.dao.HousingFormDao;
import com.analyzer.reptile.WebReptile;
import org.springframework.beans.factory.annotation.Autowired;

public class ReptileTest {
    @Autowired
    private static HousingFormDao housingFormDao;

    public static void main(String[] args) {
        int web_id = 1;

        Thread t1 = new WebReptile(housingFormDao,true,web_id);
        Thread t2 = new WebReptile(housingFormDao,true,web_id);
        Thread t3 = new WebReptile(housingFormDao,true,web_id);
        Thread t4 = new WebReptile(housingFormDao,true,web_id);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
