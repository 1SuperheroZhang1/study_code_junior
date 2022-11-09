package oop_exer1;

public class Account {
	private int id;//�˺�
	private double balance;//���
	private double annualInterestRate;//������
	
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//����������
	public double getMonthlyInterest() {
		return annualInterestRate/12;
	}
	//ȡǮ
	public void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("���㣬ȡ��ʧ�ܣ�");
		}else {
			balance-=amount;
			//System.out.println("ȡ��ɹ���");
		}
	}
	//��Ǯ
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		}
	}
	
	
}
