package Part2;

public class UponMethod {
    public static void main(String[] args) {
        hello("jkljlajl ", 22);
        hello("fjlal ", 23);
        String name = "Bro ";
        int age = 0;
        hello(name, age);
        age = 21;
        hello(name, age);

    }
    static void hello(String name, int age){
        System.out.println("Hello  " + name +age);
    }
}
