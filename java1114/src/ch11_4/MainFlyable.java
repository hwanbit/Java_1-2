package ch11_4;

import java.util.ArrayList;

public class MainFlyable {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter hc = new Helicopter();
        Rocket rc = new Rocket();

        // 배열에 각 개체의 참조값을 저장한다.
        Flyable[] flyables = {bird, hc, rc};

        for (Flyable flyable : flyables) {
            flyable.fly();
        }

        System.out.println("=========================================");
        ArrayList<Flyable> flyablesList = new ArrayList<Flyable>();
        flyablesList.add(bird);
        flyablesList.add(hc);
        flyablesList.add(rc);

        for (Flyable flyable : flyablesList) {
            flyable.fly();
        }
    }
}