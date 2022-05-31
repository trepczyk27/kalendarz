package com.example.kalendarz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Calendar calendar;
        CalendarView calendarview;
        TextView  dataWys,textWys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendar = Calendar.getInstance();


        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 9);
        calendar.set(Calendar.YEAR, 2012);


        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.YEAR, 1);




        calendarview= (CalendarView) findViewById(R.id.calendarView);
        dataWys =(TextView) findViewById(R.id.wysDATA);
        textWys=(TextView) findViewById(R.id.wysTekst);

        calendarview.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String Date = (month+1) + "/" + dayOfMonth + "/" + year;
                dataWys.setText(Date);

            }
        });
        calendarview.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                String msg = "Selected date Day: " + i2 + " Month : " + (i1 + 1) + " Year " + i;
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();


            }
        });

    }

    }
