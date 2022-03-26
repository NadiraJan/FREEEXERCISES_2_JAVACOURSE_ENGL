package Part2;

import java.util.*;

public class TwoDarrayList {
    public static void main(String[] args) {

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        System.out.println(bakeryList.get(0)); // result: pasta

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("pepper");
        System.out.println(produceList.get(0));//pasta tomatoes

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("coffee");
        drinksList.add("cola");
        drinksList.add("tea");
        System.out.println(drinksList);//[coffee, cola, tea]

    ArrayList<ArrayList<String>>groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList); // [[pasta, garlic bread, donuts],
        // [tomatoes, zucchini, pepper], [coffee, cola, tea]]
    }
}
