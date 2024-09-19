package ch08_5;

public class Student {
    //공유(static) 영역 할당 : 클래스 변수
    static int count = 0; //static은 보통 상수일 때 많이 사용하므로 final static으로 많이 사용
    //힙(non-static) 영역 할당 : 인스턴스 변수
    int id;
    String name;

    //생성자(constructor)
    Student(int id, String name) {
        Student.count++;
        this.id = id;
        this.name = name;
    }
}
