package lab7;

import java.awt.Frame;
import java.awt.Panel;

@SuppressWarnings("serial")
public class MyFrame extends Frame{
	private Panel p1,p2,p3,p4;
	public MyFrame(String s, int x, int y, int w ,int h) {
		super(s);
		setLayout(null);
		p1 = new Panel(null);
		p2 = new Panel(null);
		p3 = new Panel(null);
		p4 = new Panel(null);
		p1.setBounds(0,0,w/2,h/2);
		p2.setBounds(0,h/2,w/2,h/2);
		p3.setBounds(w/2,0,w/2,h/2);
		p4.setBounds(w/2,h/2,w/2,h/2);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		setBounds(x,y,w,h);
		setVisible(true);
	}

}
