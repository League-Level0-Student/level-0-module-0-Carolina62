import javax.swing.JOptionPane;

public class Weekday {
public static void main(String[] args) {
	String week = JOptionPane.showInputDialog("Is it a weekday?");
	if(week.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Sleep In");	
	}else {
	JOptionPane.showMessageDialog(null, "Wake Up");
	
}
}
}
