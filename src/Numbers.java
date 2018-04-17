import javax.swing.JOptionPane;

public class Numbers {
public static void main(String[] args) {
	String numbers = JOptionPane.showInputDialog("Enter a number");
	int numbers2 = Integer.parseInt(numbers);
	String number = JOptionPane.showInputDialog("Enter another number");
	int numbers3 = Integer.parseInt(number);
	JOptionPane.showInputDialog(null, numbers2 + numbers3);
	
}
}