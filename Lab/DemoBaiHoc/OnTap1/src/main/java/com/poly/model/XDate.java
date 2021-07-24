/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author duyplus
 */
public class XDate {

    private static SimpleDateFormat formater = new SimpleDateFormat();

    public static Date parse(String text, String pattern) throws ParseException {
        try {
            formater.applyPattern(pattern);
            return formater.parse(text);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Date parse(String text) throws ParseException {
        return XDate.parse(text, "dd/MM/yyyy");
    }
}
