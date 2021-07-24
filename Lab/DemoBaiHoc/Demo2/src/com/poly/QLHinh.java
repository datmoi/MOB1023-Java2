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
public class QLHinh {

    public static void main(String[] args) {
        Hinh tron = new Tron(20);
        Hinh tamgiac = new TamGiac(3, 4, 5);
        Hinh chunhat = new ChuNhat(7, 5);

        tron.print();
        tamgiac.print();
        chunhat.print();
    }
}
