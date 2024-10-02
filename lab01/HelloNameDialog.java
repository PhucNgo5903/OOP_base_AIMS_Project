import javax.swing.JOptionPane;
public class HelloNameDialog{
	public static void main(String[] args){
		String result;
		result = JOptionPane.showInputDialog("Ngo Hoang Phuc-5903 Please enter your name:");
		JOptionPane.showMessageDialog(null,"My name is Ngo Hoang Phuc 5903. Hi "+ result + "!");
		System.exit(0);

	}
}