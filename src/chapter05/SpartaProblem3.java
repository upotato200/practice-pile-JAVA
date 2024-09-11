package chapter05;

public class SpartaProblem3 {
    public int solution(int num1, int num2) {
        // num1을 num2로 나눈 몫을 계산하여 반환합니다.
        return num1 / num2;
    }

    public static void main(String[] args) {
        SpartaProblem3 sol = new SpartaProblem3();

        // 테스트 케이스 실행
        System.out.println(sol.solution(10, 5)); // 출력: 2
        System.out.println(sol.solution(7, 2));  // 출력: 3
    }
}