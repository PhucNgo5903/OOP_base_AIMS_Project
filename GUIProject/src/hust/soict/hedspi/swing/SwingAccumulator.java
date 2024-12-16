package hust.soict.hedspi.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingAccumulator extends JFrame {
    
    private JTextField tfInputPhucNH;
    private JTextField tfOutputPhucNH;
    private int sumPhucNH = 0;

    // Constructor to setup the GUI components and event handlers
    public SwingAccumulator() {
        Container cpPhucNH = getContentPane();
        cpPhucNH.setLayout(new GridLayout(2,2));

        cpPhucNH.add(new JLabel("Ngo Hoang Phuc 20225903. Enter an Integer: "));

        tfInputPhucNH = new JTextField(10);
        cpPhucNH.add(tfInputPhucNH);
        tfInputPhucNH.addActionListener(new TfInputListenerPhucNH());

        cpPhucNH.add(new JLabel("Ngo Hoang Phuc 20225903. The Accumulated Sum is: "));

        tfOutputPhucNH = new JTextField(10);
        tfOutputPhucNH.setEditable(false);
        cpPhucNH.add(tfOutputPhucNH);
        
        setTitle("Ngo Hoang Phuc 20225903. Swing Accumulator PhucNH");
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingAccumulator();
    }

    private class TfInputListenerPhucNH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int numberInPhucNH = Integer.parseInt(tfInputPhucNH.getText());
            sumPhucNH += numberInPhucNH;
            tfInputPhucNH.setText("");
            tfOutputPhucNH.setText(sumPhucNH +"");
        }
        
    }

}