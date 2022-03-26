package be.intecbrussel;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
    /*    int x = random.nextInt(6)+1;
        System.out.println(x); //result: 3 random between 1 and 6*/

        /*double y = random.nextDouble();
        System.out.println(y); // result 0.05299017706748077 between 0 and 1*/

        boolean z = random.nextBoolean();
        System.out.println(z); //result false, true
    }
}
