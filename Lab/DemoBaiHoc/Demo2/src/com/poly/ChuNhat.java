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
public class ChuNhat extends Hinh {

    double cd;
    double cr;

    public ChuNhat(double cd, double cr) {
        super("Chữ Nhật");
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public double getChuVi() {
        return (cd + cr) * 2;
    }

    @Override
    public double getDienTich() {
        return cd * cr;
    }
}
