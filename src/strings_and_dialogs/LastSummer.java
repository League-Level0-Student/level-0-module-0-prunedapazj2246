package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = JOptionPane.showInputDialog("What is your name");
String str2 = JOptionPane.showInputDialog("What did you do last summer");
JOptionPane.showMessageDialog(null, "I know that you did " + str2 + " last summer" + str + "Muahahaha");
	}

}
