package org.patterns.generative.factories.factoryMethod;

import org.patterns.generative.factories.BMW;
import org.patterns.generative.factories.Car;

public class BMWFactory extends FactoryMethod {
    @Override
    protected Car createFactory() {
        return new BMW();
    }
}
