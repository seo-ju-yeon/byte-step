package dev.portfolio.designpattern.mvc.lotto.view;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.List;

public class LottoView extends JFrame {

    private final JButton generateButton = new JButton("번호 생성");
    private final JLabel numbersLabel = new JLabel("번호를 생성해 주세요.");
    private final JTextField winningNumbersField = new JTextField(15);
    private final JTextField bonusNumberField = new JTextField(3);
    private final JButton checkResultButton = new JButton("당첨 확인");
    private final JLabel rankLabel = new JLabel("당첨 결과");

    public LottoView() {
        setTitle("로또 번호 추천기");
        setSize(500, 220);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 35));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(generateButton);
        add(numbersLabel);

        add(new JLabel("당첨 번호"));
        add(winningNumbersField);

        add(new JLabel("보너스"));
        add(bonusNumberField);

        add(checkResultButton);
        add(rankLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void addGenerateButtonListener(ActionListener listener) {
        generateButton.addActionListener(listener);
    }

    public void addCheckResultButtonListener(ActionListener listener) {
        checkResultButton.addActionListener(listener);
    }

    public String getWinningNumbersText() {
        return winningNumbersField.getText();
    }

    public String getBonusNumberText() {
        return bonusNumberField.getText();
    }

    public void showNumbers(List<Integer> numbers) {
        numbersLabel.setText(numbers.toString());
    }

    public void showRank(String rank) {
        rankLabel.setText("당첨 결과: " + rank);
    }

}
