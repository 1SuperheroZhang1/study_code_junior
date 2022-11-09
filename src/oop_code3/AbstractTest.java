package oop_code3;
/*
 * abstract关键字的使用
 * 1. abstract:抽象的
 * 2. abstract可以修饰的结构:类、方法
 * 
 * 3. abstract修饰类:抽象类
 * 		> 此类不能实例化
 * 		> 抽象类中一定有构造器，便于子类实例化调用(涉及: 子类对象实例化的全过程)
 * 		> 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作。 --->抽象的使用前提: 继承性
 * 
 * 4. abstract修饰方法:抽象方法
 * 		> 抽象方法只有方法的声明，没有方法体。
 * 		> 包含抽象方法的类，一定是抽象类。反之，抽象类中可以没有抽象方法。
 * 		> 若子类重写了父类中所有的抽象方法后，此子类方可实例化。
 * 		  若子类没有重写父类中的所有抽象方法，则此子类也是一个抽象类，需要用abstract修饰
 * 5. 抽象类的应用
 * 		抽象类是用来模型化那些父类无法确定实现，而是由其子类提供具体实现的对象的类。
 * 
 * abstract使用上的注意点:
 * 1. abstract不能用来修饰: 属性、构造器等结构
 * 
 * 2. abstract不能用来修饰: 私有方法、静态方法、final的方法、final的类。
 * */
public class AbstractTest {
	public static void main(String[] args) {
		//一旦Person类被abstract修饰，不可被实例化
//		_Person_ p1=new _Person_();//Cannot instantiate the type _Person_
//		p1.eat();
	}
}
abstract class Creature{
	public abstract void breath();
}
abstract class _Person_ extends Creature{
	String name;
	int age;
	
	public _Person_() {
		
	}
	public _Person_(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//不是抽象方法
//	public void eat() {
//		 
//	}
	//抽象方法
	public abstract void eat();
	
	public void walk() {
		System.out.println("人走路");
	}
}
class Student extends _Person_{
	public Student(String name,int age) {
		super(name,age);
	}
	public Student() {
		
	}
	//重写抽象类中的抽象方法
	public void eat() {
		System.out.println("学生应该多吃有营养的食物");
	}
	@Override
	public void breath() {
		System.out.println("学生应该呼吸新鲜的没有雾霾的空气");
		
	}
}