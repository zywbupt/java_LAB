package ceshi;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NotePadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyFrame extends JFrame{
	private JTextArea tv_area = null;
	public MyFrame(String title) {
		super(title);
	}
	//初始化相关组件
	private void init() {
		tv_area = new JTextArea();
		
	}
	//给相关控件设置事件监听器
	private void registerListener() {
		
	}
}
