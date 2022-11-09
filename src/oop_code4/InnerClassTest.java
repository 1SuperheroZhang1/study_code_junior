package oop_code4;
/*
 * 类的内部类的成员之五: 内部类
 * 1.Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B就是外部类。
 * 
 * 2.内部类的分类: 成员内部类 VS 局部内部类(方法内、代码块内、构造器内)
 * 
 * 3. 成员内部类:
 * 		一方面，作为外部类的成员:
 * 			> 调用外部类的结构
 * 			> 可以被static修饰
 * 			> 可以被4种不同的权限修饰
 * 
 * 		另一方面，作为内部类:
 * 			> 类内可以定义属性、方法、构造器等。
 * 			> 可以被final修饰，表示此类不能被继承。言外之意，不使用final就可以被继承
 * 			> 可以被abstract修饰，表示此类不能被实例化。
 * 
 * 4. 关注如下的3个问题:
 * 	4.1 如何实例化成员内部类的对象
 * 		4.1.1 实例化静态的成员内部类
 * 				外部类.内部类 对象名=new 外部类.内部类();
 * 		4.1.2 实例化非静态的成员内部类
 * 				外部类.内部类 对象名=new 外部类().new 内部类();
 * 	4.2 如何在成员内部类中区分调用外部类的结构
 * 		4.2.1 调用方法的形参
 * 				对象名.方法名(形参);
 * 		4.2.2 调用内部类的结构
 * 				this.属性名;
 * 		4.2.3 调用外部类的结构
 * 				外部类.this.属性名;
 * 	4.3 开发中局部内部类的使用: 见InnerClassTest1.java
 * 
 * 总结: 成员内部类和局部内部类在编译以后，都会生成对应的字节码文件。
 * 	  格式:	成员内部类:  外部类$内部类名.class
 * 			局部内部类:  外部类$(数字)内部类名.class
 * */
public class InnerClassTest {
	public static void main(String[] args) {
		//创建Dog实例(静态的成员内部类):
		Person.Dog dog=new Person.Dog();
		dog.show();
		//创建Bird实例(非静态的成员内部类):
//		Person.Bird bird=new Person.Bird();//错误的
		Person p=new Person();
		Person.Bird bird=p.new Bird();
		bird.sing();
		System.out.println();
		bird.display("黄鹂");
	}
}
class Person{
	
	String name="小敏";
	int age;
	
	public void eat() {
		System.out.println("人: 吃饭");
	}
	//静态成员内部类
	static class Dog{
		String name;
		int age;
		
		public void show() {
			System.out.println("卡拉是条狗");
//			eat();//Cannot make a static reference to the non-static method eat() from the type Person
			//静态类中不能调用非静态的结构
		}
	}
	//非静态成员内部类
	class Bird{
		String name="杜鹃";
		
		public Bird() {
			
		}
		
		public void sing() {
			System.out.println("我是一只小小小小鸟");
			Person.this.eat();//调用外部类的非静态属性
		}
		
		public void display(String name) {
			System.out.println(name);//方法的形参
			System.out.println(this.name);//内部类的属性
			System.out.println(Person.this.name);//外部类的属性
		}
	}
	//局部内部类
	/*
	 * 在局部内部类的方法中(比如show()) 
	 * 如果调用局部内部类所声明的方法(比如method1())中的局部变量(比如num)的话，
	 * 要求此局部变量声明为final的
	 * 
	 * jdk7及之前的版本: 要求此局部变量显式的声明为final的
	 * jdk8及之后的版本: 可以省略final的声明
	 * */
	public void method1() {
		int num=10;
		//方法内内部类
		class AA{
			public void show() {
//				num=20;
				System.out.println(num);
			}
		}
	}
	
	{
		//代码块内部类
		class BB{
			
		}
	}
	
	public Person() {
		//构造器内部类
		class CC{
			
		}
	}
	
}