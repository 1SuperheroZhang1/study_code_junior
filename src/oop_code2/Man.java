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
		System.out.println("���˸���׬Ǯ����");
	}
	public void eat() {
		System.out.println("���˶���⣬������");
	}
	public void walk() {
		System.out.println("���˰�������·");
	}
}
