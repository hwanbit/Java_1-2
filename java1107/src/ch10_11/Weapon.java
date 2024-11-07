package ch10_11;

public class Weapon extends Item2{

    String name = "기본 무기";
    int price;
    int power;

    Weapon() {
        power = -1;
    }

    Weapon(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    void print() {
        System.out.printf("[%s] 가격 : %d 골드, 공격력 : %d\n", super.name, price, power);
    }
}