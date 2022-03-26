import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        // a loop inside of a loop

        Scanner kbd = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter # of rows");
        rows = kbd.nextInt();
        System.out.println("Enter # of columns");
        columns = kbd.nextInt();
        System.out.println("enter symbol to use");
        symbol = kbd.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
// result:  Enter # of rows
//4
//Enter # of columns
//5
//enter symbol to use
//
//$
//
//$$$$$
//$$$$$
//$$$$$
//$$$$$