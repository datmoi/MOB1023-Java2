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
public class NewClass {
    public static void changeNumber(int number) {
number = number + 1;
}
public static void main(String ags[]) {
int a = 10;
System.out.println("a=" + a);
changeNumber(a);
System.out.println("a=" + a);
}
}
