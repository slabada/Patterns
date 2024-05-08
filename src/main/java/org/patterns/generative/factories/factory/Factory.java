package org.patterns.generative.factories.factory;

import org.patterns.generative.factories.Audi;
import org.patterns.generative.factories.BMW;
import org.patterns.generative.factories.Car;

public class Factory {
    public Car create(String name){
        switch (name){
            case "Audi" -> {
                return new Audi();
            }
            case "BMW" -> {
                return new BMW();
            }
            default -> {
                return null;
            }
        }
    }
}
