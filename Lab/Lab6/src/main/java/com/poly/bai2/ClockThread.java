/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author duyplus
 */
public class ClockThread extends Thread implements Runnable{

    public JButton btnClock;

    public ClockThread(JButton btnClock) {
        this.btnClock = btnClock;
    }


    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm"); // 24h
        while (true) {
            Date now = new Date();
            String time = sdf.format(now);
            btnClock.setText(time);
            try {
                Thread.sleep(60000);
            } catch (Exception e) {
                break;
            }
        }
    }
}
