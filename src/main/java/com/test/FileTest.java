package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileTest {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("src/main/webapp/excel/housing-price.xlsx");
            System.out.println(os.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
