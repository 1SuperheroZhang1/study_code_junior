package oop_code1;
/*
 * 面向对象的特征之二:继承性
 * 一、继承性的好处
 * 1.减少了代码的冗余，提高了代码的复用性。
 * 2.便于功能的扩展。
 * 3.为多态性的使用提供了前提。
 * 
 * 二、继承性的格式 : class A extends B{}
 * 	A: 子类、派生类、subClass
 * 	B: 父类、超类、基类、superClass
 * 
 *  2.1 体现:一旦子类A继承父类B之后，子类A中就获取了父类B中声明的所有的结构、属性、方法
 *       特别地，父类中声明为private的属性和方法，
 *       子类继承父类以后，仍然认为获取了父类中私有的结构。
 *       只是因为封装性的影响，使得子类不能直接调用父类的结构而已。
 *  2.2 子类继承父类以后，子类还可以声明自己特有的属性和方法: 实现功能的拓展。
 *  2.3 子类和父类: 不同于子集和集合的关系。
 *  	extends 延展、扩展
 *  
 *  三、Java中关于继承性的规定:
 *  1. 一个类可以被多个子类继承
 *  2.  Java中类的单继承性: 一个类只能有一个父类.
 *  3. 子父类是相对的概念。
 *  4. 子类直接继承的父类,称为直接父类。间接继承的父类，称为间接父类。
 *  5. 子类继承了父类以后，就获取了直接父类以及所有的间接父类声明的属性和方法。
 *  
 *  四、Object类
 *  1. 如果我们没有显示的声明一个类的父类，则此类继承于java.lang.Object类
 *  2. 所有的java类(除java.lang.Object类之外)，都直接或间接地继承自java.lang.Object类。
 *  3. 意味着所有的Java类都具有java.lang.Object类声明的功能。
 * */
public class ExtendsTest {
	public static void main(String[] args) {
		_Person_ p1=new _Person_();
		p1.age=1;
		p1.eat();
		
		Student s1=new Student();
		s1.age=2;
		s1.study();
		s1.breath();
	}
}
class Creature{
	public void breath() {
		System.out.println("呼吸");
	}
}
class _Person_ extends Creature{
	String name;
	int age;
	
	public _Person_() {
		
	}
	public _Person_(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
}
class Student extends _Person_{
//	String name;
//	int age;
	String major;
	
	public Student() {
		
	}
	public Student(String name,int age,String major){ 
		this.name=name;
		this.age=age;
		this.major=major;
	}
	
//	public void eat() {
//		System.out.println("吃饭");
//	}
//	public void sleep() {
//		System.out.println("睡觉");
//	}
	public void study() {
		System.out.println("学习");
	}
}
