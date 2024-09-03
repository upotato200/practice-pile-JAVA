package chapter04;

import java.util.*;

// 진오님이 진짜 짧은 코드를 1주차 과제로 특별히 내고싶었는데
// 코드가 막 꼬여져버린거같아서 문제였어요
// 튜텨님 난감해하셔서 조 돌아와서 같이해결

public class example {
    public static void main(String[] args) {
        String[] data = new String[12];
        Scanner sc = new Scanner(System.in);
        int i = 0;

        for(i=0;i<data.length;i++) {
            System.out.print("입력하세요 : ");
            data[i] = sc.nextLine();
        }

        double chk = Double.parseDouble(data[1]);

        System.out.println("[" + data[0] + "]");
        System.out.println((int)chk + "(" + (int)chk * (100 / 5.0) + "%)");

        for(i=2;i<data.length;i++) {
            System.out.println(data[i]);
        }
    }
}
