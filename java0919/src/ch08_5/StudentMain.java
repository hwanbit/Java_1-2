package ch08_5;

public class StudentMain {

    public static void main(String[] args) {
        Student park = new Student(2019122104, "park");
        Student kim = new Student(2019206028, "Kim");
        Student lee = new Student(2019153237, "Lee");
        System.out.printf("Student 객체의 수: %d", Student.count);
    }
}