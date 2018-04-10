import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Hello what is your name?");
        JOptionPane.showMessageDialog(null,"Nice to meet you" + name) ;
	}

}
