package oop_exer;

public class Bank_Test {
	public static void main(String[] args) {
		Bank_ bank=new Bank_();
		
		bank.addCustomer("zhang", "san");
		
		bank.getCustomers(0).setAccount(new Account_(2000));
		
		bank.getCustomers(0).getAccount().withdraw(500);
		
		double balance=bank.getCustomers(0).getAccount().getBalance();
		
		System.out.println("客户:"+bank.getCustomers(0).getFirstName()+","+bank.getCustomers(0).getLastName()+"的余额为:"+balance);
		
		System.out.println("***************************");
		bank.addCustomer("wanli", "yang");
		
		System.out.println("银行现在的客户为:"+bank.getNumOfCustomers());
	}
}
