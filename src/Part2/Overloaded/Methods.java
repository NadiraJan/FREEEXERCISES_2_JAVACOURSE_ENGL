package Part2.Overloaded;

public class Methods {
    public static void main(String[] args) {

        //overloaded methods

        double x = add((int) 1.0, (int) 2.0, (int) 3.0, (int) 4.0);
        System.out.println(x); //result 10.0


    }

    static double add(double a, double b){
        return a+b;
    }
    static int add(int a, int b,int c){
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
