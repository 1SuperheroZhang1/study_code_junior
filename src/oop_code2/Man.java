package oop_code2;


public class Man extends Person {
//	boolean isSmoking;
//	int id=1002;
	
	public Man() {
		super();
	}
	public Man(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void earnMoney(){
		System.out.println("男人负责赚钱养家");
	}
	public void eat() {
		System.out.println("男人多吃肉，长肌肉");
	}
	public void walk() {
		System.out.println("男人霸气的走路");
	}
}
