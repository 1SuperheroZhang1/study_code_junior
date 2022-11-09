package oop_exer1;

import oop_exer.Account;

public class CheckAccount extends Account {

	private double overdraft;//可透支限额
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
		this.overdraft=overdraft;
	}
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
		//取钱
		public void withdraw(double amount) {
			if(amount<getBalance()) {//余额足够消费
				//方式一
//				setBalance(getBalance()-amount);
				//方式二
				super.withdraw(amount);
			}else if(overdraft>=amount-getBalance()) {//透支额度+余额足够消费
				overdraft-=(amount-getBalance());
				//
				setBalance(0);
				//或
				super.withdraw(getBalance());
			}else {
				System.out.println("超过可透支限额！");
			}
		}

}
