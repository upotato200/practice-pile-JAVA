package SpartaCoding.test10;

public class SpartaProblem15 {
    public static int solution(int n) {
        // 1부터 n-1까지 탐색하며 n % x == 1을 만족하는 가장 작은 x를 찾음
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return -1; // 문제의 조건 상 이 값은 실행되지 않음
    }

    public static void main(String[] args) {
        // 예시 테스트
        System.out.println(solution(10)); // 3
        System.out.println(solution(12)); // 11
    }
}