package chapter06;

import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame {
    private String[] fruits = {"사과", "바나나", "키위", "망고", "배", "복숭아"};

    public ComboBoxEx() {
        setTitle("콤보박스 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JComboBox<String> fruitCombo = new JComboBox<>(fruits);  // 콤보박스 생성
        c.add(fruitCombo);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxEx();
    }
}