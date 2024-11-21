package ch11_8;

public class Knight {

    protected String name;
    protected int hp = 100;
    public Knight(String name) {
        this.name = name;
    }
    public void slash() {
        System.out.println(this.name + "의 일반 베기 공격");
    }
}