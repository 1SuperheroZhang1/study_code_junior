package oop_exer1;
/*
 * дһ���û��������CheckAccount��
 * ���û������У�����һ���˻�Ϊ1122�����Ϊ20000��������Ϊ4.5%,��͸֧�޶�Ϊ5000Ԫ��CheckAccount����
 * ʹ��withdraw�������5000Ԫ������ӡ�˻����Ϳ�͸֧�
 * ��ʹ��withdraw�������18000Ԫ������ӡ�˻����Ϳ�͸֧�
 * ʹ��deposit�������3000Ԫ������ӡ�˻����Ϳ�͸֧�
 * */
public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount check=new CheckAccount(1122,20000,0.045,5000);
		
		check.withdraw(5000);
		System.out.println("�����ʻ����Ϊ:"+check.getBalance());
		System.out.println("���Ŀ�͸֧���Ϊ:"+check.getOverdraft());
		check.withdraw(18000);
		System.out.println("�����ʻ����Ϊ:"+check.getBalance());
		System.out.println("���Ŀ�͸֧���Ϊ:"+check.getOverdraft());
		
		check.deposit(3000);
		System.out.println("�����ʻ����Ϊ:"+check.getBalance());
		System.out.println("���Ŀ�͸֧���Ϊ:"+check.getOverdraft());
	}
}
