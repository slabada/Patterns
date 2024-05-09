package org.patterns.structural.bridge;

public class Truck extends Vehicle {
    public Truck(Model model) {
        super(model);
    }

    @Override
    public void move() {
        model.move("Truck");
    }
}
