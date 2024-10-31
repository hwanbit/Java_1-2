package ch10_8;

import java.time.temporal.TemporalUnit;

public class MainController {

    public static void main(String[] args) {
        Truck truck = new Truck("porter", 1.5);

        truck.move();
        truck.load();
    }
}