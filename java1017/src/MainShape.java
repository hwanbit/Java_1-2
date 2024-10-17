import java.sql.Array;
import java.util.ArrayList;

public class MainShape {

    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";

        Triangle t = new Triangle();
        t.name = "삼각형";

        Circle c = new Circle();
        c.name = "원형";

        // 참조변수의 선언을 부모 클래스로 하면 업캐스팅 => 참조의 범위가 달라진다
        // Shape s1 = new Square();

        // ArrayList로 자식 객체 관리
        ArrayList <Shape> shapes = new ArrayList<Shape>();
        shapes.add(s);
        shapes.add(t);
        shapes.add(c);

        // 배열로 자식 객체 관리
        //Shape[] shapes = {s, t, c};

        for (int i=0; i < shapes.size(); i++) {
            System.out.printf("Index %d 번의 도형 이름 : %s\n", i, shapes.get(i).name);
        }
    }
}
