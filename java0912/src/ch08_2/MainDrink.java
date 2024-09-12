package ch08_2;

public class MainDrink {

    public static void main(String[] args) {
        Drink d1 = new Drink();
        Drink d2 = new Drink("콜라", 2500);

        System.out.println(d1);
        System.out.println(d2);
    }
}