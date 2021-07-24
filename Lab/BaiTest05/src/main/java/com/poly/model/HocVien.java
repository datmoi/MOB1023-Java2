/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.model;

import java.io.Serializable;

/**
 *
 * @author 
 */
public class HocVien implements Serializable {

    private String maHV;
    private String tenHV;
    private int tuoi;

    public HocVien() {
    }

    public HocVien(String maHV, String tenHV, int tuoi) {
        this.maHV = maHV;
        this.tenHV = tenHV;
        this.tuoi = tuoi;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
