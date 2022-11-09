package oop_code;
/* 类的结构之三: 构造器(构造方法)(constructor)的使用
 * construct:建设、建造  construction:CCB  constructor:建设者
 * 一、构造器的作用:
 *  1.创建对象
 *  2.初始化对象的属性
 * 二、说明
 * 1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器。
 * 2.定义构造器的个数: 权限修饰符 构造器名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此称为重载。
 * 4.一旦我们显示的定义了类的构造器之后，系统就不再提供默认的空参构造器。
 * 5.一个类中，至少要有一个构造器。
 * */
public class ConstructorTest {
	public static void main(String[] args) {
		//创建类的对象:new +构造器
		Person__ p1=new Person__();
		
		p1.eat();
		Person__ p2=new Person__("Tom");
	}
}
class Person__{
	//属性
	String name;
	int age;
	//构造器
	public Person__() {
		System.out.println("Person__()...");
	}
	public Person__(String n) {
		name=n;
	}
	public Person__(String n,int a) {
		name=n;
		age=a;
	}
	//方法
	public void eat() {
		System.out.println("人吃饭");
	}
	public void study() {
		System.out.println("人可以学习");
	}
}
