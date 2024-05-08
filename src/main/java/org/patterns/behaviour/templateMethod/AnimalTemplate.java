package org.patterns.behaviour.templateMethod;

public class AnimalTemplate extends Template {
    @Override
    public void context() {
        System.out.println("Animal");
    }
}
