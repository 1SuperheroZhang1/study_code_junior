package oop_exer;

public class Account {
	private int id;//�˺�
	private double balance;//���
	private double annualInterestRate;//������
	
	public Account(int id,double balance,double annualInterestRate) {
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void withdraw(double amount) {//ȡǮ
		if(balance<amount) {
			System.out.println("���㣬ȡ��ʧ��");
			return;
		}
		balance-=amount;
		System.out.println("�ɹ�ȡ��:"+amount);
	}
	public void deposit(double amount) {//���
		if(amount>0) {
			balance+=amount;
			System.out.println("�ɹ�����:"+amount);
		}
	}
}
