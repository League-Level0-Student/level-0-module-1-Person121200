package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		JOptionPane.showMessageDialog(null, "Welcome to riddles, please type your answer in all lower case withought 'a or an' Thank You");
		String riddle = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");
		String answer = "stamp";
		
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle.equals(answer)) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 1;
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Sorry, you are incorrect     The correct answer is 'stamp' ");
		}
		// 6. Add some more riddles
		
		String riddle1 = JOptionPane.showInputDialog(null, "What What has many keys but can't open a single lock?");
		String answer1 = "piano";
		
		if (riddle1.equals(answer1)) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 1;
		}
		else {
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect     The correct answer is 'piano' ");
			}
			
		
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

