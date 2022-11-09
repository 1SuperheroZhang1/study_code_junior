package oop_code;
/* 面向对象的特征之一:封装性 - 封装与隐藏
 * 一、问题的引入
 *  当我们创建一个类的对象后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值，
 *  这里，赋值操作要受到属性的数据结构和存储范围的制约。除此之外，没有其他制约条件。
 *  但是，在实际问题中，我们往往需要给属性赋值，加入额外的限制条件。
 *  这个条件就不能在属性声明时体现，我们只能通过方法进行限制条件的添加。(比如: set/get方法)
 *  同时，我们需要避免用户再使用 "对象.属性"的方式对属性进行赋值，则需要将属性声明为私有的(private)
 *  ---> 此时，针对于属性，就体现了类的封装性
 * 二、封装性的体现
 *  1.我们将类的属性私有化(private),同时，提供公共(public)的方法获取(getXxx)和设置(setXxx)该属性的值
 *  2.不对外暴露私有的方法
 *  3.单例模式...(将构造器私有化)
 * 三、封装性的体现，需要权限修饰符来配合。
 * 	1.Java规定的4种权限修饰符(从小到大): private、default(缺省)、protected、public
 *     修饰符	类内部		同一个包			不同包的子类			同一个工程
 *     private   Yes
 *     缺省		 Yes         Yes
 *     protected Yes         Yes                Yes         
 *     public    Yes         Yes                Yes               Yes
 *  2. 4种权限修饰符可以用来修饰类及类的内部结构: 属性、方法、构造器、内部类
 *  3. 具体的: 4种权限都可以用来修饰类的内部结构: 属性、方法、构造器、内部类
 *             修饰类的话，只能用缺省、public 
 *   总结封装性:Java提供了4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用的时的可见性的大小。
 * */
public class EncapsulationTest {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.name="大黄";
		//a.age=1;
		//a.legs=4;//The field Animal.legs is not visible
		
		a.show();
		a.setLegs(6);
		a.show();
	}
}
class Animal{
	String name;
	private int age;
	private int legs;//腿的个数
	//对属性的设置
	public void setLegs(int l) {
		if(l>=0&&l%2==0) {
			legs=l;
		}else {
			legs=l;
		}
	}
	//对属性的获取
	public int getLegs() {
		return legs;
	}
	public void eat() {
		System.out.println("动物进食！");
	}
	public void show() {
		System.out.println("name="+name+",age="+age+",legs="+legs);
	}
	//提供关于age的set和get属性
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
}
