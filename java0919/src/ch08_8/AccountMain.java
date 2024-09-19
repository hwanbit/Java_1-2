package ch08_8;

import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("5글자로 계좌 번호를 입력하세요 : ");
        String accNum = scanner1.nextLine();
        System.out.print("이름을 입력하세요 : ");
        String name = scanner1.nextLine();
        System.out.print("4글자로 비밀번호를 입력하세요 : ");
        String password = scanner1.nextLine();
        System.out.print("입금할 금액을 입력하세요 : ");
        int balance = scanner2.nextInt();

        Account account = new Account(accNum, name, password, balance);

        System.out.println(account);

        System.out.print("출금할 금액을 입력하세요 : ");
        account.withdraw(scanner2.nextInt());
        System.out.printf("현재 잔액 : %d원\n", account.getBalance());

        System.out.print("입금할 금액을 입력하세요 : ");
        account.deposit(scanner2.nextInt());
        System.out.printf("현재 잔액 : %d원\n", account.getBalance());

        scanner1.close();
        scanner2.close();
    }
}
