package dev.portfolio.designpattern.mvc.lotto.view;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.List;

public class LottoView extends JFrame {

    private final JButton generateButton = new JButton("번호 생성");
    private final JLabel numbersLabel = new JLabel("번호를 생성해 주세요.");

//    private final JTextField num1 = new JTextField();
//    private final JTextField num2 = new JTextField();
//    private final JTextField num3 = new JTextField();
//    private final JTextField num4 = new JTextField();
//    private final JTextField num5 = new JTextField();
//    private final JTextField num6 = new JTextField();

    public LottoView() {
        setTitle("로또 번호 추천기");
        setSize(400, 150);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 35));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(generateButton);
        add(numbersLabel);
//        add(num1);
//        add(num2);
//        add(num3);
//        add(num4);
//        add(num5);
//        add(num6);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void addGenerateButtonListener(ActionListener listener) {
        generateButton.addActionListener(listener);
    }

    public void showNumbers(List<Integer> numbers) {
        numbersLabel.setText(numbers.toString());
    }
}
