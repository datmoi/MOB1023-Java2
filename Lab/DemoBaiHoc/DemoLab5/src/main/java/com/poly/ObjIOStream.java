/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author duyplus
 */
public class ObjIOStream {
    public static void main(String[] args) {
        String fileName = "stock.dat";
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Stock[] stocks = {
                new Stock(101, "Nokia", 230.50, 20),
                new Stock(102, "Iphone", 135.50, 10),
                new Stock(103, "Samsung", 100.0, 25),
                new Stock(104, "Oppo", 1230.50, 30)
            };
            oos.writeObject(stocks);
            System.out.println("Da ghi xong!\n");
            oos.close(); fos.close();
            
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Stock[] sts = (Stock[]) ois.readObject();
            for (Stock st : sts) {
                System.out.println(st);
            }
            System.out.println("Da doc xong file!");
            ois.close(); fis.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
