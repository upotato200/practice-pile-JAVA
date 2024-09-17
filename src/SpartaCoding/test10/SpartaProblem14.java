package SpartaCoding.test10;

public class SpartaProblem14 {
    public static int solution(int n) {
        int sum = 0;

        // 1부터 n까지의 숫자 중 n의 약수를 찾아 합을 구함
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // 예시 테스트
        System.out.println(solution(12)); // 28
        System.out.println(solution(5));  // 6
    }
}