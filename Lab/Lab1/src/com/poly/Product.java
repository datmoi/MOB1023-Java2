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
public class Product implements DAO{

    // Khai báo các trường dữ liệu
    private String name;
    private double price;

    // Khai báo các hàm tạo
    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Các phương thức getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Tính thuế nhập khẩu
    public double getImportTax() {
        return this.price * 0.1;
    }

    @Override
    public void insert() {
        System.out.println("Chèn thành công!");
    }

    @Override
    public void update() {
        System.out.println("Cập nhật thành công!");
    }

    @Override
    public void delete() {
        System.out.println("Xoá thành công!");
    }

    @Override
    public void select() {
        System.out.println("Chọn thành công!");
    }
}
