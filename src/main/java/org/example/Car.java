package org.example;

public class Car {

    double weight = 268.4;

    int noPassengers = 4;

    String color = "Black";

    String type = "BMW";

    public void printCarDetails(String carType, int noPass){
        System.out.println("Car Details: ");
        System.out.println("Car Type: " + carType);
        System.out.println("Car Color: " + color);
        System.out.println("Car No.Passengers: " + noPass);
        System.out.println("Car weight: " + weight);
    }

    public static int addValue(int var1, int var2){
        return var1 + var2;
    }


    public static void main( String[] args )
    {
        Car bmw = new Car();
        Car fiat = new Car();

        System.out.println( "Hello World!" );
        System.out.println(Car.addValue(1,2));

        bmw.printCarDetails("BMW", 4);
        fiat.printCarDetails("Fiat", 6);
    }
}