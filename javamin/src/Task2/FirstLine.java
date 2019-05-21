package Task2;

import java.awt.GridLayout;
import javax.swing.*;
/**
 * This if the first line of my GUI.
 * It contains two labels.
 * One is about the amount of problems while the other is about the score.
 * @author Yiwen Zhan
 *
 */
public class FirstLine extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JLabel label1;
	static JLabel label2; 
	
	/**
	 * constructor
	 */
	public FirstLine() {		
		this.setLayout(new GridLayout(1,0));			
		addAmountLabel();
		addScoreLabel();
	}
	/**
	 * This method will be called by ProblemsInterface and change the amount of problems.
	 */
	public void addAmountLabel() {
		label1 = new JLabel("Amount of problems:" + 0,JLabel.CENTER);
		this.add(label1);	
	}
	/**
	 * This method will be called by ProblemsInterface and change the amount of right answers.
	 */
	public void addScoreLabel() {
		label2 = new JLabel("Your score:" + 0,JLabel.CENTER);
		add(label2);	
	}
	/**
	 * This method will be called by ProblemsInterface and change the number of label1.	
	 */
	public static void changeAmount() {
		label1.setText("Amount of problems:" + MathTeacher.proNumb);
	}
	/**
	 * This method will be called by ProblemsInterface and change the number of label2.	
	 */
	public static void changeScore() {
		label2.setText("Your score:" + MathTeacher.rightNumb);
	}	
}

