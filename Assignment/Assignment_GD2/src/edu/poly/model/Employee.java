/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Employee implements Serializable{
    
    private String MaNV,hoTen,email;
    private int tuoi;
    private double luong;

    public Employee() {
    }

    public Employee(String MaNV, String hoTen, String email, int tuoi, double luong) {
        this.MaNV = MaNV;
        this.hoTen = hoTen;
        this.email = email;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
       return this.MaNV + "\t" + this.hoTen + "\t" + this.tuoi + "\t" + this.email + "\t" + this.luong;
    }
}
