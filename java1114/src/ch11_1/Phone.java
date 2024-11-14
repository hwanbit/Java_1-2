package ch11_1;

// 인터페이스는 상수, 추상메소드, default, static 메소드 등을 사용할 수 있습니다.
// 상수는 final과 static을 생략할 수 있습니다.
public interface Phone {
    // 상수 (static final 키워드 생략 가능), 필드 선언은 무조건 상수로 받아들임
    String PRODUCT_NAME = "Apple";
    // 추상 메소드
    abstract public void callPhone(String phoneNumber);
    // abstract와 public 키워드 생략 가능
    void receivePhone(String phoneNumber);
}
