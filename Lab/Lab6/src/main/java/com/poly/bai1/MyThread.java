/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai1;

/**
 *
 * @author duyplus
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }

}
