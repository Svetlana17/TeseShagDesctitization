package com.example.user.teseshagdesctitization;

import android.hardware.Sensor;
import android.hardware.SensorEvent;

public class MySensorEvent {
    public int accuracy;
    public Sensor sensor;
    public long timestamp;
    public  float[] values = null;

    public MySensorEvent(SensorEvent data){
        this.accuracy = data.accuracy;
        this.sensor = data.sensor;
        this.timestamp = data.timestamp;
        this.values = data.values;
    }

}
