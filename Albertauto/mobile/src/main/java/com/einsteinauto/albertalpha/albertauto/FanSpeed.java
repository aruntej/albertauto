package com.einsteinauto.albertalpha.albertauto;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FanSpeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fan_speed);
    }
    public void onClickIncreaseFanSpeed(View view){
        TextView FanAction = (TextView) findViewById(R.id.FanAction);
        Spinner AirCon = (Spinner) findViewById(R.id.AirCon);
        String AC_Status = String.valueOf(AirCon.getSelectedItem());
        String output_message = AC_Status + " Incresed Fan Speed";
        FanAction.setText(output_message);

    }
    public void onClickDecreaseFanSpeed(View view){
        TextView FanAction = (TextView) findViewById(R.id.FanAction);
        Spinner AirCon = (Spinner) findViewById(R.id.AirCon);
        String AC_Status = String.valueOf(AirCon.getSelectedItem());
        String output_message = AC_Status + " Decreased Fan Speed";
        FanAction.setText(output_message);

    }
}
