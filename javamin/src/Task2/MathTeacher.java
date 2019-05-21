package Task2;

import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Random;
import java.util.regex.Pattern;

import javax.swing.*;

/**
 * Title : MathTeacher.java Description: This class contains the method and GUI
 * of MathTeacher. Copyright : Copyright (c) 2018
 * 
 * @author Yiwen Zhan
 * @version 1.0
 * @author Yiwen Zhan
 * @version 2.0
 */

public class MathTeacher implements ActionListener {

	// Declaration of instance variables and components of GUI.
	public int resultNum = 0;
	public static int proNumb;
	public static int rightNumb;

	FirstLine myfirstlint = new FirstLine();
	JFrame myFrame = new JFrame();
	JButton myButton = new JButton("Press for answer");
	JTextField myTextField = new JTextField(3);
	JLabel questionLabel = new JLabel("Question:" + questions(), JLabel.LEFT);
	JLabel myLabel = new JLabel();
	JPanel keyPenal = new JPanel(new GridLayout(4, 3));
	
	JButton jbutton_key1 = new JButton("1");
	JButton jbutton_key2 = new JButton("2");
	JButton jbutton_key3 = new JButton("3");
	JButton jbutton_key4 = new JButton("4");
	JButton jbutton_key5 = new JButton("5");
	JButton jbutton_key6 = new JButton("6");
	JButton jbutton_key7 = new JButton("7");
	JButton jbutton_key8 = new JButton("8");
	JButton jbutton_key9 = new JButton("9");
	JButton jbutton_sub = new JButton("-");
	JButton jbutton_key0 = new JButton("0");
	
	
	JButton jbutton_delete = new JButton("c");

