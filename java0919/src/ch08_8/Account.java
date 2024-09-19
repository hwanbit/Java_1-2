package ch08_8;

public class Account {

    private int balance;
    private String accNum;
    private String name;
    private String password;

    public int getBalance() {
        return balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        balance -= money;
    }

    public Account(String accNum, String name, String password, int balance) {
        this.accNum = accNum;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accNum='" + accNum + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
