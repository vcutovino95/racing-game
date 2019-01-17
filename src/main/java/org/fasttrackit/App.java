package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

import java.time.LocalDateTime;


public class App {
    public static void main(String[] args) {



        Game game = new Game();
        game.start();




        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        engine.expiryDate =
                LocalDateTime.now().plusYears(10);

        Car car = new Car(engine);
        car.setName("    Dacia     ");
        car.setColor("White");
        car.doorCount = 4;
        car.setMileage(7.5);
        car.running = true;


        System.out.println(car.toString());
//
//        System.out.println(car.getName());
//
//        double carTraveledDistance
//                = car.accelerate(100, 2);
//
//
//        System.out.println("Hello");
//        System.out.println(car.toString());
//
//
//        car.engine = engine;
//
//        car.engine.manufacturer = "BMW";
//        engine.manufacturer = "Microsoft";
//
//        engine = null;
//
//
//        Car car2 = new Car(new Engine());
//        car2.setName("sfa");
//
//
        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehicleCount = 2;

        Vehicle.vehicleCount = 3;


        System.out.println("Vehicle from vehicle 1;" + vehicle1.vehicleCount);
        System.out.println("Vehicle from vehicle 2;" + vehicle2.vehicleCount);
        System.out.println("Vehicle from Vehicle class;" + Vehicle.vehicleCount);




        new AutoVehicle();


        new AutoVehicle(new Engine());

        // example of invoking overloaded methods
        vehicle1.accelerate(34.12);
        vehicle2.accelerate(130,0.8);

        new UFO().accelerate(130,0.8);

        // polymorphism (an object can take multiple forms)
        Vehicle ufo = new UFO();
        // The type of the variables does NOT determine the object`s behaviour
        ufo.accelerate(200,2);

        // The type of the variable determines what methods can be invoked
        // We might need type casting (see bellow)
        ((UFO) ufo).concealCheating();




    }

}
