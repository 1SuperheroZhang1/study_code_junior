package oop_code3;

public class SingletonTest3 {
	public static void main(String[] args) {
		Bank_ b1 = Bank_.instance;
//		Bank_.instance=null;
		Bank_ b2 = Bank_.instance;
		System.out.println(b1==b2);
	}
}
class Bank_{
	//1.私有化类的构造器
	private Bank_() {
		
	}
	public static final Bank_ instance=new Bank_();

}