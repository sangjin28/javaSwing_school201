package unit03.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{
	JLabel lbId=new JLabel("���̵�",JLabel.CENTER);
	JLabel lbPwd=new JLabel("��й�ȣ",JLabel.CENTER);
	JLabel lbResult=new JLabel("������",JLabel.LEFT);
	
	JButton btnLogin=new JButton("�α���");
	JButton btnCancel=new JButton("���");
	
	JTextField tfId=new JTextField();
	JPasswordField tfPwd=new JPasswordField();
	
	SwingLogin() {
		setLayout(new BorderLayout());
		ImageIcon image=new ImageIcon("images/robot.png");
		JLabel lbLogo=new JLabel(image);
		add(lbLogo, BorderLayout.NORTH);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(0,2));
		add(p, BorderLayout.CENTER);
		p.add(lbId);
		p.add(tfId);
		p.add(lbPwd);
		p.add(tfPwd);
		p.add(btnLogin);
		p.add(btnCancel);
		add(lbResult, BorderLayout.SOUTH);
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		setTitle("�α���");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingLogin();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin) {
			String strId=tfId.getText();
			String strPwd=new String(tfPwd.getPassword());
			if(strId.length()==0)
				lbResult.setText("���̵� �Է��ϼ���");
			else if(strPwd.length()==0)
				lbResult.setText("��й�ȣ�� �Է��ϼ���");
			else
				lbResult.setText(strId+"�� ��й�ȣ�� "+strPwd+"�Դϴ�.");
		}
		else if(e.getSource()==btnCancel) {
			lbResult.setText("����Ͽ����ϴ�");
			tfId.setText("");
			tfPwd.setText("");
		}
	}

}
