package com.gregb.library.androidhelper.helper;

import java.util.List;

/**
 * Created by androiddev01 on 11/17/2015 AD.
 */
public class Convertor {

  public static int toPrimitive(Integer i){
    return Validator.isValid(i) ? i : 0;
  }

  public static boolean toPrimitive(Boolean b){
    return Validator.isValid(b) ? b : false;
  }
  public static long toPrimitive(Long l){
    return Validator.isValid(l) ? l : 0;
  }
  public static float toPrimitive(Float f){
    return Validator.isValid(f) ? f : 0;
  }

  public static double toPrimitive(Double d){
    return Validator.isValid(d) ? d : 0;
  }

  public static String notNullAllowEmpty(String s) {
    return Validator.isValidOrEmpty(s) ? s : "";
  }

  public static String notNull(String s) {
    return Validator.isValid(s) ? s : "";

  }

  public static String stringToIntString(String s) {
    return Validator.isValid(s) ? s : "0";
  }

  public static int stringToInt(String s) {
    return Validator.isValid(s) ? Integer.valueOf(s) : 0;
  }

  public static String toStandartUrl(String url) {
    if (url != null) {
      if(url.startsWith("//")){
        url = "http:" + url;
      }else if (!url.startsWith("http://") && !url.startsWith("https://")) {
        url = "http://" + url;
      }
    } else {
      url = "http://";
    }
    return url;
  }
}
