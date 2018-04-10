import javax.swing.JOptionPane;

public class IntroToInputOutput {
 public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello");
    String enter= JOptionPane.showInputDialog("Enter number")	;
    JOptionPane.showMessageDialog(null,"WOW!" + enter + "is a lot!");
    System.out.println(enter);
    
 }
}
