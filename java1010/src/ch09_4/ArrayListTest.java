package ch09_4;

// ArrayList API 불러오기
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // String 저장을 위한 ArrayList 객체 생성
        ArrayList<String> names = new ArrayList<String>();

        // String 데이터 추가
        names.add("Kim");
        names.add("Park");
        names.add("Lee");
        names.add("Jung");

        // set : 1번 인덱스 데이터를 "Han"으로 변경
        names.set(1, "Cha");
        // remove : 2번 인덱스 데이터 제거 후, 해당 값 반환
        // names.remove(2);
        String removed = names.remove(2);
        System.out.println("삭제된 요소 : " + removed);

        // ArrayList에 담긴 데이터의 개수 반환
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%d번째 %s\n", i, names.get(i));
        }
    }
}