	/**
     *  Constructor
     */
	public MathTeacher() {
		//using the absolute layout
		myFrame.setLayout(null);
		//setting size for the keyPanel and jbutton_key1
		keyPenal.setSize(180, 180);
		jbutton_key1.setSize(20, 20);
		//using anonymous inner class as event handler for jbutton_key1
		jbutton_key1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "1";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_key2
		jbutton_key2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "2";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_key3
		jbutton_key3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "3";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_key4
		jbutton_key4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "4";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_key5
		jbutton_key5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "5";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_key6
		jbutton_key6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "6";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_key7
		jbutton_key7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "7";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_key8
		jbutton_key8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "8";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_key9
		jbutton_key9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "9";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_sub
		jbutton_sub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(myTextField.getText().length()==0)
					myTextField.setText("-");
				
			}
		});
		//using anonymous inner class as event handler for jbutton_key0
		jbutton_key0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				s = s + "0";
				myTextField.setText(s);
			}
		});
		//using anonymous inner class as event handler for jbutton_delete
		jbutton_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = myTextField.getText();
				if(s.length()==0)
					myTextField.setText("");
				else {
					s=s.substring(0, s.length()-1);
					myTextField.setText(s);
				}
			}
		});
		//setting size and location for other components
		jbutton_key1.setSize(20, 20);
		jbutton_key2.setSize(20, 20);
		jbutton_key3.setSize(20, 20);
		jbutton_key4.setSize(20, 20);
		jbutton_key5.setSize(20, 20);
		jbutton_key6.setSize(20, 20);
		jbutton_key7.setSize(20, 20);
		jbutton_key8.setSize(20, 20);
		jbutton_key9.setSize(20, 20);
		jbutton_key0.setSize(20, 20);
		jbutton_sub.setSize(20, 20);
		jbutton_delete.setSize(20,20);
		keyPenal.add(jbutton_key1);
		keyPenal.add(jbutton_key2);
		keyPenal.add(jbutton_key3);
		keyPenal.add(jbutton_key4);
		keyPenal.add(jbutton_key5);
		keyPenal.add(jbutton_key6);
		keyPenal.add(jbutton_key7);
		keyPenal.add(jbutton_key8);
		keyPenal.add(jbutton_key9);
		keyPenal.add(jbutton_sub);
		keyPenal.add(jbutton_key0);
		keyPenal.add(jbutton_delete);
		myFrame.setBounds(400, 400, 480, 400);
		keyPenal.setLocation(40, 100);
		myButton.setBounds(40, 300, 150, 50);
		myTextField.setBounds(40, 50, 150, 50);
		questionLabel.setBounds(200, 50, 250, 50);
		myfirstlint.setBounds(40, 20, 300, 20);
		myLabel.setBounds(200, 300, 250, 50);
		jbutton_delete.setBounds(250, 250, 80, 40 );
		myFrame.add(myTextField);
		myFrame.add(questionLabel);
		myFrame.add(myButton);
		myFrame.add(myLabel);
		myFrame.add(myfirstlint);
		myFrame.add(keyPenal);
 
		//settings for the frame
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setTitle("MathTeacher");

	}

	/** This is event handler method for the program. It makes sure the input is valid.  
     * @param ActionEvent e
     */	
	public void actionPerformed(ActionEvent e) {
		String old = myTextField.getText();
		//Exception handling
		 String firsts = old.substring(0,1);
		 if(firsts.equals("-")) {
			 old = old.substring(1, old.length());
		 }
		 if (!old.equals("")) {
			 
			 String firstsec = old.substring(0,1);
			 if(!firstsec.equals("")) {
				 try {
					 int answer = Integer.parseInt(old);
					 if (answer > 100)
						 myLabel.setText("Please input an integer less than 100!");
				 } catch (NumberFormatException e1) {
					 myLabel.setText("Please input an integer!"); 
				 }
				 
			 }
		 }
		//keep record of the number of problems and right answers
		if (myTextField.getText().length() == 0) {
		} 
		else if (isNumeric(myTextField.getText())) {

			int getNum = Integer.parseInt(myTextField.getText());
			if (this.resultNum == getNum) {
				++rightNumb;
				++proNumb;
				
				myLabel.setText("Right!");
				FirstLine.changeAmount();
				FirstLine.changeScore();

				questionLabel.setText("Question:" + questions());
				myTextField.setText(null);
			} else if(getNum<=100){
				proNumb++;
				
				myLabel.setText("Wrong!Right answer is "+resultNum);
					
				FirstLine.changeAmount();
				questionLabel.setText("Question:" + questions());
				myTextField.setText(null);
			

			}
			else if (getNum>100) {
				myLabel.setText("Please input an integer between -9 and 100!");
			}
		}

	}
	
	/** This is  isNumeric method for the program. It judges if the text is a number.  
     * @param String text
     * @return boolean if the text is a number,return true, else return false
     */	
	private boolean isNumeric(String text) {
		Pattern pattern = Pattern.compile("^(\\-){0,1}\\d+$"); 
		 return pattern.matcher(text).matches(); 
	}
	
	/** This is  questions method for the program. It generates arithmetic questions randomly.
     * @return String An arithmetic question
     */	
	private String questions() {
		Random random = new Random();
		int num1 = random.nextInt(9) + 1;
		int num2 = random.nextInt(9) + 1;
		int sizeof = random.nextInt(4);
		String operator = "";
		if (sizeof == 0) {
			operator = "+";
			resultNum = num1 + num2;
		}
		
		if (sizeof == 1){   
            operator = "-";
            resultNum = num1 - num2;
            }
		if (sizeof == 2) {
			operator = "*";
			resultNum = num1 * num2;
		}
		while (sizeof == 3) {
			operator = "/";
			int mod = num1 % num2;
			if (mod == 0 && num2 != 0) {
				resultNum = num1 / num2;
				break;
			} else {
				sizeof = 3;
				num1 = random.nextInt(9) + 1;
				num2 = random.nextInt(9) + 1;
				continue;
			}
		}
		return num1 + operator + num2;
	}

	public static void main(String[] args) {
		MathTeacher mathTeacher = new MathTeacher();
		mathTeacher.myButton.addActionListener(mathTeacher);
	}

	

}

