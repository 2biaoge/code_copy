package com.qf.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Administrator
 * Thanks for Everything
 */
public class MyDateUtils {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static Date strToDate(String strDate){
        Date parse = null;
        try {
            parse = simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }

    public static String dateToStr(Date date){
        String format = simpleDateFormat.format(date);
        return format;
    }

    public static java.sql.Date dateToSqlDate(Date date){
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }

    public static Date sqlDateToDate(java.sql.Date sqlDate){
        Date date = new Date(sqlDate.getTime());
        return date;
    }

    //
    public static void main(String[] args) {
//        java.util.Date
//        java.sql.Date
        //需求:需要把util的Date 转为 java.sql.Date
        Date date = new Date();

    }


}
