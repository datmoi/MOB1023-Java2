/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author duyplus
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();

        Student sv1 = new Student();
        sv1.name = "Duy";
        sv1.major = "TKW";
        sv1.marks = 9.0;
        Student sv2 = new Student();
        sv2.name = "Thu";
        sv2.major = "TKDH";
        sv2.marks = 5.0;
        Student sv3 = new Student();
        sv3.name = "Dung";
        sv3.major = "CNTT";
        sv3.marks = 7.0;
        map.put(sv1.name, sv1);
        map.put(sv2.name, sv2);
        map.put(sv3.name, sv3);
        
        Set<String> keys = map.keySet();
        for (String name : keys) {
            Student sv = map.get(name);
            System.out.println(">Ho va ten: " + sv.name);
            System.out.println(">Hoc luc: " + sv.getGrade());
        }
    }
}
