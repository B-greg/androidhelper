package com.gregb.library.androidhelper.helper;

/**
 * Created by androiddev01 on 3/15/2016 AD.
 */
public class IntegerHelper {
  public static final String TAG = "IntegerHelper";

  public IntegerHelper() {
  }

  /**
   * Compare if an integer and a int are equals. return false if the integer is null.
   * @param integer integer to compare
   * @param i int to compare
   * @return result
   */
  public static boolean isEqual(Integer integer , int i){
    return integer != null && integer == i;
  }

  /**
   * Compare if an integer and a int are equals. return false if the integer is null.
   * @param i int to compare
   * @param integer integer to compare
   * @return result
   */
  public static boolean isEqual(int i, Integer integer ){
    return isEqual(integer, i);
  }
}
