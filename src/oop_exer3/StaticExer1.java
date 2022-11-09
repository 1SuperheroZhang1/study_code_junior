package oop_exer3;
/*
 * 编写一个类实现银行账户的概念: 包含的属性有"账号","密码","存款余额","利率","最小余额"，
 * 定义封装这些属性的方法。账户要自动生成
 * 		编写主类，使用银行账户类，输入、输出3个储户的以上信息。
 * 		考虑哪些属性可以设置为static类型的
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
	private static int init=1001;//用于自动生成id使用
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
