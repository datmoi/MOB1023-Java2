/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author duyplus
 */
public class DataOIStream {
    public static void main(String[] args) {
        String fileName = "dataStream.txt";
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            DataOutputStream dos = new DataOutputStream(fos);
            
            dos.writeInt(100);
            dos.writeDouble(9.5);
            dos.writeChar('b');
            dos.writeUTF("Data Output Stream");
            
            System.out.println("Da ghi xong!\n");
            fos.close(); dos.close();
            
            FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis);
            
            System.out.println("Int: "+dis.readInt());
            System.out.println("Double: "+dis.readDouble());
            System.out.println("Char: "+dis.readChar());
            System.out.println("String: "+dis.readUTF());
            
            System.out.println("\nDa doc xong!");
            dis.close(); fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
