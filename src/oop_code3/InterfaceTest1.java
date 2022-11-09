package oop_code3;
/*
 * 3.2 JDK8 :除了定义静态方法和抽象方法之外，还可以定义静态方法、默认方法。
 * 		3.2.1 接口中的默认方法
 * 				>若一个接口中定义了一个默认方法，而另一个接口中也定义了一个同名同参数的方法
 * 				 (不管此方法是否是默认方法)，在实现类同时实现了这两个接口时，会出现--->接口冲突
 * 				>若一个接口中定义了一个默认方法，而父类中也定义了一个同名同参数的非抽象方法，
 *               则不会出现冲突问题。因为此时遵守: 类优先原则。接口中具有相同名称和参数的默认方法被忽略
 * 
 * 
 * */
public class InterfaceTest1 {
	public static void main(String[] args)
	{
		Subclass s=new Subclass();
//		s.method1();//The method method1() is undefined for the type Subclass
//		Subclass.method1();
		//知识点1: 接口中定义的静态方法，只能通过接口来调用。
		CompareA.method1();
		//知识点2: 通过实现类的对象，可以调用接口中定义的默认方法。 
		//         如果实现类重写了接口中的默认方法，调用时，调用的是实现类中重写的默认方法。
		s.method2();
		//知识点3: 如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的默认方法，
		//         那么子类在没有重写此方法的情况下，默认调用的是父类中同名同参数的默认方法。--->类优先原则
		//知识点4: 如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，
		//         那么在实现类没有重写此方法的情况下，报错。  --->接口冲突
		//         这就需要我们必须在实现类中重写此方法。
		s.method3();
	}
}
 interface CompareA {
	//静态方法
	public static void method1() {
		System.out.println("CompareA:北京");
	}
	//默认方法
	public default void method2() {
		System.out.println("CompareA:上海");
	}
	default void method3() {
		System.out.println("CompareA:上海");
	}
}
interface CompareB{
	default void method3() {
		System.out.println("CompareB:上海");
	}
}
class Superclass{
	public void method3() {
		System.out.println("Superclass: 上海");
	}
}
class Subclass extends Superclass implements CompareA,CompareB{
	
	public void method2() {
		System.out.println("Subclass:上海");
	}
	public void method3() {
		System.out.println("Subclass:深圳");
	}
	//知识点5: 如何在子类(实现类)的方法中调用父类、接口中被重写的方法？
	public void MyMethod() {
		method3();//调用自己定义的重写的方法
		super.method3();//调用父类的方法
		//调用接口中定义的默认方法
		CompareA.super.method3();
		CompareB.super.method3();
	}
}