package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. say something remarkable about each person in a variable.
	String Input1 = "Brian is good at coding";
	String Input2 = "Ryan is smart";
	String Input3 = "Mason loves pandas";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String Input4 = JOptionPane.showInputDialog(null, "Please choose a name: Mason, Ryan, Brian");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if(Input4.equals("Brian")) {
		JOptionPane.showMessageDialog(null, Input1);
		}
	
	if(Input4.equals("Ryan")) {
		JOptionPane.showMessageDialog(null, Input2);
		}
	
	if(Input4.equals("Mason")) {
		JOptionPane.showMessageDialog(null, Input3);
		}
}
}