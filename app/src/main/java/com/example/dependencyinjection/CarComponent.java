package com.example.dependencyinjection;

// creates the dependency graph - creates the objects and their order
// creates a Directed Acyclic Graph. The component is also called an Injector, because it provides
// us with the objects

import dagger.Component;

// UNCOMMENT to demonstrate constructor and field injection

//@Component
//public interface CarComponent {
//    // Car is simply the return type here. This is known as a provisional function.
//    // see the DAG for more info
//    //Car getCar();
//
//    // following is necessary for demonstrating field injection.
//    void inject(MainActivity mainActivity);
//}

// Following is when we have a module we want to use
@Component (modules = WheelsModule.class)
public interface CarComponent {
   Car getCar();

    // following is necessary for demonstrating field injection.
    void inject(MainActivity mainActivity);
}