package ExampleCode;

import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBookHashMap = new HashMap<>();

        //데이터 추가
        phoneBookHashMap.put("상현","010-1234-5678");
        phoneBookHashMap.put("민준","010-0000-1111");

        //데이터 확인
        System.out.println("상현의 번호: " + phoneBookHashMap.get("상현"));
        //중복 Key -> 덮기
        phoneBookHashMap.put("상현", "010-9999-8888");
        System.out.println("상현의 새 번호: " + phoneBookHashMap.get("상현"));
        //없는 Key 조회 -> null
        System.out.println("성은 번호: " + phoneBookHashMap.get("성은"));
    }
}
