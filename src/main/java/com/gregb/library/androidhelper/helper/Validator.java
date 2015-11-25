package com.gregb.library.androidhelper.helper;

import android.content.Context;
import android.content.res.Configuration;
import java.util.List;

/**
 * Created by gui on 07/08/2014.
 */
public class Validator {
  private static final String TAG = "Validator";

  public static final String SPECIAL_CHARACTERS = "!@#$%^&*()~`-=_+[]{}|:\";',./<>?";

  public static boolean isValid(String s) {
    return s != null && !s.trim().equals("") && !s.trim().equals("null");
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

  public static boolean isValid(List items) {
    return items != null && items.size() > 0;
  }

  public static boolean isValidEmail(String email) {
    return isValid(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
  }

  public static boolean isValidPassword(String password) {
    return password.length() > 4;
  }

  public static boolean isValidLenght(String value, int maxValue, int minValue) {
    if ((maxValue != 0 && value.length() > maxValue) || (minValue != 0
        && value.length() < minValue)) {
      return false;
    }
    return true;
  }

  public static boolean isValidOrEmpty(String string) {
    return string != null && !string.equals("") && !string.equals("null");
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
