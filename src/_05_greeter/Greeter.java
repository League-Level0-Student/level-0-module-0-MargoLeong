package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null,"What Is Your Name?");
		JOptionPane.showMessageDialog(null,"Hey "+input);
	}

}
