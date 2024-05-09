package org.patterns.structural.bridge;

public abstract class Vehicle {

    protected final Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    public abstract void move();

}
