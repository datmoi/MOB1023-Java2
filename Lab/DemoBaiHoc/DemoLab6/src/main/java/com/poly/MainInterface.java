/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

/**
 *
 * @author duyplus
 */
public class MainInterface {
    public static void main(String[] args) {
        MyInterface myinterface = new MyInterface();
        Thread t1 = new Thread(myinterface);
        t1.start();
        for (int i = 10; i > 0; i--) {
            System.err.println("Main "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println("Ket thuc!");
    }
}
