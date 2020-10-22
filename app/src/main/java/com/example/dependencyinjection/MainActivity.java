package com.example.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // FOLLOWING IS CONSTRUCTOR INJECTION. UNCOMMENT to see how it works
//    private Car car;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // implementation for our interface
//        CarComponent component = DaggerCarComponent.create();
//        car = component.getCar();
//        car.drive();
//    }

    // FOLLOWING IS FIELD INJECTION
    // tells Dagger that we want this car variable to be injected with a car object.
    // variable CANNOT be private or else the generated DAG won't be able to access
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // implementation for our interface
        CarComponent component = DaggerCarComponent.create();
        // tells dagger to pass activity to component and inject the variables that are annotated with @Inject (so car)
        component.inject(this);
        car.drive();
    }
}