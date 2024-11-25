import javax.swing.JOptionPane; 

public class ShowTwoNumbers {
    public static void main(String[] args) {
        
        // Declare variables 
        String strNum1, strNum2;
        // Declare and initialize a string to store the message that will be shown to the user
        String strNotification = "Hello Ngo Hoang Phuc-5903. You've just entered: ";
        
        // Display an input dialog for the first number and store the result in strNum1
        strNum1 = JOptionPane.showInputDialog(null, "Ngo Hoang Phuc 5903, please input the first number: ", 
                                              " Ngo Hoang Phuc 5903 Input the first number", JOptionPane.INFORMATION_MESSAGE);
        // Append the first number to the notification message
        strNotification += strNum1 + " and ";
        
        // Display an input dialog for the second number and store the result in strNum2
        strNum2 = JOptionPane.showInputDialog(null, "Ngo Hoang Phuc 5903, please input the second number: ", 
                                              "Ngo Hoang Phuc 5903 Input the second number", JOptionPane.INFORMATION_MESSAGE);
        
        // Append the second number to the notification message
        strNotification += strNum2;
        
        // Display the notification message in a dialog box showing both numbers entered 
        JOptionPane.showMessageDialog(null, strNotification, 
                                      "Ngo Hoang Phuc 5903 Show 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}