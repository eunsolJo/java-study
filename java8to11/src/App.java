import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        String[] names = {"esjo", "cho", "jeo"};
        // 1. 익명함수
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0; // 구현
            }
        });

        // 2. 람다
        Arrays.sort(names, (o1, o2) -> 0);

        // 3. 메소드 참조
        // - compareToIgnoreCase : 자기자신과 파라미터 String 값을 비교해서 int 값을 넘겨줌
        // - compare함수와 파라미터+리턴값이 동일
        Arrays.sort(names, String::compareToIgnoreCase);
    }
}
