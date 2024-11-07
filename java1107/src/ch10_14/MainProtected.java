package ch10_14;

import ch10_14.pack2.Weapon;

public class MainProtected {

    public static void main(String[] args) {
        Weapon w = new Weapon("대검", 6000, 50);
        w.print();
    }
}