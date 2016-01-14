package com.gregb.library.androidhelper.helper;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import java.util.List;
import java.util.Objects;

/**
 * Created by gui on 07/08/2014.
 */
public class Validator {
  private static final String TAG = "Validator";

  public static final String SPECIAL_CHARACTERS = "!@#$%^&*()~`-=_+[]{}|:\";',./<>?";

  public static boolean isValid(String s) {
    return s != null && !s.trim().equals("") && !s.trim().equals("null");
  }

  public static boolean isValid(Editable s) {
    return s != null;
  }

  public static boolean isValid(Integer i){
    return i != null;
  }

  public static boolean isValid(Boolean b){
    return b != null;
  }

  public static boolean isValid(Long l){
    return l != null;
  }

  public static boolean isValid(Float f){
    return f != null;
  }

  public static boolean isValid(Objects o){
    return o != null;
  }

  public static boolean isValid(List items) {
    return items != null && items.size() > 0;
  }

  public static boolean isValidEmail(String email) {
    return isValid(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
  }

  public static boolean isValidPassword(String password) {
    return password.length() > 8;
  }

  public static boolean isValidLenght(String value, int maxValue, int minValue) {
    if ((maxValue != 0 && value.length() > maxValue) || (minValue != 0
        && value.length() < minValue)) {
      return false;
    }
    return true;
  }

  public static boolean isValidDigit(String s){
    return isValid(s) && s.length() == 1 && isNumeric(s);
  }

  public static boolean isNumeric(String s){
    return s.matches("-?\\d+(\\.\\d+)?");
  }

  public static boolean isValidOrEmpty(String string) {
    return string != null && !string.equals("") && !string.equals("null");
  }


  public static boolean isValidMobile(String number){
    return android.util.Patterns.PHONE.matcher(number).matches();
  }


  public static String validateUrl(String url) {
    if (url != null) {
      if (!url.startsWith("http://") && !url.startsWith("https://")) {
        url = "http://" + url;
      }
    } else {
      url = "http://";
    }
    return url;
  }

  /**
   * Delete + and spaces in the phone number
   */
  public static String changePhone(String phone) {
    if (phone.startsWith("+")) {
      return phone.substring(1).replaceAll(" ", "");
    } else {
      return phone.replaceAll(" ", "");
    }
  }

  public static boolean isSmallScreen(Context c) {
    return (c.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK)
        == Configuration.SCREENLAYOUT_SIZE_SMALL;
  }

  public static boolean isNormalScreen(Context c) {
    return (c.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK)
        == Configuration.SCREENLAYOUT_SIZE_NORMAL;
  }

  public static boolean isLandscape(Context c) {
    return c.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE;
  }
}
