/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai4;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author duyplus
 */
public class ThreadXoSo implements Runnable {

    private JTextField jTextField;

    public ThreadXoSo(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    @Override
    public void run() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        float ran = (float) Math.random() * 10;
                        int random = (int) ran;
                        Thread.sleep(10);
                        jTextField.setText("" + random);
                    } catch (Exception e) {
                    }
                }
            }
        });
        t1.start();
    }
}
