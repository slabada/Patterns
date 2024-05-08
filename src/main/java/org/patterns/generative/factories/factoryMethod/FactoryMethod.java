package org.patterns.generative.factories.factoryMethod;

import org.patterns.generative.factories.Car;

public abstract class FactoryMethod {

    public Car create(){
        return createFactory();
    }

    protected abstract Car createFactory();
}
