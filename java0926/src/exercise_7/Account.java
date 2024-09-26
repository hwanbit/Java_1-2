package exercise_7;

public class Account {
    private String num;
    private int balance;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public String getNum() {
        return num;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean transfer(Account acc, int money) {
        if (this.balance >= money) {
            this.balance -= money;
            acc.balance += money;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account {" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }
}