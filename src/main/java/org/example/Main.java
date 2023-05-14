package org.example;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle  = VehicleFactory.getVehicle("Car");
        printVehicleCapacity(vehicle);
    }

    static void printVehicleCapacity(Vehicle vehicle){

        // if vehicle is null, the below statement will give null pointer exception... so you
        // would have to add if vehicle!= null condition.... but with this pattern, we create a
        // default class that implements the vehicle interface and handles the case when vehicle
        // is null or invalid types... the default type returns 0 (default value)

        System.out.println("Tank capacity is "+ vehicle.getFuelCapacity());
        System.out.println("Seating capacity is "+ vehicle.getSeatingCapacity());

    }
}