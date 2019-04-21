
import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "What's your star sign?");
		if(a.equals("Aries") || a.equals("Taurus") || a.equals("Gemini") || a.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "Lowblood.");
		}else if(a.equals("Libra") || a.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Hello, midblood.");
		}else if(a.equals("Sagittarius") || a.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Greetings, highblood.");
		}else if(a.equals("Aquarius") || a.equals("Pisces")) {
			JOptionPane.showMessageDialog(null, "What's a seadweller doing here?");
		}else if(a.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "Shouldn't you be in the caverns?");
		}else if(a.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "Wasn't that sign erradicated?");
		}else {
			JOptionPane.showMessageDialog(null, "Is that from the extended zodiac?");
		}
	}

}
