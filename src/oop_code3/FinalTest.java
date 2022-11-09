package oop_code3;
/*
 * final:最终的
 * 1. final可以用来修饰的结构: 类、方法、变量。
 * 2. final用来修饰一个类:此类不能被其他类继承。
 *  		比如: String类、System类、StringBuffer类
 * 
 * 3. final用来修饰方法: 表明此方法不可以被重写
 * 			比如: Object类中的getClass()方法
 * 4.final用来修饰变量: 此时的"变量"就称为是一个常量
 * 		4.1 final修饰属性: 可以考虑赋值的位置有: 显式初始化、代码块初始化、构造器中初始化
 * 		4.2 final修饰局部变量:
 * 				尤其是使用final修饰形参时，表明此形参是一个常量。
 *              当我们调用此方法时，给常量形参赋一个实参，
 *              一旦赋值以后，就只能在方法体内进行使用此形参，但不能进行重新赋值。
 *              
 *  static final 可以修饰:修饰属性(全局常量)、修饰方法
 * */
public class FinalTest {
	final int WIDTH=10;
	final int LEFT;
	final int RIGHT;
//	final int DOWN;
	{
		LEFT=1;//final修饰的属性可以在代码块中赋值
	}
	public FinalTest(){
		RIGHT=2;//final修饰的属性可以在构造器中初始化
	}
	public FinalTest(int n){
		RIGHT=n;
	}
	public void show() {
		final int NUM=10;//常量
//		NUM+=20;//The final local variable NUM cannot be assigned. It must be blank and not using a compound assignment
	}
	public void show(final int num) {
//		num=20;//编译不通过
		System.out.println(num);
	}
//	public void doWidth() {
//		width=20;//The final field FinalTest.width cannot be assigned
//	}
//	public void setDown(int down) {
//		this.DOWN=down;
//	}
	public static void main(String[] args) {
		int num=10;
		num=num+5;
		
		FinalTest test=new FinalTest();
//		test.setDown(4);
		test.show(10);
	}
}
final class FinalA{
	
}
//class B extends FinalA{//The type B cannot subclass the final class FinalA
//	
//}
//class C extends String{//The type C cannot subclass the final class String
//	
//}
class AA{
	public final void show() {
		
	}
}
class BB extends AA{
//	public void show() {//Cannot override the final method from AA
//			
//	}
}