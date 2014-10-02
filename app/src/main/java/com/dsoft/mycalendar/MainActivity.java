package com.dsoft.mycalendar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.andexert.calendarlistview.library.DayPickerView;


public class MainActivity extends Activity implements com.andexert.calendarlistview.library.DatePickerController {

    private DayPickerView dayPickerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayPickerView = (DayPickerView) findViewById(R.id.pickerView);
        dayPickerView.setmController(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public int getMaxYear() {
        return 2015;
    }

    @Override
    public void onDayOfMonthSelected(int day, int month, int year) {
        Log.e("Day Selected", day + " / " + month + " / " + year);
    }
}
