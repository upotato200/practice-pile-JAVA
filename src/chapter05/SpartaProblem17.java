package chapter05;

import java.util.*;

public class SpartaProblem17 {

    public static int[] solution(long n) {
        // 1. 자연수를 문자열로 변환
        String str = Long.toString(n);

        // 2. 문자열을 역순으로 배열에 담기
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            // 문자를 숫자로 변환 후 배열에 담음
            result[i] = str.charAt(str.length() - 1 - i) - '0';
        }

        return result;
    }

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n))); // 출력: [5, 4, 3, 2, 1]
    }
}