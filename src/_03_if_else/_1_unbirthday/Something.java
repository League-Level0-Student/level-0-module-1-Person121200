package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Something {
	
public static void main(String[] args) {
	String Input2 = JOptionPane.showInputDialog(null, "When is your birthday" );
	String Input1 = "10/09";
	if (Input2.equals(Input1))  {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
		 
	}
	else JOptionPane.showMessageDialog(null, "Happy Unbirthday");
	}
}

