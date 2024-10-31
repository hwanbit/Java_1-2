package ch10_6;

import java.util.ArrayList;

public class MainController {

    public static void main(String[] args) {

        Square square = new Square();
        square.name = "정사각형";
        square.setWidth(7);

        Triangle triangle = new Triangle();
        square.name = "삼각형";
        triangle.setWidth(15);
        triangle.setHeight(9);

        Circle circle = new Circle();
        square.name = "원형";
        circle.setRadius(15);

        // ArrayList 사용
//        ArrayList<Shape> arrList = new ArrayList<Shape>();
//        arrList.add(square);
//        arrList.add(triangle);
//        arrList.add(circle);
//        viewShapes(arrList);
        
        // 배열 사용
        Shape[] arr = {square, triangle, circle};
        viewShapes(arr);
    }

    // ArrayList 사용
//    public static void viewShapes(ArrayList<Shape> arrList) {
//        for (Shape shape : arrList) {
//            System.out.printf("%s의 면적은 %.2f㎠\n", shape.name, shape.area());
//        }
//    }

    // 배열 사용
        public static void viewShapes(Shape[] arrList) {
        for (Shape shape : arrList) {
            System.out.printf("%s의 면적은 %.2f㎠\n", shape.name, shape.area());
        }
    }
}
