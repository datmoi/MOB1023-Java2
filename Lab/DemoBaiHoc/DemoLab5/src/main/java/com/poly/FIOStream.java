/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author duyplus
 */
public class FIOStream {

    public static void main(String[] args) {
        String fileName = "data.txt";
        
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            int i = 100;
            char c = 'a';
            String s = "Hello";
            
            fos.write(i);
            fos.write(c);
            fos.write(s.getBytes());
            
            System.out.println("Da ghi xong");
            fos.close();
            
            System.out.println("Doc file");
            FileInputStream fis = new FileInputStream(fileName);
            System.out.println("i = "+fis.read());
            System.out.println("c = "+(char)fis.read());
            int ch;
            while ((ch = fis.read()) != -1) {                
                System.out.print((char)ch);
            }
            System.out.println("\nDa doc xong file");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
