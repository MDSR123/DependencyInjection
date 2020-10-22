package com.example.dependencyinjection;

import javax.inject.Inject;

// UNCOMMENT to demonstrate constructor injection.
//public class Wheels {
//
//    @Inject
//    public Wheels() {}
//}

// Let's say we don't own the Wheels class (3rd party). Thus, how do we use DI?
public class Wheels {

    // also 2 classes we don't own
    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
