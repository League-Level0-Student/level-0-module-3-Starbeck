//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		String a = JOptionPane.showInputDialog(null, "Do you like bananas?");
		if(a.equals("yes") || a.equals("Yes")) {
			String b = JOptionPane.showInputDialog(null, "What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, b + " is much better with bananas!");
		}else if(a.equals("no") || a.equals("No")) {
			JOptionPane.showMessageDialog(null, "�");
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null, "The question was for a yes/no answer");
			System.exit(0);
		}
		//1. ask the user if they like bananas
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
