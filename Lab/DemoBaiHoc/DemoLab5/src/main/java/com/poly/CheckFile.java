/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.io.File;

/**
 *
 * @author duyplus
 */
public class CheckFile {

    public static void main(String[] args) {
        try {
            String fileName = "data.txt";
            File file = new File(fileName);
            if (file.exists()) {
                System.out.println(file.getName());
            } else {
                file.createNewFile();
                System.out.println("Tao file thanh cong");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
