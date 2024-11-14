package ch11_5;

public class Bicycle implements Vehicle {

    public void horn() {
        System.out.println("따르릉 따르릉");
    }

    // 인터페이스에 정의된 static 메소드 stop()은 오버라이딩 할 수 없다.
    // 인터페이스에 static 오버라이딩 할 수는 없지만, 현재 클래스에서 정의는 할 수 있다.
    // 사용할 때는 Bicycle.stop()으로 호출하여 사용
    static public void stop(String place) {
        System.out.println(place + "에 자전거가 멈춘다.\n");
    }
}
