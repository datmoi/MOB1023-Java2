/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author duyplus
 */
public class XDate {

    public static Date parse(String text) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

        return formater.parse(text);
    }

    public static Date parse(String text, String pattern) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat(pattern);

        return formater.parse(text);
    }
}
