package Swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/*
 * 在项目中创建MyJDialog类，该类继承JDialog窗体，并在窗口中添加按钮，当用户单击该按钮后，将弹出一个对话框窗体。
 * */
class MyJDialog extends JDialog{//创建新类继承JDialog类
	public MyJDialog(MyFrame frame) {
		//实例化一个JDialog对象，指定对话框的父窗体，窗体标题和类型
		super(frame,"第一个Dialog窗体",true);
		Container container=getContentPane(); //创建一个容器
		container.add(new JLabel("这是一个对话框"));
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
		JLabel jl=new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl=new JButton("弹出对话框");
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
