package org.patterns.structural.bridge;

public class Car extends Vehicle{
    public Car(Model model) {
        super(model);
    }

    @Override
    public void move() {
        model.move("Car");
    }
}
