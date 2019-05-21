
package lab7;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class CatchButtonGameV2 implements MouseListener {
	
	public int num;
	public int length;
	JButton[] myButton = new JButton[100];

	
	public void go (int length) {
		JFrame myFrame = new JFrame("Catch me if you can！");
	
		myFrame.setLayout(new GridLayout(0, (int)Math.sqrt(length)));
		for (int i =0; i<length; i++) {
			myButton[i] = new JButton();
			myFrame.add(myButton[i]);
			myButton[i].addMouseListener((MouseListener) this);
		}
		this.num=(int)(Math.random()*(int)Math.sqrt(length));
		myButton[this.num].setText("Click me!");
		myFrame.pack();
        myFrame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
        CatchButtonGameV2 buttons=new CatchButtonGameV2();
        int inputNum = Integer.parseInt(args[0]);
        buttons.go(inputNum);
    }

	@Override
	public void mouseClicked(MouseEvent e) {
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
				this.num = (int)(Math.random()*length);
			myButton[this.num].setText("Click me!");
			num2 = this.num;
			   
	        }
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
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
}