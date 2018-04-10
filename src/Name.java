import javax.swing.JOptionPane;

public class Name {
public static void main(String[] args) {
	String word = JOptionPane.showInputDialog("Do you know how to code?");
	
	if(word.equals("yes")) {
		JOptionPane.showMessageDialog(null, "You will rule the world");
	}else {
		JOptionPane.showMessageDialog(null,"Practice Mopping Floors");
 }
}
}
