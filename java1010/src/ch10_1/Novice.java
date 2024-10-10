package ch10_1;

// Novice의 default 부모 객체는 Object
// 호출은 자식부터 부모 순서, 실행은 부모부터 자식 순서
public class Novice {
    String name;
    int hp;
    void punch() {
        System.out.printf("%s (HP : %d)의 펀치!\n", name, hp);
    }
}