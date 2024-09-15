package GUI_genre;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    public LabelEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel textLabel = new JLabel("사랑합니다.");
        ImageIcon beauty = new ImageIcon("images/beauty.jpg");
        JLabel imageLabel = new JLabel(beauty);

        c.add(textLabel);
        c.add(imageLabel);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelEx();
    }
}