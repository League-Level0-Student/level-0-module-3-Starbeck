import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "What is the current year?");
		String b = JOptionPane.showInputDialog(null, "What year were you born?");
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		for(int i=d; i<=c; i++) {
			JOptionPane.showMessageDialog(null, i);
		}
	}

}
