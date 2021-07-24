/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author duyplus
 */
public class FileRW {
    public static void main(String[] args) {
        String filename = "datarw.txt";
        File file = new File(filename);
        
        try {
            FileWriter output = new FileWriter(file);
            output.write("Doc ghi du lieu trong Java");
            output.write("\n");
            output.write("Su dung FileWrite");
            output.close();
            System.out.println("Doc tu file "+file.getName());
            FileReader input = new FileReader(file);
            int ch;
            while((ch = input.read()) != -1){
                System.out.println((char)ch);
            }
            input.close();
        } catch (Exception e) {
            throw  new  RuntimeException(e);
        }
    }
}
