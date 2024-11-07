package ch10_9;

public class MainAnimal {
    
    public static void main(String[] args) {
        
        // 추상클래스는 new 연산자로 객체 생성 불가
        // Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("멍멍");
        dog.sleep(5);
        dog.wag();

        cat.setName("페르시안");
        cat.eat("츄르");
        cat.cry("야옹");
        cat.sleep(8);
        cat.grooming();

        // 업캐스팅 : 부모 클래스의 모든 멤버 사용 가능
        // 그러나 자식클래스의 멤버로는 오버라이딩 된 부모클래스의 메소드만 사용 가능
        Animal animal = new Dog();
        
        // animal.wag(); 불가
    }
}