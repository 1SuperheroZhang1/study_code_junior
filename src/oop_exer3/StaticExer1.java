package oop_exer3;
/*
 * ��дһ����ʵ�������˻��ĸ���: ������������"�˺�","����","������","����","��С���"��
 * �����װ��Щ���Եķ������˻�Ҫ�Զ�����
 * 		��д���࣬ʹ�������˻��࣬���롢���3��������������Ϣ��
 * 		������Щ���Կ�������Ϊstatic���͵�
 * */
public class StaticExer1 {
	public static void main(String[] args) {
		Account a1=new Account();
		Account a2=new Account("qwerty",2000);
		
		Account.setMinMoney(100);
		Account.setInterestRate(0.012);
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.getInterestRate());
		System.out.println(a1.getMinMoney());
		
	}
}
class Account{
	private int id;
	private String pwd;
	private int balance;
	
	private static double interestRate;
	private static double minMoney;
	private static int init=1001;//�����Զ�����idʹ��
	public Account() {
		id=init++;
	}
	public Account(String pwd, int balance) {
		id=init++;
		this.pwd = pwd;
		this.balance = balance;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getBalance() {
		return balance;
	}
	
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}
	public static double getMinMoney() {
		return minMoney;
	}
	public static void setMinMoney(double minMoney) {
		Account.minMoney = minMoney;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", balance=" + balance + "]";
	}
	
	
}
