package chapter05.test01;

public class SpartaProblem4 {
    public int solution(int age) {
        int currentYear = 2022; // 현재 기준 연도
        int birthYear = currentYear - age + 1; // 출생 연도 계산
        return birthYear; // 출생 연도 반환
    }

    // 메인 메서드 예제 실행
    public static void main(String[] args) {
        SpartaProblem4 sol = new SpartaProblem4();

        // 테스트 케이스 실행
        System.out.println(sol.solution(40)); // 1983
        System.out.println(sol.solution(23)); // 2000
    }
}