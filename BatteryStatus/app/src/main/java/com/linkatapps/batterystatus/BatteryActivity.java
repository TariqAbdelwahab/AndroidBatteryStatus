package com.linkatapps.batterystatus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class BatteryActivity extends AppCompatActivity {

TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);



        ((TextView) findViewById(R.id.tvBatteryCharge)).setText(String.valueOf(BatteryInfo.isCharging(BatteryActivity.this)));
        ((TextView) findViewById(R.id.tvBatteryPerc)).setText(String.valueOf(BatteryInfo.getBatteryLevel(BatteryActivity.this))+"%");

    }
}
