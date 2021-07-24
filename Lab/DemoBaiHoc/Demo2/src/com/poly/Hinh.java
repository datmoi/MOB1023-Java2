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
public class Hinh {

    public String name;

    public double getChuVi() {
        return -1;
    }

    public double getDienTich() {
        return -1;
    }

    public Hinh(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Hình " + name);
        System.out.println("Chu Vi: " + getChuVi());
        System.out.println("Diện Tích: " + getDienTich());
    }

}
