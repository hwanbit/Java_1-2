package ch10_9;

// 추상클래스 : 자식 클래스들을 표준화시키기 위해서 만듦
// 표준화 : 특정 기능을 반드시 갖게 하는 것
abstract public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 추상메소드
    public abstract void eat(String food);
    public abstract void cry(String sound);
    public void sleep(int hours) {
        System.out.printf("%d시간 동안 자다.", hours);
    }
}
