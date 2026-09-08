package dev.portfolio.designpattern.mvc.calculator.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalcView extends JFrame {

    // 텍스트 입력 칸
    private final JTextField firstNumField = new JTextField();
    private final JTextField secondNumField = new JTextField();
    private final JTextField thirdNumField = new JTextField();
    private final JButton plusButton = new JButton("더하기");
    private final JLabel resultLabel = new JLabel("결과는 ~!");

    public CalcView() {
        setSize(330, 200);
        setLayout(null);

        // 프로그램 닫았을 때 프로세스까지 제거되도록 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컴포턴트 위치, 크기 설정
        // setBounds(창의 왼쪽에서 50, 위쪽에서 50, 필드 폭 40, 높이 40)
        firstNumField.setBounds(50, 50, 40, 40);
        secondNumField.setBounds(100, 50, 40, 40);
        thirdNumField.setBounds(150, 50, 40, 40);
        plusButton.setBounds(200, 50, 80, 40);
        resultLabel.setBounds(50, 100, 200, 40);

        add(firstNumField);
        add(secondNumField);
        add(thirdNumField);
        add(plusButton);
        add(resultLabel);

        // 창을 화면 중앙에 배치
        setLocationRelativeTo(null);
        // 프레임이 화면에 보이도록 설정
        setVisible(true);
    }

    public void addPlusButtonListener(ActionListener listener) {
        plusButton.addActionListener(listener);
    }

    public String getFirstNumText() {
        return firstNumField.getText();
    }

    public String getSecondNumText() {
        return secondNumField.getText();
    }

    public String getThirdNumText() {
        return thirdNumField.getText();
    }

    public void showResult(int result) {
        resultLabel.setText("결과는 " + result + " 입니다.");
    }
}
