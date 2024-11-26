import java.util.Scanner;
public class InputFromKeyboard {

	public static void main(String[] args) {
		Scanner keyboardHoangPhuc5903 = new Scanner(System.in);
		
		System.out.println("HoangPhuc5903 What's your name?");
		String strNameHoangPhuc5903 = keyboardHoangPhuc5903.nextLine();
		System.out.println("HoangPhuc5903 How old are you?");
		int iAgeHoangPhuc5903 = keyboardHoangPhuc5903.nextInt();
		System.out.println("HoangPhuc5903 How tall are you (m)?");
		double dHeightHoangPhuc5903 = keyboardHoangPhuc5903.nextDouble();
		
		System.out.println("HoangPhuc5903 Mr/Mrs. " + strNameHoangPhuc5903 + " " + iAgeHoangPhuc5903 + 
				" years old. " + "HoangPhuc5903 Your height is " + dHeightHoangPhuc5903 + "." );
		

	}

}
;