public class MainSquare {

    public static void main(String[] args) {

        // Object, Shape, Square 객체의 필드와 메서드 접근 가능
        Square square = new Square();
        
        // 업캐스팅을 하면 자식 클래스의 오버라이딩 되지 않은 메서드는 사용 불가
        // Shape 객체의 필드와 메서드 접근 가능 (예외적으로 Square 객체의 멤버 접근 가능한 방법 : 오버라이딩)
        Shape shape = new Square();
    }
}
