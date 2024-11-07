package ch10_9;

// 표준화 규격에 맞지 않으면 에러 발생
public class Dog extends Animal {

    public void eat(String food) {
        System.out.println(getName() + "가(이)" + food + "를(을) 먹는다.");
    }

    public void cry(String sound) {
        System.out.println(getName() + "가(이)" + sound + "라고 소리를 낸다.");
    }

    public void wag() {
        System.out.println("꼬리를 살랑살랑 흔든다.");
    }

}
