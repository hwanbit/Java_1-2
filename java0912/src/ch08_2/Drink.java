package ch08_2;

public class Drink {

    private String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Drink (String name, int price) constructor 호출");
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Drink() {
        System.out.println("Default constructor 호출");
    }
}
