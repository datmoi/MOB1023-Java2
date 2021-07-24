/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author duyplus
 */
public class XFile {

    public static Object readObject(String path){
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            if(fis.available() > 0){
                ObjectInputStream ois = new ObjectInputStream(fis);
                obj = ois.readObject();
                fis.close();
                ois.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            return obj;
        }
    }

    public static void writeObject(String path, Object obj) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            fos.close();
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
