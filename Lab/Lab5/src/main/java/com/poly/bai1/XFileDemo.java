/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai1;

import java.io.IOException;

/**
 *
 * @author duyplus
 */
public class XFileDemo {

    public static void main(String[] args) throws IOException {
        byte[] data = XFile.read("test.txt");
        XFile.write("tests.txt", data);
//        try {
//            String path = "test.txt";
//            XFile.write(path, "Hello world! How are you today?".getBytes());
//            byte[] data = XFile.read(path);
//            System.out.println("Read Data: " + new String(data));
//        } catch (IOException ex) {
//            System.out.println("Error:" + ex.getMessage());
//        }
    }
}
