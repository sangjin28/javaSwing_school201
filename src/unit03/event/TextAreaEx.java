package unit03.event;

import javax.swing.*;

public class TextAreaEx extends JFrame{
	JLabel lb=new JLabel("입력 후 <Enter>키를 입력하세요");
	JTextField tf=new JTextField(20);
	JTextArea ta=new JTextArea(7,20);
	JScrollPane sp=new JScrollPane(ta);
	TextAreaEx() {
		JPanel p=new JPanel();
		add(p);
		p.add(lb);
		p.add(tf);
		p.add(sp);
		setTitle("텍스트 영역 만들기");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
