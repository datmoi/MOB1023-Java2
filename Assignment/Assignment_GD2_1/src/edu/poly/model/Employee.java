/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.model;

import java.io.Serializable;

/**
 *
 * @author duyplus
 */
public class Employee implements Serializable {

    private String maNV, hotenNV, email;
    private float luong;
    private Integer tuoi;

    public Employee() {
    }

    public Employee(String maNV, String hotenNV, String email, float luong, Integer tuoi) {
        this.maNV = maNV;
        this.hotenNV = hotenNV;
        this.email = email;
        this.luong = luong;
        this.tuoi = tuoi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHotenNV() {
        return hotenNV;
    }

    public void setHotenNV(String hotenNV) {
        this.hotenNV = hotenNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    

}
