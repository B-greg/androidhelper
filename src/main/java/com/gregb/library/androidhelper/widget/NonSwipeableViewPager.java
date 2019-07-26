package com.gregb.library.androidhelper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

/**
 * Created by androiddev01 on 12/21/2015 AD.
 */
public class NonSwipeableViewPager extends ViewPager {

  public NonSwipeableViewPager(Context context) {
    super(context);
  }

  public NonSwipeableViewPager(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override
  public boolean onInterceptTouchEvent(MotionEvent event) {
    // Never allow swiping to switch between pages
    return false;
  }

  @Override
  public boolean onTouchEvent(MotionEvent event) {
    // Never allow swiping to switch between pages
    if (event.getAction() == MotionEvent.ACTION_UP) {
      Log.d("TOUCH", "Up");
    }

    return false;
  }
}
