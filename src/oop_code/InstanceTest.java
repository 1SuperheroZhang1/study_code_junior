package oop_code;
/* 
 * һ����⡰��������Զ���
 * 1.��Java���Է����У����Ƕ������ܡ��ṹ��װ�����У�ͨ�����ʵ�����������þ���Ĺ��ܽṹ��
 * 	 >Scanner��String��
 *   >�ļ�:file
 *   >������Դ:URL
 * 2.�漰��Java������ǰ��Html����˵����ݿ⽻��ʱ��ǰ��˵Ľṹ��Java���潻��ʱ��������Ϊ�ࡢ����
 * �����ڴ������˵��
 * 1.���������������͵ı���: ֻ���ܴ洢����ֵ: null ��ֵַ(����������)
 * �����������ʹ��
 * 1.���: ���Ǵ����Ķ���û����ʾ����������Ϊ��������
 * 2.����: ��������ֻ�ܵ���һ��
 * 3.ʹ��: ����
 * */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p=new Phone();
		//p=null;
		System.out.println(p);//study_code.Phone@1175e2db
		p.sendEmail();
		p.playGame();
		
		//��������
//		new Phone().sendEmail();
//		new Phone().playGame();
		new Phone().price=1999;
		new Phone().showPrice();
		//*****************************
		PhoneMall mall=new PhoneMall();
//		mall.show(p);
		//���������ʹ��
		mall.show(new Phone());
	}
}
class PhoneMall{
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}
class Phone{
	double price;//�۸�
	
	public void sendEmail() {
		System.out.println("���ʼ���");
	}
	public void playGame() {
		System.out.println("����Ϸ��");
	}
	public void showPrice() {
		System.out.println("�ֻ��ļ۸�Ϊ:"+price);
	}
}
