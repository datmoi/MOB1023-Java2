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
public class TamGiac extends Hinh {

    double c1;
    double c2;
    double c3;

    public TamGiac(double c1, double c2, double c3) {
        super("Tam Giác");
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    @Override
    public double getChuVi() {
        return c1 + c2 + c3;
    }

    @Override
    public double getDienTich() {
        return 0;
    }

}
