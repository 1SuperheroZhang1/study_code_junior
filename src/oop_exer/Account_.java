package oop_exer;

public class Account_ {
	private double balance;
	
	public Account_(double init_balance) {
		this.balance=init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amt) {//取钱
		if(balance>=amt) {
			balance-=amt;
			System.out.println("取钱成功！");
		}else {
			System.out.println("余额不足！");
		}
	}
	public void deposit(double amt) {//存钱
		if(amt>0) {
			balance+=amt;
			System.out.println("存钱成功！");
		}
	}
}
