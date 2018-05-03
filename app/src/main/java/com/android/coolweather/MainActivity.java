package com.android.coolweather;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.coolweather.db.City;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button chooseCityFromList;

    private Button locateCityFromGPS;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chooseCityFromList = findViewById(R.id.chooseCityFromList);
        locateCityFromGPS = findViewById(R.id.locateCityFromGPS);
        chooseCityFromList.setOnClickListener(this);
        locateCityFromGPS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == chooseCityFromList) {
            Intent intent = new Intent(MainActivity.this, CityListActivity.class);
            startActivity(intent);
        }else if (v == locateCityFromGPS) {
            Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
            startActivity(intent);
        }
    }
}