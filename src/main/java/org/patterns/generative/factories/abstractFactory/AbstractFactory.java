package org.patterns.generative.factories.abstractFactory;

import org.patterns.generative.factories.Car;

public interface AbstractFactory {
    Car createAudi();
    Car createBMW();
}
