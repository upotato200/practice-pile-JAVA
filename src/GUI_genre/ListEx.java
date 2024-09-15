package GUI_genre;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
    private String[] fruits = {"사과", "배", "키위", "망고", "배", "복숭아", "딸기"};

    public ListEx() {
        setTitle("리스트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JList<String> fruitList = new JList<>(fruits);  // 문자열 리스트 생성
        c.add(fruitList);

        JList<String> scrollList = new JList<>(fruits);  // 스크롤 가능한 리스트
        c.add(new JScrollPane(scrollList));

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListEx();
    }
}
