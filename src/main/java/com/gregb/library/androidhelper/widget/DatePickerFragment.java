package com.gregb.library.androidhelper.widget;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import java.util.Calendar;

/**
 * Created by androiddev01 on 12/8/2015 AD.
 */
public class DatePickerFragment extends DialogFragment
    implements DatePickerDialog.OnDateSetListener {
  public static final String TAG = "DatePickerFragment";

  public OnDateSetListener mOnDateSetListener;

  public DatePickerFragment() {
  }

  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    // Use the current date as the default date in the picker
    final Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DAY_OF_MONTH);

    // Create a new instance of DatePickerDialog and return it
    return new DatePickerDialog(getActivity(), this, year, month, day);
  }

  public void onDateSet(DatePicker view, int year, int month, int day) {
    if (mOnDateSetListener != null) mOnDateSetListener.onDateSet(year, month, day);
  }

  public void setOnDateSetListener(OnDateSetListener onDateSetListener) {
    mOnDateSetListener = onDateSetListener;
  }

  public interface OnDateSetListener {
    void onDateSet(int year, int month, int day);
  }
}
