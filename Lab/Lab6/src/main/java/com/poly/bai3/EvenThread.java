/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai3;

/**
 *
 * @author duyplus
 */
public class EvenThread extends Thread{
    public void run() {
        for (int i = 1; i < 20; i+= 2) {
            System.out.print(" "+i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}
