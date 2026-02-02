package Game;

public class Mage extends Character implements AdditionalMethods{
    public Mage(String name, int age, String gender, String pB, double health, double attackPower, Weapon weapon) {
        super(name, age, gender, pB, health, attackPower, weapon);
    }

    //Methods
    @Override
    public void displayMainData(){

    }

    @Override
    public void heal(){
        double currentHp = this.getHealth();
        this.setHealth(currentHp + 100);
    }

    public void heal(double healAmount){
        double currentHp = this.getHealth();
        this.setHealth(currentHp + healAmount);
    }

    public void heal(int healAmount){
        double currentHp = this.getHealth();
        this.setHealth(currentHp + healAmount);
    }

    @Override
    public void teleport(){
        System.out.println("Player is teleported");
    }

    public void teleport(int xAxis, double yAxis){
        System.out.println("Player is teleported to X = " + xAxis + "and Y = " + yAxis);
        System.out.println("X is the first Parameter");
    }

    public void teleport(double yAxis, int xAxis){
        System.out.println("Player is teleported to X = " + xAxis + "and Y = " + yAxis);
        System.out.println("Y is the first Parameter");
    }

    @Override
    public void attack(){
        System.out.println("Mage Attacked");
    }
}
