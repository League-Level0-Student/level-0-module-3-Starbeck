import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot c = new Robot();
	public static void main(String[] args) {
		c.setWindowColor(125,125,125);
		bgColor();
		c.penDown();
		c.setSpeed(10);
		//c.setPenWidth(7);
		chooseColor();
		shapeChoice();
		runAgain();
		c.hide();
	}
	static void drawSquare() {
		for (int i = 0; i <+ 4; i++) {
			c.turn(90);
			c.move(50);
		}
	}
	static void chooseColor() {
		String a = JOptionPane.showInputDialog(null, "What color do you want the robot to draw in?");
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
		}else if(a.equals("rgb") || a.equals("RGB")) {
			String b = JOptionPane.showInputDialog(null, "Input Red Value");
			int d = Integer.parseInt(b);
			String e = JOptionPane.showInputDialog(null, "Input Green Value");
			int f = Integer.parseInt(e);
			String g = JOptionPane.showInputDialog(null, "Input Blue Value");
			int h = Integer.parseInt(g);
			c.setPenColor(d, f, h);
		}else{
			JOptionPane.showMessageDialog(null, "No known color input. \nSelecting random color.");
			c.setRandomPenColor();
		}
	}
	static void bgColor() {
		String a = JOptionPane.showInputDialog(null, "What color do you want the background to be?");
	if(a.equals("red") || a.equals("Red")) {
		c.setWindowColor(255,0,0);
	}else if(a.equals("orange") || a.equals("Orange")) {
		c.setWindowColor(255,105,0);
	}else if(a.equals("yellow") || a.equals("Yellow")) {
		c.setWindowColor(255,255,0);
	}else if(a.equals("green") || a.equals("Green")) {
		c.setWindowColor(0,255,0);
	}else if(a.equals("blue") || a.equals("Blue")) {
		c.setWindowColor(0,0,255);
	}else if(a.equals("purple") || a.equals("Purple")) {
		c.setWindowColor(150,0,255);
	}else if(a.equals("pink") || a.equals("Pink")) {
		c.setWindowColor(255,145,175);
	}else if(a.equals("white") || a.equals("White")) {
		c.setWindowColor(255,255,255);
	}else if(a.equals("black") || a.equals("Black")) {
		c.setWindowColor(0,0,0);
	}else if(a.equals("gray") || a.equals("Gray")) {
		c.setWindowColor(125,125,125);
	}else if(a.equals("rgb") || a.equals("RGB")) {
		String b = JOptionPane.showInputDialog(null, "Input Red Value");
		int d = Integer.parseInt(b);
		String e = JOptionPane.showInputDialog(null, "Input Green Value");
		int f = Integer.parseInt(e);
		String g = JOptionPane.showInputDialog(null, "Input Blue Value");
		int h = Integer.parseInt(g);
		c.setWindowColor(d, f, h);
	}else if(a.equals("default") || a.equals("Default")) {
	}else{
		JOptionPane.showMessageDialog(null, "No known color input. \nUsing Default Settings.");
		
	}
	}
	static void shapeChoice() {
		String a = JOptionPane.showInputDialog(null, "What shape do you want the robot to draw?\n(square, Triange, or Star)");
		if(a.equals("square") || a.equals("Square")) {
			drawSquare();
		}else if(a.equals("triangle") || a.equals("Triangle") || a.equals("T")) {
			drawTriangle();
		}else if(a.equals("star") || a.equals("Star")) {
			drawStar();
		}
	}
	static void runAgain() {
		String a = JOptionPane.showInputDialog(null, "Do you want to draw another shape? Input draw to draw another shape, bg to change background color, ink to change pen color, or exit to exit.");
		if(a.equals("bg")) {
			bgColor();
			runAgain();
		}else if(a.equals("draw")) {
			c.setAngle(90);
			c.move(75);
			shapeChoice();
			runAgain();
		}else if(a.equals("ink")) {
			chooseColor();
			runAgain();
		}else if(a.equals("exit")) {
			System.exit(1);
		}
	}
	static void drawTriangle() {
		c.setAngle(150+180);
		c.move(50);
		c.turn(240);
		c.move(50);
		c.turn(240);
		c.move(50);
		c.hide();
		c.turn(240);
		c.move(50);
		c.turn(360);
	}
	static void drawStar() {
		c.setAngle(160);
		for(int i=0; i<5; i++) {
			c.move(50);
			c.turn(144);
		}
	}
}
