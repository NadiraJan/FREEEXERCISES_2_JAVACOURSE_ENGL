package be.intecbrussel;

import java.util.Scanner;

public class whileStatement {
    public static void main(String[] args) {

     /*   Scanner kbd = new Scanner(System.in);
        String name = "";
        while(name.isBlank()) { //condition
            System.out.print("Enter your name");
            name = kbd.nextLine();

        }
        System.out.println("Hello " + name);*/

        Scanner kbd = new Scanner(System.in);
        String name = "";

         do {
             System.out.println("Enter your name");
             name = kbd.nextLine();
         }while (name.isBlank()); {
        }
        System.out.println("Hello " + name);

    }
}
