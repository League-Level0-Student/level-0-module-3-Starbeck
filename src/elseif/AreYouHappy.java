package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
	String a = JOptionPane.showInputDialog(null, "Are you happy?");
	if(a.equals("yes") || a.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	
	}
}
