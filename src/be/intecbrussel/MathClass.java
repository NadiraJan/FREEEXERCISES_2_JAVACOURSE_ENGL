package be.intecbrussel;

public class MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double z = Math.min(x, y); //finding min number
        double x1 = Math.max(x, y);//finding max number
        System.out.println(z);    // result: -10;
        System.out.println(x1);   // result: 3.14;

        double w = Math.abs(y);
        System.out.println(w);   // result absolute value of -10 is 10;

        double w1 = Math.sqrt(x);
        System.out.println(w1);   // result: 1.772004514666935 SQUARE ROOT KVADR.KOREN';

        double z2 = Math.round(x);
        System.out.println(z2); //result 3.0
        double z3 = Math.ceil(x);
        System.out.println(z3); // result 4.0
        double z4 = Math.floor(x);
        System.out.println(z4);  // result 3.0

    }
}
