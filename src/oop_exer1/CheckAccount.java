package oop_exer1;

import oop_exer.Account;

public class CheckAccount extends Account {

	private double overdraft;//��͸֧�޶�
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
		//ȡǮ
		public void withdraw(double amount) {
			if(amount<getBalance()) {//����㹻����
				//��ʽһ
//				setBalance(getBalance()-amount);
				//��ʽ��
				super.withdraw(amount);
			}else if(overdraft>=amount-getBalance()) {//͸֧���+����㹻����
				overdraft-=(amount-getBalance());
				//
				setBalance(0);
				//��
				super.withdraw(getBalance());
			}else {
				System.out.println("������͸֧�޶");
			}
		}

}
