package GUI_genre;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx01 extends JFrame {
    public TextFieldEx01() {
        setTitle("텍스트필드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름 "));
        c.add(new JTextField(20));  // 20글자 입력 가능
        c.add(new JLabel("학과 "));
        c.add(new JTextField("컴퓨터공학과", 20));
        c.add(new JLabel("주소 "));
        c.add(new JTextField("서울시 ...", 20));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldEx01();
    }
}