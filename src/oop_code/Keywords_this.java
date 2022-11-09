package oop_code;
/*
 * this关键字的使用
 * 1.this可以用来修饰、调用:属性、方法、构造器
 * 2.this修饰属性和方法:
 * 	this理解为:当前对象 或 当前正在创建的对象
 *  2.1 在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象的属性和方法。
 *  但是，通常情况下，我们都选择省略"this."。
 *  特殊情况下，如果方法的形参和类的属性同名时，我们必须显示的使用"this.变量"的方式，
 *  表明此变量是属性，而非形参。
 *  2.2 在类的构造器中，我们可以使用"this.属性"或"this.方法"的方式，调用当前正在创建的对象的属性和方法。
 *  但是，通常情况下，我们都选择省略"this."。
 *  特殊情况下，如果方法的形参和类的属性同名时，我们必须显示的使用"this.变量"的方式，
 *  表明此变量是属性，而非形参。
 *  2.3 this调用构造器
 *   ①我们在类的构造器中，可以显式的使用"this(形参列表)"的方式，调用本类中的其他构造器。
 *   ②构造器中，不能使用"this(形参列表)"的方式调用自己。
 *   ③如果一个类中有n个构造器，最多有n-1个构造器中使用了"this(形参列表)"。
 *   ④规定:"this(形参列表)"必须声明在当前构造器的首行
 *   ⑤构造器内部:最多只能声明一个"this(形参列表)"，用来调用其他构造器
 * */
public class Keywords_this {
	public static void main(String[] name) {
		Person___ p1=new Person___();
		p1.setAge(1);
		System.out.println(p1.getAge());
		p1.eat();
		System.out.println();
		
		Person___ p2=new Person___("Jerry",21);
	}
}
class Person___{
	private String name;
	private int age;
	
	public Person___() {
		//this.eat();
		String info="Person___初始化时，需要考虑如下的1，2，3，4...(共有40行代码)";
		System.out.println(info);
		//Person___初始化时，需要考虑如下的1，2，3，4...(共有40行代码)
	}
	public Person___(String name) {
		this();
		this.name=name;
		//Person___初始化时，需要考虑如下的1，2，3，4...(共有40行代码)
	}
	public Person___(int age) {
		this();
		this.age=age;
		//Person___初始化时，需要考虑如下的1，2，3，4...(共有40行代码)
	}
	public Person___(String name,int age) {
		this(age);
		this.name=name;
		this.age=age;
		//Person___初始化时，需要考虑如下的1，2，3，4...(共有40行代码)
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void eat() {
		System.out.println("人吃饭");
		this.study();
	}
	public void study() {
		System.out.println("人学习");
	}
	
}