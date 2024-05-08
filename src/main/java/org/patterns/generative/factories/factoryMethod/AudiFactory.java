package org.patterns.generative.factories.factoryMethod;

import org.patterns.generative.factories.Audi;
import org.patterns.generative.factories.Car;

public class AudiFactory extends FactoryMethod{
    @Override
    protected Car createFactory() {
        return new Audi();
    }
}
