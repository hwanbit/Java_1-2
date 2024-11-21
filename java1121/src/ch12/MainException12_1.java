package ch12;

public class MainException12_1 {

    public static void main(String[] args) {
        String[] arr = {"봄", "여름", "가을", "겨울"};
        // for
        for (int i = 0; i < arr.length; i++) {
            System.out.println("현재 계절 : " + arr[i]);
        }

        // foreach
        for (String season:arr) {
            System.out.print(season + " ");
        }
        System.out.println();

        // ArrayIndexOutOfBoundsException 예외 발생
        // System.out.println(arr[4]);

        // 예외가 처리되고 지정한 문구가 실행됨
        try {
            System.out.println(arr[4]);
        }
        catch (ArithmeticException e) {
            System.out.println("산술 연산이 잘못 되었습니다. 나눔수를 0으로 하면 안 됩니다.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스 번호가 너무 큽니다.");
        }
        catch (Exception e) {
            System.out.println("산술 또는 배열과 관련되지 않은 예외는 여기서 처리합니다.");
        }

        System.out.println(arr[2]);
        System.out.println("프로그램이 종료됩니다.");
    }
}