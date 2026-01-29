package Game;

public class Archer extends Character {

    public Archer(String name, int age, String gender, String pB, double health, double attackPower, Weapon weapon) {
        super(name, age, gender, pB, health, attackPower, weapon);
    }

    @Override
    public void displayMainData() {

    }

    @Override
    public void displayDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Gender: " + this.getGender());
        System.out.println("PB: " + this.getPB());
    }

    public void displayDetails(int x){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Gender: " + this.getGender());
        System.out.println("PB: " + this.getPB());
    }
}
