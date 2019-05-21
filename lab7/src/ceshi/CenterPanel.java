package ceshi;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class CenterPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new myFrame(300,300,400,300,Color.BLUE);
		
		
	}
}

class myFrame extends Frame{
	private Panel p;
	public myFrame(int x,int y, int w, int h, Color c) {
		super("FrameWithPanel");
		setLayout(null);
		setBounds(x,y,w,h);
		setBackground(c);
		p = new Panel(null);
		p.setBounds(w/4,h/4,w/2,h/2);
		
		p.setBackground(Color.YELLOW);
		add(p);
		setVisible(true);
	}

}
