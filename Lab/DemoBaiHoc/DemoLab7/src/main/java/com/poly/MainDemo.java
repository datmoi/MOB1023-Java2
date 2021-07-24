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
public class MainDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Transport tp;
        tp = Transport.CAR;
        System.out.println(tp);
        switch(tp){
            case CAR:
                System.out.println("Xe o to chay voi toc do "+tp.getSpeed());
                break;
            case TRUCK:
                System.out.println("Xe tai chay voi toc do "+tp.getSpeed());
                break;
            case TRAIN:
                System.out.println("Tau hoa chay voi toc do "+tp.getSpeed());
                break;
            case BOAT:
                System.out.println("Tau thuy chay voi toc do "+tp.getSpeed());
                break;
            case AIRPLANE:
                System.out.println("May bay bay voi toc do "+tp.getSpeed());
                break;
        }
        tp.setSpeed(100);
        System.out.println("Toc do moi: "+tp.getSpeed());
    }
}
