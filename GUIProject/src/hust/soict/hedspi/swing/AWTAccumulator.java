package hust.soict.hedspi.swing;
import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {
    
    private TextField tfInputPhucNH;
    private TextField tfOutputPhucNH;
    private int sumPhucNH = 0;

    // Constructor to setup the GUI components and event handlers
    public AWTAccumulator() {
        setLayout(new GridLayout(2,2));

        add(new Label("Ngo Hoang Phuc 20225903. Enter an Integer: "));

        tfInputPhucNH = new TextField(10);
        add(tfInputPhucNH);
        tfInputPhucNH.addActionListener(new TfInputListenerPhucNH());

        add(new Label("Ngo Hoang Phuc 20225903. The Accumulated Sum is: "));

        tfOutputPhucNH = new TextField(10);
        tfOutputPhucNH.setEditable(false);
        add(tfOutputPhucNH);

        setTitle("Ngo Hoang Phuc 20225903. AWT Accumulator PhucNH");
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTAccumulator();
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