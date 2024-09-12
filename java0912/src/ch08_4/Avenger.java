package ch08_4;

public class Avenger {

    private String name;
    private int healthPower;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPower() {
        return this.healthPower;
    }

    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
    }

    public Avenger(String name, int healthPower) {
        this.name = name;
        this.healthPower = healthPower;
    }

    public void punch(Avenger enemy) {
        System.out.printf("%s의 펀치!", name);
        enemy.setHealthPower(enemy.getHealthPower()-10);
        System.out.printf(" -> %s의 체력 : %d\n", enemy.getName(), enemy.getHealthPower());
    }
}