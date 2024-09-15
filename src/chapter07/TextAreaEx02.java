package chapter07;

import javax.swing.*;
import java.awt.*;

public class TextAreaEx02 extends JFrame {
    public TextAreaEx02() {
        setTitle("텍스트영역 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextField tf = new JTextField(20);
        JTextArea ta = new JTextArea(7, 20);
        c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
        c.add(tf);
        c.add(new JScrollPane(ta));  // 스크롤 추가

        tf.addActionListener(e -> {
            ta.append(tf.getText() + "\n");  // 텍스트 추가
            tf.setText("");  // 입력창 초기화
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaEx02();
    }
}