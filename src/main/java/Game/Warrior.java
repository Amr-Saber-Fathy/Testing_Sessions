package Game;

public class Warrior extends Character{

    //Variable
    private String abilityName;

    public Warrior(String name, int age, String gender, String pB, double health, double attackPower, Weapon weapon, String abilityName) {
        super(name, age, gender, pB, health, attackPower, weapon);
        this.setAbilityName(abilityName);
    }

    //Getter
    public String getAbilityName(){
        return this.abilityName;
    }

    //Setter
    public void setAbilityName(String abilityName){
        this.abilityName = abilityName;
    }

    //Method
    public void poweredAttack(){
        System.out.println("Player Attack a powered attack");
    }

    @Override
    public void displayMainData(){
        System.out.println(this.getName());
    }
}
