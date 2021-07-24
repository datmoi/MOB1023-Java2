/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai1;

import java.util.ArrayList;

/**
 *
 * @author duyplus
 */
public class Lab8Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList mylist = new ArrayList();
        mylist.add(10);
        mylist.add(15.75);
        mylist.add(true);
        mylist.add("Hello");
        
        int a = (Integer) mylist.get(0);
        double b = (Double) mylist.get(1);
        boolean c = (boolean) mylist.get(2);
        String str = (String) mylist.get(3);
        
        System.out.println("So nguyen: "+a);
        System.out.println("So thuc: "+b);
        System.out.println("Boolean: "+c);
        System.out.println("Xau: "+str);
    }

}
