import javax.swing.JOptionPane;

public class height {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("Enter your height in inches");
		int height2 = Integer.parseInt(height);
		if(height2>60) {
			JOptionPane.showMessageDialog(null,"Enjoy your ride");
		}else {
			JOptionPane.showMessageDialog(null,"Sorry you are too short");
	}

}
}