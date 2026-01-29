package Game;

public class GameRunner {

    public static void main(String[] args){

        Weapon weapon = new Weapon("Sword", "image.png");

        Warrior w1 = new Warrior("Ahmed", 25, "Male", "6598700", 4569.2, 123.6, weapon, "Slash Attack");
//        w1.displayDetails();
//
//        w1.poweredAttack();

//        w1.displayMainData();

//        w1.displayFinalVariable();
//        Character ch1 = new Character("Ahmed", 25, "Male", "6598700", 4569.2, 123.6, weapon);

        Mage m1 = new Mage("Ahmed", 25, "Male", "6598700", 4569.2, 123.6, weapon);

        m1.displayDetails();

        System.out.println("========================================");

        Archer ar1 = new Archer("Mohamed", 30, "Male", "6598700", 4569.2, 123.6, weapon);
        ar1.displayDetails();

    }
}
