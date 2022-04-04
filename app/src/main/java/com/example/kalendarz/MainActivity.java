package com.example.kalendarz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        CalendarView calendar;
        TextView  dataWys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar= (CalendarView) findViewById(R.id.calendarView);
        dataWys =(TextView) findViewById(R.id.wysDATA);


        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String Date = (month+1) + "/" + dayOfMonth + "/" + year;
                dataWys.setText(Date);

            }
        });
    }
}