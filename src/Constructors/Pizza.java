package Constructors;

public class Pizza {

    String bread;
    String saus;
    String cheese;
    String topping;

    public Pizza(String bread, String saus) {
        this.bread = bread;
        this.saus = saus;


    }

    public Pizza(String bread, String saus, String cheese) {
        this.bread = bread;
        this.saus = saus;
        this.cheese = cheese;
    }

    public Pizza(String bread, String saus, String cheese, String topping) {
        this.bread = bread;
        this.saus = saus;
        this.cheese = cheese;
        this.topping = topping;


    }

}