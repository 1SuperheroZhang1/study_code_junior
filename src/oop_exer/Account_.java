package oop_exer;

public class Account_ {
	private double balance;
	
	public Account_(double init_balance) {
		this.balance=init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amt) {//ȡǮ
		if(balance>=amt) {
			balance-=amt;
			System.out.println("ȡǮ�ɹ���");
		}else {
			System.out.println("���㣡");
		}
	}
	public void deposit(double amt) {//��Ǯ
		if(amt>0) {
			balance+=amt;
			System.out.println("��Ǯ�ɹ���");
		}
	}
}
