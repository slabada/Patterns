package org.patterns;

import org.patterns.behaviour.state.Context;
import org.patterns.behaviour.state.GreenState;
import org.patterns.behaviour.state.RedState;
import org.patterns.behaviour.state.YellowState;

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
         * Pattern State
         */

//        Context context = new Context();
//        context.setState(new GreenState());
//        context.transition(new GreenState(), new YellowState());
//        context.nextState();
//        context.transition(new GreenState());


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

        /**
         * Pattern Template Method
         */

//        Template money = new MoneyTemplate();
//        Template animal = new AnimalTemplate();
//        money.show();
//        animal.show();

        /**
         * Pattern Adapter
         */

//        Radio radio = new Radio();
//        UsaSocket usaSocket = new UsaSocketImpl();
//        EuroSocket euroSocket = new EuroSocketImpl();
//        EuroSocket socketAdapter = new SocketAdapter(usaSocket);
//        radio.listenerMusic(socketAdapter);

        /**
         * Pattern Bridge
         */

//        Vehicle vehicle = new Car(new Audi());
//        vehicle.move();
//        Vehicle vehicle1 = new Truck(new BMW());
//        vehicle1.move();

        /**
         * Pattern Decorator
         */

//        Shape circle = new Circle();
//        Decorator decorator = new Red(circle);
//        decorator.draw();
//        Decorator decorator1 = new Blue(circle);
//        decorator1.draw();

        /**
         * Pattern Composite
         */

//        Car audi = new Audi();
//        Car BMW = new BMW();
//
//        Composite composite0 = new Composite();
//        composite0.add(audi);
//        composite0.add(BMW);
//
//        Composite composite1 = new Composite();
//        composite1.add(composite0);
//
//        composite0.move();

        /**
         * Pattern Proxy
         */

//        Report dailyReport = new DailyReport();
//        Report proxy = new ProxyDailyReport(dailyReport);
//        String report = proxy.prepareReport(LocalDate.now());
//        System.out.println(report);

        /**
         * Pattern Command
         */

//        Computer computer = new Computer();
//
//        User user = new User(
//                new RestartCommand(computer),
//                new StartCommand(computer),
//                new StopCommand(computer)
//        );
//
//        user.restartComputer();
//        user.stopComputer();
//        user.startComputer();
    }
}