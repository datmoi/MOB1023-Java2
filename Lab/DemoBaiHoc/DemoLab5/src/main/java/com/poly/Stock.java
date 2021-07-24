/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.io.Serializable;

/**
 *
 * @author duyplus
 */
public class Stock implements Serializable{
    public int id;
    public String desc;
    public double price;
    public int quantity;

    public Stock(int id, String desc, double price, int quantity) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return id+ " "+desc+" "+price+" "+quantity;
    }
}

