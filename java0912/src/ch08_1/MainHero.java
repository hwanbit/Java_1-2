package ch08_1;

public class MainHero {

    public static void main(String[] args) {

        Hero ironMan = new Hero("아이언맨", 100, 130);
        Hero hulk = new Hero("헐크", 200, 100);

        System.out.println(ironMan); //print나 println에서는 자동으로 string을 반환
        System.out.println(hulk); //그러므로 hulk.toString()이라고 적을 필요 없음
    }
}