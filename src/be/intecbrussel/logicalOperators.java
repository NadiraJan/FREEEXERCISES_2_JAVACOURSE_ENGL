package be.intecbrussel;

import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {

        /*&& = AND  both conditions must be true
        || = OR either condition must be true
         ! = NOT reverses boolean value of condition*/


     /*   int temp = 15;
        if(temp>30){
            System.out.println("it is not outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("it is warm outside");
        }
        else {
            System.out.println("it is cold outside"); //result it is cold outside
        }*/

    /*    Scanner kbd = new Scanner(System.in);
        System.out.println("You are playing a game! press q or Q to quit");
        String response = kbd.next();
        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("you are still playing the game *pew pew*");

            //result: You quit the game
        }*/

        Scanner kbd = new Scanner(System.in);
        System.out.println("You are playing a game! press q or Q to quit");
        String response = kbd.next();
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("you are still playing the game *pew pew*");
        } else {

            System.out.println("You quit the game");
    }
}
}