package org.patterns;

import org.patterns.behaviour.observer.DataConsumer;
import org.patterns.behaviour.observer.DataProvider;

public class Main {
    public static void main(String[] args) {

        /**
         * Pattern Factory
         */

//        Factory x = new Factory();
//        x.create("Audi").move();
//        x.create("BMW").move();

        /**
         * Pattern FactoryMethod
         */

//        FactoryMethod audiFactory = new AudiFactory();
//        FactoryMethod BMWFactory = new BMWFactory();
//        audiFactory.create().move();
//        BMWFactory.create().move();

        /**
         * Pattern AbstractFactory
         */

//        AbstractFactoryImpl factory = new AbstractFactoryImpl();
//        factory.createAudi().move();
//        factory.createBMW().move();

/**####################################################################################*/

        /**
         * Pattern Prototype
         */

//        Person person = new Person("Ivan", 16);
//        Person personClone = person.clone();
//        System.out.println(person);
//        System.out.println(personClone);

        /**
         * Pattern Singleton
         */

//        Singleton singleton0 = Singleton.getSINGLETON();
//        Singleton singleton1 = Singleton.getSINGLETON();
//        Singleton singleton2 = Singleton.getSINGLETON();
//
//        SingletonMultiThread singletonMultiThread0 = SingletonMultiThread.singleton();
//        SingletonMultiThread singletonMultiThread1 = SingletonMultiThread.singleton();
//        SingletonMultiThread singletonMultiThread2 = SingletonMultiThread.singleton();

        /**
         * Pattern Builder
         */

//        Cat cat0 = Cat.builder()
//                .age(12)
//                .name("Cat")
//                .build();
//
//        Cat cat1 = Cat.builder()
//                .name("Cat")
//                .build();
//
//        System.out.println(cat0);
//        System.out.println(cat1);

        /**
         * Pattern Iterator
         */

//        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
//        MyList<Integer> integers = new MyList<>(array);
//        for (var x : integers){
//            System.out.println(x);
//        }

        /**
         * Pattern Strategy
         */

//        Context context0 = new Context(new Email());
//        Context context1 = new Context(new SMS());
//        context0.getNotification();
//        context1.getNotification();

        /**
         * Pattern Observer
         */

//        DataProvider provider = new DataProvider(); // Издатель
//        DataConsumer consumer = new DataConsumer(); // Слушаель
//
//        System.out.println("Было - " + consumer.getData());
//
//        provider.addSubscribe(consumer);
//        provider.setData("data");
//
//        System.out.println("Стало - " + consumer.getData());


    }
}