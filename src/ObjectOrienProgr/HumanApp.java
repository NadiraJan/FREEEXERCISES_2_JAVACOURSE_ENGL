package ObjectOrienProgr;

public class HumanApp {
    public static void main(String[] args) {

        Human human = new Human("Rick", 32, 53.55);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.weight);
        System.out.println();

        Human human1 = new Human("Morty", 44, 59.22);
        System.out.println(human1.name);

        human1.eat();
        human.drink();
    }
}
