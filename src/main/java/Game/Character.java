package Game;

public abstract class Character {

    //Variables
    private String name;
    private int age;
    private String gender;
    private String pB;
    private double health;
    private double attackPower;
    private Weapon weapon;

    private final int x = 5;


    //Getters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

    public String getPB(){
        return this.pB;
    }

    public double getHealth(){
        return this.health;
    }

    public double getAttackPower(){
        return this.attackPower;
    }

    //Setters
    public void setName(String name){
        if (name == null || name.isEmpty()){
            System.out.println("Enter Valid Character Name");
        }else {
            this.name = name;
        }
    }

    public void setGender(String gender){
        if (gender == null || gender.isEmpty()){
            System.out.println("Enter Valid Character Gender");
        }else {
            this.gender = gender;
        }
    }

    public void setPB(String pB){
        if (pB == null || pB.isEmpty()){
            System.out.println("Enter Valid Character PB");
        }else {
            this.pB = pB;
        }
    }

    public void setAge(int age){
        if (age <= 0){
            System.out.println("Invalid Character Age");
        }else {
            this.age = age;
        }
    }

    public void setHealth(double health){
        if (health <= 0){
            System.out.println("Invalid Character Health");
        }else {
            this.health = health;
        }
    }

    public void setAttackPower(double attackPower){
        if (attackPower <= 0){
            System.out.println("Invalid Character Attack Power");
        }else {
            this.attackPower = attackPower;
        }
    }

    //Constructor
    public Character(String name, int age, String gender, String pB, double health, double attackPower, Weapon weapon){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setPB(pB);
        this.setHealth(health);
        this.setAttackPower(attackPower);
        this.weapon = weapon;
    }


    //Methods (Actions)
    private void move(){
        System.out.println("Character Moved");
    }

    private void run(){
        System.out.println("Character is running");
    }

    public void playerMovement(){
        this.move();
        this.attack();
        this.run();
    }

    public void attack(){
        System.out.println("Character Attacked");
    }

    public void defend(){
        System.out.println("Character Defended");
    }

    public void displayDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Gender: " + this.getGender());
        System.out.println("PB: " + this.getPB());
        System.out.println("Health: " + this.getHealth());
        System.out.println("Attack Power: " + this.getAttackPower());
    }

    public void displayFinalVariable(){
        System.out.println(this.x);
    }

    public abstract void displayMainData();

}
