package ch10_9;

public class Cat extends Animal{

    public void eat(String food) {
        System.out.println(getName() + "가(이)" + food + "를(을) 먹는다.");
    }

    public void cry(String sound) {
        System.out.println(getName() + "가(이)" + sound + "라고 소리를 낸다.");
    }

    public void grooming() {
        System.out.println(getName() + "가(이) 그루밍을 한다.");
    }
}