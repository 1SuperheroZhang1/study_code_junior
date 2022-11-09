package Swing;

/*
 * ����Ŀ�д���Example1�࣬����̳�JFrame���Ϊ�����࣬�ڸ����д�����ǩ���������ӵ���������С�
 * */
import java.awt.Color;
import java.awt.Container;//����awt��

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;//����swing��


public class Example1 extends JFrame{ //����һ����̳�JFrame��
	public void CreateJFrame(String title) { //����һ��CreateJFrame()����
		JFrame jf=new JFrame(title);//ʵ����һ��JFrame����
		Container container=jf.getContentPane();//��ȡһ������
		JLabel jl=new JLabel("����һ��JFrame����");//����һ��JLabel��ǩ
		jl.setHorizontalAlignment(SwingConstants.CENTER);//ʹ��ǩ�ϵ����־���
		
		container.add(jl);//����ǩ��ӵ�������
		container.setBackground(Color.white);//���������ı�����ɫ
		jf.setVisible(true);//ʹ����ɼ�
		jf.setSize(200,150);//���ô����С
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);//���ô���رշ�ʽ
	}
	
	public static void main(String[] args) {
		new Example1().CreateJFrame("����һ��JFrame����");//���������е���CreateJFrame()����
	}
}
