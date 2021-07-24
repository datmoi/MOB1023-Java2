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
public class Tron extends Hinh {

    double bk;

    public Tron(double bk) {
        super("Tròn");
        this.bk = bk;
    }

    @Override
    public double getChuVi() {
        return 2 * bk * Math.PI;
    }

    @Override
    public double getDienTich() {
        return bk * bk * Math.PI;
    }
}
