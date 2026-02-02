package Game;

import java.util.ArrayList;

public class ArrayRunner {

    public static void main(String[] args){

        int num;

        num = 5;

        int[] nums ;

        nums = new int[]{2, 1, 3, 4, 8, 9, 0, 7};

//        for(int i=0; i<nums.length; i++){
//            nums[i] = 5;
//        }
//        for(int i=0; i<nums.length; i++){
//            System.out.println(nums[i]);
//        }
//        System.out.println(nums[10]);
//
//        System.out.println("Hi");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);

//        for(int i=0; i<numbers.size(); i++){
//            System.out.println(i);
//
//        }

        for(int n : numbers){
            System.out.println(n);
        }


        ArrayList<String> names = new ArrayList<>();

        names.add("Ahmed");
        names.add("Ali");
        names.add("Mohamed");

        for(String name : names){
            System.out.println(name);
        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
        names.remove(0);
        for(String name : names){
            System.out.println(name);
        }
    }
}
