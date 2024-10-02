import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
			int optionHoangPhuc5903 = JOptionPane.showConfirmDialog(null,
					"HoangPhuc5903 Do you want to change to the first class ticket?");
			
			JOptionPane.showMessageDialog(null, "HoangPhuc5903 You've chosen: " 
			+ (optionHoangPhuc5903==JOptionPane.YES_OPTION ? "HoangPhuc5903 Yes": "HoangPhuc5903 No"));
	System.exit(0);
	}
}
