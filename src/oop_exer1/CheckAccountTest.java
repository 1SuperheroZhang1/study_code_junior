package oop_exer1;
/*
 * 写一个用户程序测试CheckAccount类
 * 在用户程序中，创建一个账户为1122，余额为20000，年利率为4.5%,可透支限额为5000元的CheckAccount对象。
 * 使用withdraw方法提款5000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 * 使用deposit方法存款3000元，并打印账户余额和可透支额。
 * */
public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount check=new CheckAccount(1122,20000,0.045,5000);
		
		check.withdraw(5000);
		System.out.println("您的帐户余额为:"+check.getBalance());
		System.out.println("您的可透支余额为:"+check.getOverdraft());
		check.withdraw(18000);
		System.out.println("您的帐户余额为:"+check.getBalance());
		System.out.println("您的可透支余额为:"+check.getOverdraft());
		
		check.deposit(3000);
		System.out.println("您的帐户余额为:"+check.getBalance());
		System.out.println("您的可透支余额为:"+check.getOverdraft());
	}
}
