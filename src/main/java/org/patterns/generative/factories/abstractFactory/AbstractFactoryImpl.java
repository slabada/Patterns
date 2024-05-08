package org.patterns.generative.factories.abstractFactory;

import org.patterns.generative.factories.Audi;
import org.patterns.generative.factories.BMW;
import org.patterns.generative.factories.Car;

public class AbstractFactoryImpl implements AbstractFactory{
    @Override
    public Car createAudi() {
        return new Audi();
    }

    @Override
    public Car createBMW() {
        return new BMW();
    }
}
