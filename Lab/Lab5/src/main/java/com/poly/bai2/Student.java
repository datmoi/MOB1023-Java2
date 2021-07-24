/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai2;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duyplus
 */
public class Student implements Serializable{

    public String name;
    public double marks;
    public String major;

    public Student() {
    }

    public Student(String name, double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }

    public String getGrade() {
        if (this.marks < 3) {
            return "Kém";
        }
        if (this.marks < 5) {
            return "Yếu";
        }
        if (this.marks < 6.5) {
            return "Trung bình";
        }
        if (this.marks < 7.5) {
            return "Khá";
        }
        if (this.marks < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    public boolean isBonus() {
        return this.marks >= 7.5;
    }
    
    public static void main(String[] args) {
        try {
            List<Student> list = new ArrayList<>();
            list.add(new Student("Duy", 5, "CNTT"));
            list.add(new Student("Thu", 7.5, "TKTW"));
            list.add(new Student("Dung", 8.5, "CNTT"));
            XFile.writeObject("students.txt", list);
            List<Student> list2 = (List<Student>) XFile.readObject("students.txt");
            for (Student sv : list) {
                System.out.println(">Ho va ten: " + sv.name);
            }
        } catch (IOException ex) {
            System.out.println("Loi: "+ex.getMessage());
        }
    }
}
