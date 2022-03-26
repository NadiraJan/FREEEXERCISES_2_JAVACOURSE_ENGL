package Part2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class String_klassen {

    public static void main(String[] args) {
        String name = "Bro";
        boolean result = name.equals("bro"); //false want "b"
        boolean result1 = name.equalsIgnoreCase("bro"); //true, met IgnoreCase
        int result2 = name.length(); //3
        char result3 = name.charAt(0);//B
        System.out.println(result2);
        System.out.println(result3);

        int result4 = name.indexOf("o");//2
        System.out.println(result4);

        boolean result5 = name.isEmpty();
        System.out.println(result5);//false is not empty we have "bro"

        String result6 = name.toLowerCase(); //toUpperCase();
        System.out.println(result6);//bro

        String name1 = "    zus    ";
        String result7 = name1.trim();
        System.out.println(result7); //all empty spaces removed with TRIM

        String result8 = name.replace('o', 'a');
        System.out.println(result8); //result is Bra (o is replaced with a)







    }
}
