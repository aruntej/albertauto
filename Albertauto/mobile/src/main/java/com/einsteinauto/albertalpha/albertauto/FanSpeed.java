package com.einsteinauto.albertalpha.albertauto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbDevice;


public class FanSpeed extends AppCompatActivity {
    UsbDeviceConnection connection = new UsbDeviceConnection(<Create Device-connection>);
    UsbDevice device = new UsbDevice(<create device here>)
    MyDriver myDriver = new MyDriver(<Device>);

    byte [] readArray = new byte[200];
    byte [] writeArray = new byte[200];

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

        myDriver.open(connection);
        myDriver.read(readArray, 1000);
        myDriver.write(writeArray, 1000);
        myDriver.close();




    }
    public void onClickDecreaseFanSpeed(View view){
        TextView FanAction = (TextView) findViewById(R.id.FanAction);
        Spinner AirCon = (Spinner) findViewById(R.id.AirCon);
        String AC_Status = String.valueOf(AirCon.getSelectedItem());
        String output_message = AC_Status + " Decreased Fan Speed";
        FanAction.setText(output_message);

        myDriver.open(connection);
        myDriver.read(readArray, 1000);
        myDriver.write(writeArray, 1000);
        myDriver.close();

    }
}
