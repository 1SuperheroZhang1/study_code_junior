package Swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/*
 * ����Ŀ�д���MyJDialog�࣬����̳�JDialog���壬���ڴ�������Ӱ�ť�����û������ð�ť�󣬽�����һ���Ի����塣
 * */
class MyJDialog extends JDialog{//��������̳�JDialog��
	public MyJDialog(MyFrame frame) {
		//ʵ����һ��JDialog����ָ���Ի���ĸ����壬������������
		super(frame,"��һ��Dialog����",true);
		Container container=getContentPane(); //����һ������
		container.add(new JLabel("����һ���Ի���"));
		setBounds(120,120,100,100);
	}
}

public class MyFrame extends JFrame{
	public static void main(String[] args) {
		new MyFrame();
	}
	
	public MyFrame() {
		Container container =getContentPane();
		container.setLayout(null);
		JLabel jl=new JLabel("����һ��JFrame����");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl=new JButton("�����Ի���");
		bl.setBounds(10,10,100,21);
		bl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new MyJDialog(MyFrame.this).setVisible(true);
			}
			
		});
		container.add(bl);
	}
}
