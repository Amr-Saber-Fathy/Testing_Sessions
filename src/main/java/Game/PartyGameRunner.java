package Game;

public class PartyGameRunner {

    public static void main(String[] args){

        Weapon w1 = new Weapon("Sword", "image");
        Character ch1 = new Warrior("Ali", 25, "Male", "546900", 569.2, 126.3, w1, "Slash");
        Character ch2 = new Mage("Ali", 25, "Male", "546900", 569.2, 126.3, w1);
        Character ch3 = new Archer("Ali", 25, "Male", "546900", 569.2, 126.3, w1);

        Character[] party = {ch1, ch2, ch3};

        for(int i=0; i < party.length; i++){
            party[i].attack();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$");
        }
    }
}
