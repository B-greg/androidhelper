package com.gregb.library.androidhelper.date;

import android.support.annotation.NonNull;

/**
 * Created by gregoire on 10/5/14.
 */
public class DateHelper {
  public static final String DATE_SEPARATOR = "/";

  public static String datePikerToString(int year, int month, int day){

    String date = "";
    date += day;
    date += DATE_SEPARATOR;
    date += month;
    date += DATE_SEPARATOR;
    date += year;
    return date;

  }

  public static int dayFromStringDatePiker(@NonNull String date){
    String day = date.substring(0, date.indexOf(DATE_SEPARATOR));
    return Integer.parseInt(day);
  }
  public static int monthFromStringDatePiker(@NonNull String date){
    String month = date.substring(date.indexOf(DATE_SEPARATOR) + 1, date.lastIndexOf(DATE_SEPARATOR));
    return Integer.parseInt(month);
  }
  public static int yearFromStringDatePiker(@NonNull String date){
    String year = date.substring(date.lastIndexOf(DATE_SEPARATOR) + 1, date.length());
    return Integer.parseInt(year);
  }


}
