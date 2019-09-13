package _07_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hello=JOptionPane.showInputDialog(null,"What Is Your Name?");
		String input=JOptionPane.showInputDialog(null,"What did you do last summer?");
		JOptionPane.showMessageDialog(null,"I know that you "+input+ "Last summer!"+ hello + "hahaha");
		
	}

}
