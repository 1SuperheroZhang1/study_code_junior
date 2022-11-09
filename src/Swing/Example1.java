package Swing;

/*
 * 在项目中创建Example1类，该类继承JFrame类成为窗体类，在该类中创建标签组件，并添加到窗体界面中。
 * */
import java.awt.Color;
import java.awt.Container;//导入awt包

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;//导入swing包


public class Example1 extends JFrame{ //定义一个类继承JFrame类
	public void CreateJFrame(String title) { //定义一个CreateJFrame()方法
		JFrame jf=new JFrame(title);//实例化一个JFrame对象
		Container container=jf.getContentPane();//获取一个容器
		JLabel jl=new JLabel("这是一个JFrame窗体");//创建一个JLabel标签
		jl.setHorizontalAlignment(SwingConstants.CENTER);//使标签上的文字居中
		
		container.add(jl);//将标签添加到容器中
		container.setBackground(Color.white);//设置容器的背景颜色
		jf.setVisible(true);//使窗体可见
		jf.setSize(200,150);//设置窗体大小
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置窗体关闭方式
	}
	
	public static void main(String[] args) {
		new Example1().CreateJFrame("创建一个JFrame窗体");//在主方法中调用CreateJFrame()方法
	}
}
