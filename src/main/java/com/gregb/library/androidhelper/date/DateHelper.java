package com.gregb.library.androidhelper.date;

import androidx.annotation.NonNull;

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
    int positionSeparator = date.indexOf(DATE_SEPARATOR);
    String day = "1";
    if (positionSeparator >= 0 && date.length()>0){
      day = date.substring(0, positionSeparator);
    }
    return Integer.parseInt(day.trim());
  }
  public static int monthFromStringDatePiker(@NonNull String date){
    int positionFirstSeparator = date.indexOf(DATE_SEPARATOR);
    int positionLastSeparator = date.lastIndexOf(DATE_SEPARATOR);
    String month = "1";
    if (positionFirstSeparator >= 0 && positionLastSeparator >= 0 &&  date.length()>0){
      month = date.substring(positionFirstSeparator + 1, positionLastSeparator);
    }
    return Integer.parseInt(month.trim());
  }
  public static int yearFromStringDatePiker(@NonNull String date){
    int positionSeparator = date.lastIndexOf(DATE_SEPARATOR);
    String year = "2000";
    if (positionSeparator >= 0 && date.length()>0){
      year = date.substring(positionSeparator + 1, date.length());
    }
    return Integer.parseInt(year.trim());
  }


}
