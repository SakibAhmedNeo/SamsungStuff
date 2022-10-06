package com.example.task2acc;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements SensorEventListener{
    TextView xAxisText, yAxisText, zAxisText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        Sensor accSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        sensorManager.registerListener(this, accSensor, SensorManager.SENSOR_DELAY_NORMAL);

    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        xAxisText = findViewById(R.id.xAxisText);
        yAxisText = findViewById(R.id.yAxisText);
        zAxisText = findViewById(R.id.zAxisText);

        xAxisText.setText("X-Axis: " + sensorEvent.values[0]);
        yAxisText.setText("Y-Axis: " + sensorEvent.values[1]);
        zAxisText.setText("Z-Axis: " + sensorEvent.values[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}