package com.ydaniju.lil.learningspring.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class DateUtils {

    public Date createDateFromDateString(String dateString){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (StringUtils.hasText(dateString)){
           try {
               return format.parse(dateString);
           } catch (ParseException e) {
               return new Date();
           }
        }

        return new Date();
    }
}