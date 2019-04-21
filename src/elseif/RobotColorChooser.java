//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

//import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot c = new Robot(); 
		c.hide();
		c.setSpeed(100);
		c.turn(180+90);
		c.move(50);
		c.turn(180);
		//3. Ask the user what color they would like the robot to draw
		c.show();
		c.penDown();
		c.setSpeed(10);
		String a = JOptionPane.showInputDialog(null, "What color would you like the robot to draw in?");
		//5. Use an if/else statement to set the pen color that the user requested
if(a.equals("red") || a.equals("Red")) {
	c.setPenColor(255,0,0);
}else if(a.equals("orange") || a.equals("Orange")) {
	c.setPenColor(255,105,0);
}else if(a.equals("yellow") || a.equals("Yellow")) {
	c.setPenColor(255,255,0);
}else if(a.equals("green") || a.equals("Green")) {
	c.setPenColor(0,255,0);
}else if(a.equals("blue") || a.equals("Blue")) {
	c.setPenColor(0,0,255);
}else if(a.equals("purple") || a.equals("Purple")) {
	c.setPenColor(150,0,255);
}else if(a.equals("pink") || a.equals("Pink")) {
	c.setPenColor(255,145,175);
}else if(a.equals("white") || a.equals("White")) {
	c.setPenColor(255,255,255);
}else if(a.equals("black") || a.equals("Black")) {
	c.setPenColor(0,0,0);
}else if(a.equals("gray") || a.equals("Gray")) {
	c.setPenColor(125,125,125);
}else{
	//JOptionPane.showMessageDialog(null, "No color detected. \nSetting color to pencil gray.");
	//c.setPenColor(85,85,85);
	c.setRandomPenColor();
}
//c.turn(240);
//c.move(50);
//c.turn(180);
for(int i=0; i<5; i++) {
	if(i<4) {
		c.penDown();
		c.move(100);
		c.turn(144);
	}else {
		c.penDown();
		c.move(100);
	}
	
}
c.hide();
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
