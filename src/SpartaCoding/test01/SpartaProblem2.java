package SpartaCoding.test01;

public class SpartaProblem2 {
    public int solution(int num1, int num2) {
        // 입력값 범위 체크
        if (check(num1) && check(num2)) {
            // 연산
            return num1 * num2;
        }
        // 범위 밖의 값이 주어졌을 경우 예외 처리를 위한 반환값 (문제의 조건상 필요하지 않음)
        return 0;
    }

    private boolean check(int num) {
        return num >= 0 && num <= 100;
    }

    public static void main(String[] args) {
        SpartaProblem2 solution = new SpartaProblem2();

        // 테스트 케이스 1
        int result1 = solution.solution(3, 4);
        System.out.println("결과: " + result1); // 출력: 결과: 12

        // 테스트 케이스 2
        int result2 = solution.solution(27, 19);
        System.out.println("결과: " + result2); // 출력: 결과: 513
    }
}