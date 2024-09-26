package ch09_3;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.printf("임의의 정수값 : %d\n", random.nextInt());
        System.out.printf("0 ~ 9 사이의 임의의 정수 : %d\n", random.nextInt(10));
        System.out.printf("1 ~ 10 사이의 임의의 정수 : %d\n", random.nextInt(10)+1);
        System.out.printf("0 ~ 100 사이의 임의의 실수 : %f\n", random.nextDouble(100));
        System.out.printf("임의의 참/거짓 논리값 : %b\n", random.nextBoolean());
    }
}
