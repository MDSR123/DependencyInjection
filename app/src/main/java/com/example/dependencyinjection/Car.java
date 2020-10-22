package com.example.dependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;

    // this annotation can be used only on a single constructor
    // Dagger now knows that this is how the car object should be instantiated - it can now
    // inject this constructor - but first it needs to know how to instantiate Engine and Wheels
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "driving...");
    }
}
