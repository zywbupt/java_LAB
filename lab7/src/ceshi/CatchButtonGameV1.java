package ceshi;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CatchButtonGameV1 implements MouseListener {
	
	public int num = 0;
	JButton [] myButton = new JButton[9];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CatchButtonGameV1 myGui = new CatchButtonGameV1();
		myGui.go();

	}

	public void go() {
		// TODO Auto-generated method stub
		JFrame myFrame = new JFrame("Catch me if you can!");
		myFrame.setLayout(new GridLayout(0, 3));
		
		for (int i=0; i<9; i++) {
			myFrame.add(myButton[i]);
			myButton[i].addMouseListener(this);
		}
		
		num = (int)(Math.random()*9);		
		myButton[num].setText("Click me!");
		myFrame.pack();
		myFrame.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton a = (JButton)e.getSource();
		int num2 = this.num;
		if(a==myButton[num2]) {
			myButton[num2].setText("");
			while(this.num ==num2)
				this.num = (int)(Math.random()*9);
			myButton[this.num].setText("Click me!");
			num2 = this.num;
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
