package org.patterns.generative.builder;

public class Cat {

    private final String name;
    private final int age;

    private Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Cat build(){
            return new Cat(name, age);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
