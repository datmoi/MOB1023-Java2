/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author duyplus
 */
public class DemoCollection {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(list.toString());
        
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(200);
        System.out.println(set.toString());
        
        list.addAll(set);
        System.out.println(list.size());
        System.out.println(list.toString());
        
        set.addAll(list);
        System.out.println(set.size());
        System.out.println(set.toString());
    }
}
