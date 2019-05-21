package Task1;

import java.awt.event.*;
import java.util.Random;
import java.util.regex.Pattern;

import javax.swing.*;


/**
 * Title      : MathTeacher.java
 * Description: This class contains the method and GUI of MathTeacher.
 * Copyright  : Copyright (c) 2018
 * @author      Yiwen Zhan
 * @version     1.0
 */

public class MathTeacher implements ActionListener, KeyListener{

    // Declaration of instance variables and components of GUI.
    public int resultNum;
    JFrame myFrame =new JFrame();
    JButton myButton = new JButton("Press for answer");
    JTextField myTextField= new JTextField(3);
    JLabel myLabel = new JLabel("Question:"+questions(), JLabel.LEFT);
    JLabel myLabel2 = new JLabel();
    
    /**
     *  Constructor
     */
    public MathTeacher() {
    	myFrame.setLayout(null);
    	myFrame.setBounds(400, 400, 500, 300);
    	myButton.setBounds(20, 100, 150, 50);
    	myTextField.setBounds(20, 30, 150, 50);
    	myLabel.setBounds(200, 30, 250, 50);
    	myLabel2.setBounds(200, 100, 250, 50);
    	myFrame.add(myTextField);
    	myFrame.add(myLabel);
    	myFrame.add(myButton);
    	myFrame.add(myLabel2);
    	

      
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        myFrame.setVisible(true);
        myFrame.setTitle("MathTeacher");
        
        

		

    }
    
    /** This is event handler method for the program. It makes sure the input is valid.  
     * @param ActionEvent e
     */	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (myTextField.getText().length() == 0 ) {
		}
		else if (isNumeric(myTextField.getText())){
			
			int getNum= Integer.parseInt(myTextField.getText());
			if (this.resultNum == getNum ) {
				myLabel2.setText("Right!");
	
				myButton.setText("Press for answer");
				myLabel.setText("Question:"+questions());
			}
			else {
				myLabel2.setText("Wrong!The right answer is "+resultNum);
				myLabel.setText("Question:"+questions());
				
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
	    int num1 = random.nextInt(9)+1;  
	    int num2 = random.nextInt(9)+1;  
		int sizeof = random.nextInt(4);  
		String operator = ""; 
		//add
		if (sizeof == 0){ 
        	operator = "+";  
            resultNum = num1 + num2;
            }
		//subtract
		if (sizeof == 1){   
            operator = "-";
            resultNum = num1 - num2;
//            if(resultNum<0) {
//            	sizeof = 1;
//            	num1 = random.nextInt(9)+1;  
//        	    num2 = random.nextInt(9)+1;  
//            	continue;
//            	}
//            else {
//            	resultNum = num1 - num2;
//            	break;
//            }
		}
        //multiplication 	 
		if (sizeof == 2){    
        	operator = "*";  
            resultNum = num1 * num2; 
		}
		//division
		while (sizeof == 3){     
        	operator = "/";  
        	int mod = num1%num2;
            if(mod == 0 && num2!=0){
            	resultNum = num1 / num2;
            	break;
            }
            else {
            	sizeof = 3;
            	num1 = random.nextInt(9)+1;  
        	    num2 = random.nextInt(9)+1; 
            	continue;
            }
		}
		return num1+operator+num2;
	}

	public static void main(String[] args) {
		MathTeacher mathTeacher = new MathTeacher();
		mathTeacher.myButton.addActionListener(mathTeacher);
		mathTeacher.myTextField.addKeyListener(mathTeacher);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		 
		 String old = myTextField.getText();
		 
		 if (!old.equals("")) {
			 String firsts = old.substring(0,1);
			 if(firsts.equals("-")) {
				 old = old.substring(1, old.length());
			 }
			 //Exception handling
			 if (!old.equals("")) {
				 
				 String firstsec = old.substring(0,1);
				 if(!firstsec.equals("")) {
					 try {
						 int answer = Integer.parseInt(old);
						 if (answer > 100)
							 myLabel2.setText("Please input an integer between -9 and 100!");
					 } catch (NumberFormatException e1) {
						 myLabel2.setText("Please input an integer!"); 
					 }
					 
				 }
			 }
				
		 }
	}
}
