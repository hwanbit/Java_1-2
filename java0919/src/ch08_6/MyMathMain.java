package ch08_6;

import java.util.Scanner;

public class MyMathMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("첫번째 정수값 : ");
        int n1 = input.nextInt();
        System.out.print("두번째 정수값 : ");
        int n2 = input.nextInt();

        System.out.printf("%d와 %d 중 더 큰 값은 : %d\n", n1, n2, MyMath.max(n1, n2));
        System.out.printf("%d와 %d 중 더 작은 값은 : %d\n", n1, n2, MyMath.min(n1, n2));

        input.close();
    }
}