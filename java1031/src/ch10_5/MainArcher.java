package ch10_5;

public class MainArcher {

    public static void main(String[] args) {
        Archer archer1 = new Archer();
        MasterArcher ma = new MasterArcher();
        Archer archer2 = new MasterArcher();
        Archer archer3 = (Archer) new MasterArcher();

        archer1.shoot(); // Archer의 shoot
        ma.shoot(); // MasterArcher의 shoot
        archer2.shoot(); // 오버라이딩된 메소드 호출 => MasterArcher의 shoot
        archer3.shoot(); // Archer를 캐스팅 => MasterArcher의 shoot
    }

}
