package org.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Car {

    List<Car> components = new ArrayList<>();

    public void add(Car component){
        components.add(component);
    }

    public void remove(Car component){
        components.remove(component);
    }

    @Override
    public void move() {
        for (var component : components){
            component.move();
        }
    }
}
