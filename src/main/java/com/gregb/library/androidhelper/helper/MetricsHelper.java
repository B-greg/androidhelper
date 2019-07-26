package com.gregb.library.androidhelper.helper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import androidx.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by gregoire on 9/9/14.
 */
public class MetricsHelper {

  public static final double MILE_KM = 1.60934;

    public static int getScreenWidth(Context context){
        Display display = MetricsHelper.getScreenDisplay(context);
        Point size = new Point();
        display.getSize(size);
        return size.x;
    }

    public static int getScreenHeight(Context context){
        Display display = MetricsHelper.getScreenDisplay(context);
        Point size = new Point();
        display.getSize(size);
        return size.y;
    }

    public static Display getScreenDisplay(Context context){
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        return windowManager.getDefaultDisplay();
    }



    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent px equivalent to dp depending on device density
     */
    public static float convertDpToPixel(float dp, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return px;
    }

    /**
     * This method converts device specific pixels to density independent pixels.
     *
     * @param px A value in px (pixels) unit. Which we need to convert into db
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent dp equivalent to px value
     */
    public static float convertPixelsToDp(float px, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = px / (metrics.densityDpi / 160f);
        return dp;
    }

  /**
   * Conver the mile into km.
   * @param mile mile to convert, return 0 if null.
   * @return distance in km
   */
  public static double convertMileToKm(@Nullable Float mile){
    if (mile == null) return 0;
    return mile * MILE_KM;
  }

}
