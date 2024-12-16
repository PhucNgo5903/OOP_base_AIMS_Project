package hust.soict.hedspi.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbersPhucNH = new JButton[10];
    private JButton btnDeletePhucNH, btnResetPhucNH;
    private JTextField tfDisplayPhucNH;

    public NumberGrid() {

        tfDisplayPhucNH = new JTextField();
        tfDisplayPhucNH.setPreferredSize(new Dimension(200, 30));
        tfDisplayPhucNH.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtonsPhucNH = new JPanel(new GridLayout(4, 3));
        addButtons(panelButtonsPhucNH);

        Container cpPhucNH = getContentPane();
        cpPhucNH.setLayout(new BorderLayout());
        cpPhucNH.add(tfDisplayPhucNH, BorderLayout.NORTH);
        cpPhucNH.add(panelButtonsPhucNH, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ngo Hoang Phuc 20225903. Number Grid");
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberGrid();
    }

    void addButtons(JPanel panelButtonsPhucNH) {
        ButtonListenerPhucNH btnListenerPhucNH = new ButtonListenerPhucNH();
        for (int i = 1; i <= 9; i++) {
            btnNumbersPhucNH[i] = new JButton("" + i);
            panelButtonsPhucNH.add(btnNumbersPhucNH[i]);
            btnNumbersPhucNH[i].addActionListener(btnListenerPhucNH);
        }

        btnDeletePhucNH = new JButton("DEL");
        panelButtonsPhucNH.add(btnDeletePhucNH);
        btnDeletePhucNH.addActionListener(btnListenerPhucNH);

        btnNumbersPhucNH[0] = new JButton("0");
        panelButtonsPhucNH.add(btnNumbersPhucNH[0]);
        btnNumbersPhucNH[0].addActionListener(btnListenerPhucNH);

        btnResetPhucNH = new JButton("C");
        panelButtonsPhucNH.add(btnResetPhucNH);
        btnResetPhucNH.addActionListener(btnListenerPhucNH);
    }

    private class ButtonListenerPhucNH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonPhucNH = e.getActionCommand();
            if (buttonPhucNH.charAt(0) >= '0' && buttonPhucNH.charAt(0) <= '9') {
                tfDisplayPhucNH.setText(tfDisplayPhucNH.getText() + buttonPhucNH);
            } else if (buttonPhucNH.equals("DEL")) {
                String deleteStringPhucNH = tfDisplayPhucNH.getText();
                if (deleteStringPhucNH.length() > 0) {
                    deleteStringPhucNH = deleteStringPhucNH.substring(0, deleteStringPhucNH.length() - 1);
                }
                tfDisplayPhucNH.setText(deleteStringPhucNH);
            } else {
                tfDisplayPhucNH.setText("");
            }
        }
    }

    public static String delLastCharacterPhucNH(String strPhucNH) {
        if ((strPhucNH != null) && (strPhucNH.length() > 0)) {
            return strPhucNH.substring(0, strPhucNH.length() - 1);
        }
        return null;
    }
}