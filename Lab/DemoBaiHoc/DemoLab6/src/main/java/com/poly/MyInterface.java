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
public class MyInterface implements Runnable{
    @Override
    public void run(){
        MyThread t1 = new MyThread();
        t1.start();
        for (int i = 10; i > 0; i--) {
            System.err.println("My Inner "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println("Ket thuc!");
    }
}
