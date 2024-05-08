package org.patterns.behaviour.templateMethod;

public abstract class Template {

    public void show(){
        System.out.println("I");
        System.out.println("Love");
        context();
    }

    protected abstract void context();
}
