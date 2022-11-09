package oop_code1;
/*
 * super关键字的使用:
 * 1.super理解为: 父类的
 * 2.super可以用来调用: 属性、方法、构造器
 * 
 * 3.super的使用：调用属性和方法
 * 		3.1 我们可以在子类的方法或构造器中，通过使用"super.属性"或"super.方法"，显示的
 *          调用父类中声明的属性、方法。但是，通常情况下，我们习惯省略"super."
 *      3.2 特殊情况: 当子类和父类中定义了同名的属性时，我们要想在子类中调用父类中声明的属性，
 *                    则必须显式地使用"super.属性"的方式，表明使用的是父类中声明的属性。
 *      3.3 特殊情况: 当子类重写了父类的方法以后，我们想要在子类中调用父类中被重写的方法时，
 *                    则必须显式地声明"super.方法"的方式，表明调用的是父类中被重写的方法。
 * 4.super调用构造器
 *      4.1 我们可以在子类的构造器中显示的使用"super(形参列表)"的方式，调用父类中声明的指定的构造器
 *      4.2 "super(形参列表)"的使用，必须声明在子类构造器的首行。
 *      4.3 我们在类的构造器中，针对于"this(形参列表)"或"super(形参列表)"只能二选一，不能同时出现
 *      4.4 在构造器的首行，没有声明"this(形参列表)"或"super(形参列表)"，则默认调用的是父类中空参的构造器:super()
 *      4.5 在类的多个构造器中，至少有一个类的构造器使用了"super(形参列表)"，调用父类的构造器
 * */
public class SuperTest {
	public static void main(String[] args) {
		_Student_ student=new _Student_();
		student.show();
		student.study();
		
		_Student_ s1=new _Student_("Tom",21,"IT");
		s1.show();
		System.out.println("*********************************");
		_Student_ s2=new _Student_();
	}
}
class __Person_{
	String name;
	int age;
	int id=1001;//身份证号
	
	public __Person_() {
		System.out.println("我无处不在！");
	}

	public __Person_(int age) {
		super();
		this.age = age;
	}

	public __Person_(String name, int age) {
		this(age);
		this.name = name;
	}
	public void eat() {
		System.out.println("人:吃饭");
	}
	public void walk() {
		System.out.println("人:走路");
	}
	
}
class _Student_ extends __Person_{

	String major;
	int id=1002;//学号
	
	public _Student_(){
		
	}

	public _Student_(int age, String major) {
		super();
		this.major = major;
	}
	
	public _Student_(String name,int age,String major) {
		super(name,age);
		this.major=major;
	}
	public void eat() {
		System.out.println("学生:多吃有营养的食物");
	}
	public void study() {
			System.out.println("学生:学习知识");
			this.eat();
			super.eat();
			super.walk();
	}
	public void show() {
		System.out.println("name="+this.name+",age="+super.age);
		System.out.println("id="+this.id);
		System.out.println("id="+super.id);
	}
}
