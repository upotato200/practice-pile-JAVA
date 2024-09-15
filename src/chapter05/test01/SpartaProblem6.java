package chapter05.test01;

public class SpartaProblem6 {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        SpartaProblem6 sol = new SpartaProblem6();

        // 예제 테스트 케이스
        int result1 = sol.solution(2, 3);
        int result2 = sol.solution(100, 2);

        // 결과 출력
        System.out.println("result1: " + result1);
        // 출력: result1: 5
        System.out.println("result2: " + result2);
        // 출력: result2: 102
    }
}