package oop_code2;

import com.sun.jdi.connect.spi.Connection;

/*
 * ��̬�Ե�ʹ�þ���һ:
 * */
public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest test=new AnimalTest();
		test.func(new Dog());
		
		test.func(new Cat());
	}
	
	public void func(Animal animal) {//Animal animal=new Dog();
		animal.eat();
		animal.shout();
		
		if(animal instanceof Dog) {
			Dog d=(Dog)animal;
			d.watchDoor();
		}
	}
	//
//	public void func(Dog dog) {
//		dog.eat();
//		dog.shout();
//	}
//	public void func(Cat cat) {
//		cat.eat();
//		cat.shout();
//	}
}
class Animal{
	
	public void eat() {
		System.out.println("����: ��ʳ");
	}
	public void shout() {
		System.out.println("����: ��");
	}
}
class Dog extends Animal{
	
	public void eat() {
		System.out.println("���Թ�ͷ");
	}
	public void shout() {
		System.out.println("������������");
	}
	public void watchDoor() {
		System.out.println("����");
	}
}
class Cat extends Animal{
	
	public void eat() {
		System.out.println("è����");
	}
	public void shout() {
		System.out.println("������������");
	}
}
//������:

class Order{
	
	public void method(Object obj) {
		
	}
}
//������:
class Driver{
	
	public void doData(Connection conn) {//conn=new MySOLConnection();
		//�淶�Ĳ���ȥ��������
	}
}
