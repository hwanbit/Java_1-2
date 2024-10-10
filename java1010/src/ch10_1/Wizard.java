package ch10_1;

public class Wizard extends Novice {
    int mp;
    void fireball() {
        // 상속 받았기 때문에 Novice의 name과 hp 사용 가능
        System.out.printf("%s (HP : %d, MP : %d)의 파이어볼 ~~@\n", name, hp, mp);
    }
}