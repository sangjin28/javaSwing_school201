package unit03.latoutExam;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPenal extends JFrame{
	public HelloPenal (){
		JPanel p=new JPanel();
		p.setBackground(Color.BLACK);
		add(p);
		
		JButton btn = new JButton("��ư");
		btn.setBackground(Color.cyan);
		JButton btn2 = new JButton("��ư");
		btn2.setBackground(Color.cyan);
		JButton btn3 = new JButton("��ư");
		btn2.setBackground(Color.cyan);
		JButton btn4 = new JButton("��ư");
		btn2.setBackground(Color.cyan);
		JButton btn5 = new JButton("��ư");
		btn2.setBackground(Color.cyan);
		JButton btn6 = new JButton("��ư");
		btn2.setBackground(Color.cyan);
		JButton btn7 = new JButton("��ư");
		btn2.setBackground(Color.cyan);
		
		p.setLayout(new FlowLayout());
		p.add(btn);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		
		setTitle("�÷ο� ���̾ƿ�");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloPenal();
	}
}
