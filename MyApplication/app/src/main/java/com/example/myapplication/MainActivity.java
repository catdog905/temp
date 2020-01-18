package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity implements RotationGestureDetector.OnRotationGestureListener {
    private RotationGestureDetector mRotationDetector;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRotationDetector = new RotationGestureDetector(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        mRotationDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public void OnRotation(RotationGestureDetector rotationDetector) {
        float angle = rotationDetector.getAngle();
        Log.d("RotationGestureDetector", "Rotation: " + Float.toString(angle));
    }

}
