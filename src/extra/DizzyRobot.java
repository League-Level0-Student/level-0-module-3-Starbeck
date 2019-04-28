//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		robot.setSpeed(25);
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String a = JOptionPane.showInputDialog(null, "On a scale of 1-10,\n how dizzy do you want the robot to be?");
int b = Integer.parseInt(a);
if(b<=10 && b>0) {
	dance(b);
} else {
	JOptionPane.showMessageDialog(null, "That is not between 1 and 10.");
}

 // 1. Use the dance method to make the robot spin.
	

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

