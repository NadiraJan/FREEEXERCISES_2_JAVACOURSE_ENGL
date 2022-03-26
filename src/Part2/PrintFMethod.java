package Part2;

public class PrintFMethod {
    public static void main(String[] args) {

        //   System.out.printf("This is a format string %d", 123);
        //result: This is a format string 123

        //  System.out.printf("%d this is a format string",123);
        // result: 123 this is a format string

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int MyInt = 50;
        double myDouble = 1000;
        System.out.printf("%b", myBoolean); //true
        System.out.printf("%c", myChar);  //@
        System.out.printf("%s", myString); //Bro
        System.out.printf("%d", MyInt); //RESULT : 50
        System.out.printf("%f", myDouble);//1000.000000

        System.out.printf("Hello %-10s", myString);
        // Hello   Bro (10 spaces between Hello and Bro because %10)
    }
}
