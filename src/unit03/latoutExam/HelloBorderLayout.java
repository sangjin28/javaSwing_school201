package unit03.latoutExam;

import java.awt.*;

import javax.swing.*;


public class HelloBorderLayout extends JFrame{
	HelloBorderLayout() {
		JPanel p=new JPanel();
		add(p);
		p.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		p.add(btn1, BorderLayout.NORTH);
		p.add(btn2, BorderLayout.EAST);
		p.add(btn3, BorderLayout.CENTER);
		p.add(btn4, BorderLayout.WEST);
		p.add(btn5, BorderLayout.SOUTH);
		
		setTitle("보더 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new HelloBorderLayout();
	}

}
