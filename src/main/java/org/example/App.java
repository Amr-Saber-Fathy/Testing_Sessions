package org.example;


public class App
{
    static Car bmw;

    public static int variable;

    public static void main( String[] args )
    {
        bmw = new Car();
        Car fiat = new Car();
        variable = 100;
        System.out.println( "Hello World!" );
        System.out.println(Car.addValue(1,2));

        bmw.printCarDetails("BMW", 4);
        fiat.printCarDetails("Fiat", 6);
    }
}
