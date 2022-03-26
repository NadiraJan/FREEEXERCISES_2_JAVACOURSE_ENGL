package Part2;

import java.util.ArrayList;

public class arrayLIst_ {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

food.set(0, "sushi"); //sushi, hamburger, hotdog

        food.remove(2);// sushi , hamburger
        food.clear(); // empty all of them is cleared
        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i)); //result pizza
                                            // hamburger
                                            // hotdog


        }
    }
}
