package oop_code3;
/*
 * �������ģʽ:
 * 1. ��ν��ĵ������ģʽ�����ǲ�ȡһ���ķ�������֤���������ϵͳ�У���ĳ����ֻ�ܴ���һ������ʵ����
 * 2. ���ʵ��?
 * 		����ʽ VS ����ʽ
 * 3. ���ֶ���ʽ������ʽ
 *    ����ʽ: 
 *    		 ����:�������ʱ�������
 *    		 �ô�:����ʽ���̰߳�ȫ�ġ�
 *    ����ʽ: 
 *    		 �ô�:�ӳٶ���Ĵ�����
 *    		 Ŀǰ��д������:�̲߳���ȫ��
 * */
public class SingletonTest1 {
	public static void main(String[] args) {
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		
		System.out.println(bank1==bank2);//true
		System.out.println(bank1.hashCode());
		System.out.println(bank2.hashCode());
	}
}
//����ʽ
class Bank{
	//1.˽�л���Ĺ�����
	private Bank() {
		
	}
	//2.�ڲ�������Ķ���
	//4.Ҫ��˶���Ҳ��������Ϊ��̬��
	private static Bank instance=new Bank();
	
	//3.�ṩ�����ľ�̬�ķ�����������Ķ���
	public static Bank getInstance() {
		return instance;
	}
}