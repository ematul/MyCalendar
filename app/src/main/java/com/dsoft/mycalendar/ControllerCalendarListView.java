package com.dsoft.mycalendar;

import android.util.Log;

import com.andexert.calendarlistview.library.DatePickerController;

/**
 * Created by enrique on 1/10/14.
 */
public class ControllerCalendarListView implements DatePickerController {

    @Override
    public int getMaxYear() {
        return 2015;
    }

    @Override
    public void onDayOfMonthSelected(int day, int month, int year) {
        Log.e("Day Selected", day + " / " + month + " / " + year);
    }
}
