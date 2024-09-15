package chapter05.test10;

import java.util.List;
import java.util.ArrayList;

public class SpartaProblem16 {
    public static List<Long> solution(int x, int n) {
        List<Long> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add((long) x * i); // 각 단계에서 x의 배수를 추가
        }
        return result;
    }

    public static void main(String[] args) {
        // 테스트 예시
        System.out.println(solution(2, 5)); // [2, 4, 6, 8, 10]
        System.out.println(solution(4, 3)); // [4, 8, 12]
        System.out.println(solution(-4, 2)); // [-4, -8]
    }
}