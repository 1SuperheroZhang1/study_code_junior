package oop_exer1;
/*
 * дһ���û��������Account��
 * ���û������У�����һ���˻�Ϊ1122�����Ϊ20000��������Ϊ4.5%��Account����
 * ʹ��withdraw�������30000Ԫ������ӡ��
 * ��ʹ��withdraw�������2500Ԫ��
 * ʹ��deposit�������3000Ԫ��Ȼ���ӡ���������ʡ�
 * */
public class AccountTest {
	public static void main(String[] args) {
		Account acct=new Account(1122,20000,0.045);
		
		acct.withdraw(30000);
		System.out.println("�����ʻ����Ϊ:"+acct.getBalance());
		
		acct.withdraw(2500);
		System.out.println("�����ʻ����Ϊ:"+acct.getBalance());
		
		acct.deposit(3000);
		System.out.println("���Ϊ:"+acct.getBalance()+"������Ϊ:"+(acct.getMonthlyInterest()*100)+"%");
		
	}
}
