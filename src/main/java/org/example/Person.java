package org.example;

public class Person {

    public String personName;
    public int personAge;
    public String personNationalID;

    public Person(String name, int age, String nationalID){
        personName = name;
        personAge = age;
        personNationalID = nationalID;
    }

    public void printDetails(){
        System.out.println(personName);
        System.out.println(personAge);
        System.out.println(personNationalID);
    }


    public static void main(String[] args){
        Person p1 = new Person("Ahmed", 25, "452148978451");
        p1.printDetails();

        Person p2 = new Person("Mohammed", 26, "4441111111");
        p2.printDetails();
    }

}
