package com.example.user.cal1;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalendarView cv1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 = (CalendarView)findViewById(R.id.CV01);
        tv1 = (TextView)findViewById(R.id.TV01);

        cv1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int y, int m, int dm) {
                String date = y+"年"+(m+1)+"月"+dm+"日";
                tv1.setText(date);
            }
        });
    }
}
