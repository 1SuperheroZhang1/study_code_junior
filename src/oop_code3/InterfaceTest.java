package oop_code3;
/*
 * 接口的使用
 * 1.接口使用interface来定义。
 * 2.在Java中，类和接口是并列的两个结构。
 * 3.如何定义接口: 定义接口中的成员
 * 		3.1 JDK7及以前: 只能定义全局常量和抽象方法
 * 			>全局常量: public static final的,但是书写时，可以省略不写。
 * 			>抽象方法: public abstract的
 * 		3.2 JDK8 :除了定义静态方法和抽象方法之外，还可以定义静态方法、默认方法。
 * 
 * 
 * 4. 接口中是不能定义构造器的！意味着接口不能被实例化
 * 5. Java开发中，接口通过让类去实现(implements)的方式来使用
 * 		如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化。
 * 		如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类。
 * 
 * 6. Java类可以实现多个接口 --->弥补了Java单继承性的局限性
 * 		格式: class AA extends BB implement CC,DD,EE...
 * 7. 接口与接口之间可以继承，而且可以多继承。
 ***********************************
 * 8. 接口的具体使用:体现多态性
 * 9. 接口，实际上可以看作一种规范。
 * 
 * 接口的应用
 * 1. 代理模式
 * 		代理模式是Java开发中使用较多的一种模式，
 * 		代理设计就是为其他对象提供一种代理以控制对这个对象的访问。
 * 2. 工厂模式
 * 		实现了创建者与调用者的分离，即将创建对象的具体过程隔离起来，达到提高灵活性的目的。
 *   面试题: 抽象类和接口有哪些异同？
 *   	相同点:  ①都不能实例化
 *   			 ②都可以被继承
 *   			 ③都可以定义抽象方法
 *   	不同点: ①抽象类: 有构造器  接口: 不能声明构造器。
 *   		    ②类: 单继承性，接口: 多继承性。
 *   			③类与接口: 多实现
 *   
 *  面向接口编程: 
 *  	我们在应用程序中，调用的结构都是JDBC中定义的接口，不会出现某一个数据库具体厂商的API
 * */
public class InterfaceTest{
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
//		Flyable.MIN_SPEED=2;//The final field Flyable.MIN_SPEED cannot be assigned
		
		Plane plane =new Plane();
		plane.fly();
	}
}
class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("通过引擎起飞");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("驾驶员减速停止！");
	}
	
}
abstract class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
}
interface Flyable{
	//全局常量
	public static final int MAX_SPEED=7900;//第一宇宙速度
    int MIN_SPEED=1;//省略了 public static final
    
    //抽象方法
    public abstract void fly();
    void stop();//省略了 public abstract
    //Interfaces cannot have constructors
//    public Flyable() {
//    	
//    }
    
}
interface Attackable{
	void attack();
}
class Bullet extends Object implements Flyable,Attackable,CC{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}
//********************************
interface AA_{
	void method1();
}
interface BB_{
	void method2();
}
interface CC extends AA_,BB_{
	
}