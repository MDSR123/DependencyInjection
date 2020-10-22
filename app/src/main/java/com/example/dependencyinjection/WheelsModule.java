package com.example.dependencyinjection;

import dagger.Module;
import dagger.Provides;

// Rims and Tires are both 3rd party libraries in our example. This means we can't modify them directly.
// Thus, we annotate a class with @Module which
// Modules are a way of telling Dagger how to provide dependencies to the dependency graph.
// These are typically high level dependencies that you aren't already contributing to the
// dependency graph through @Inject

@Module
public class WheelsModule {

    // this annotation used for functions inside a module. Tells dagger how to create Rims
    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate(); // will just call the function in the class
        return tires;
    }

    // because Dagger knows how to create rims and tires thanks to the above methods, we can pass them
    @Provides
    Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
