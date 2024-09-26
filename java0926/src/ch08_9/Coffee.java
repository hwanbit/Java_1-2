package ch08_9;

public class Coffee {
    private String name;
    private int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName() {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}