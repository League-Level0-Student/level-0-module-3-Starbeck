package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
	String a = JOptionPane.showInputDialog(null, "Are you happy?");
	if(a.equals("yes") || a.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}if(a.equals("no") || a.equals("No")) {
		String b = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		if(b.equals("yes") || b.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}if(b.equals("no") || b.equals("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}

	}
	
	}
}
