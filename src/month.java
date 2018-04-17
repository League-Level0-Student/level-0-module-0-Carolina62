import javax.swing.JOptionPane;
public class month {
	public static void main(String[] args) {
	String month = JOptionPane.showInputDialog("Enter the month of your birthday");
			if(month.equalsIgnoreCase("April")) {
	JOptionPane.showMessageDialog(null, "You are cool");		
			}else {
				JOptionPane.showConfirmDialog(null, "You are not cool");
	}
	}
}
