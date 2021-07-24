/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai3;

import java.io.Serializable;

/**
 *
 * @author duyplus
 */
public class Staff implements Serializable {
    public String fullname;
    public double salary;

    public Staff() {
    }

    public Staff(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
    
}
